package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.TodoService;
import com.example.demo.dto.TodoDTO;
import com.example.demo.model.TodoEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;




@RestController
@RequestMapping("todo")
public class TodoController {
	@Autowired
	private TodoService service;
	
//tesTodo 메서드 작성
	@GetMapping("/test")
	public ResponseEntity<?> testTodo(){
		String str = service.testService(); // 테스트 서비스 사용
		List<String> list = new ArrayList<>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<?> createTodo(
			@AuthenticationPrincipal String userId,
			@RequestBody TodoDTO dto){
		try {
			//(1) Todo Entity로 변환한다.
			
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			// id를 null로 초기화 한다. 생성 당시에는 id가 없어야 한다.
			entity.setId(null);
			
			//임시 사용자 아이디를 설정해준다. -> 기존 temporary-user가 @authentication에서 넘어온 id로 변환.
			entity.setUserId(userId);
			
			// 서비스를 이용해 ToDo엔티티를 생성한다.
			List<TodoEntity> entities = service.create(entity);
			
			//자바스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
			
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			
			//변환된 TodoDTO 리스틀 이용해 ResponseDTO를 초기화
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			
			//ResponseDTO를 반환한다.
			return ResponseEntity.ok().body(response);
		}
		catch(Exception e) {
			//혹시 예외가 있을 경우 dto대신 error
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
	@GetMapping
	public ResponseEntity<?> retrieveTodoList(
			@AuthenticationPrincipal String userId){
	
		//서비스 메서드의 retrieve() 메서드를 사용해 Todo 리스트를 가져온다.
		List<TodoEntity> entities = service.retrieve(userId);
		
		//자바 스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		
		//변환된 TodoDTO 리스트를 이용해 ResponseDTO를 초기화한다.
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		
		//ResponseDTO를 반환한ㄷ.
		return ResponseEntity.ok().body(response);
		
	}
	
	@PutMapping
	public ResponseEntity<?> updateTodo(@AuthenticationPrincipal String userId,
										@RequestBody TodoDTO dto){
		
		//dto를 entity로 변환한다.
		TodoEntity entity = TodoDTO.toEntity(dto);
		
		//id를 temporaryUserid로 초기화 한다. 
		entity.setUserId(userId);
		
		//서비스를 이용해 entity를 업데이트 한다.
		List<TodoEntity> entities = service.update(entity);
		
		//자바 스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO 리스트로 변환한다.
		List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
		
		//변환된 TodoDTO리스트를 이용해 ResponseDTO를 초기화한다.
		ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		
		//ResponseDTO를 리턴한다.
		return ResponseEntity.ok().body(response);
	}
	@DeleteMapping
	public ResponseEntity<?> deleteTodo(
			@AuthenticationPrincipal String userId,
			@RequestBody TodoDTO dto){
		try {
			
			// todoEntity로 변환한다.
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			// 임시 사용자 아이디를 설정해준다. 
			entity.setUserId(userId);
			
			//서비스를 이요해 entity를 삭제한다
			List<TodoEntity> entities = service.delete(entity);
			
			//자바 스트림을 이용해 리턴된 엔티티 리스트를 TodoDTO로 변환한다
			List<TodoDTO> dtos = entities.stream().map(TodoDTO::new).collect(Collectors.toList());
			
			//변환된 TodoDTO 리스트를 이용해 초기화
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			
			//ResponseDTO리턴
			return ResponseEntity.ok().body(response);
			
		}catch (Exception e) {
			
			//혹시 예외가 있을 경우 dto 대신 error를 넣는다.
			
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.badRequest().body(response);
		}
	}
}
