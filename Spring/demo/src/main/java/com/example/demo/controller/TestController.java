package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBodyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable; // 매개변수를 넘겨 받기 위한 방법 
import org.springframework.web.bind.annotation.RequestParam; // ?id={id} 와 같은 형식으로  매개변수가 올때 값을받을 수 있다.

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test") //리소

public class TestController {
	@GetMapping
	public String testController() {
			return "Hello world!!!";
	}
	@GetMapping("/testGetMapping")
	public String testControllerWithPath() {
		return "Hello world!! with GetMapping!";
	}
	@GetMapping("/{id}")
		public String testControllerWithPathVariables(@PathVariable(required=false) int id) { //required=false는 이 매개변수가 꼭 필요하다는 의미는 아니다.매개변수를 입력안해도 오류가 나지 않는다.
			return "Hello world " + id;
	}
	@GetMapping("testRequestParam")
	public String testControllerWithRequestParam(@RequestParam(required=false) int id) {
		return "Hello world" + id; //localhost:8080/test/testRequestParam?id=123으로 변수를 입력받을 수 있다.
	}
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
		return "Hello world ID " + testRequestBodyDTO.getId() + "message" + testRequestBodyDTO.getMessage();
	}
	@GetMapping("/testResponseBody")
	public ResponseDTO<String> testControllerResponseBody(){
		List<String> list = new ArrayList<>();
		list.add("Hello world I'm responseDTO");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return response;
		
	}
	@GetMapping("/testResponseEntity")
	public ResponseEntity<?> testControllerResponseEntity(){
		List<String> list = new ArrayList<>();
		list.add("Hello World I'm ResponseEntitiy And you got 400!");
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		// http status 를 400으로 설정
		return ResponseEntity.badRequest().body(response);
	}
} //브라우저에 localhost:8080/test -> 요청을 하는것 -> Get 요을 하는 것 