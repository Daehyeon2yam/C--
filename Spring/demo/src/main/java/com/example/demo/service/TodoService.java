package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.TodoEntity;
import com.example.demo.persistence.TodoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	public String testService() {
		//TodoEntity 생성
		TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
		//TodoEntity 저장
		repository.save(entity);
		//TodoEntity 검색
		TodoEntity saveEntity = repository.findByUserId(entity.getId()).get(0);
		return saveEntity.getTitle();
	}
	public List<TodoEntity> create(final TodoEntity entity){
		//Validations
		validate(entity);
		repository.save(entity);
		
		log.info("Entity Id : {} is saved", entity.getId());
		
		return repository.findByUserId(entity.getUserId());
	}
	private void validate(final TodoEntity entity) {
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		if(entity.getUserId()==null) {
			log.warn("Unknown user.");
			throw new RuntimeException("Unknown user.");
		}
	}
	public List<TodoEntity> retrieve(final String userId){
		return repository.findByUserId(userId);
	}
	public List<TodoEntity> update(final TodoEntity entity){
		//저장할 데이터가 유효한지 확인
		validate(entity);
		
		//넘겨받은 id를 이용해 TodoEntity를 가지고 온다.
		final Optional<TodoEntity> original = repository.findById(entity.getId());
		
		if(original.isPresent()) {
			//반환된 TodoEntity가 존재하면 새 entity 값으로 덮어 씌운다.
			final TodoEntity todo = original.get();
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());
			
			//데이터 베이스에 새로운 값을 저장
			repository.save(todo);
		}
		
		return retrieve(entity.getUserId());
	}
	
	public List<TodoEntity> delete(final TodoEntity entity){
		//저장할 데이터의 유효성 확인
		validate(entity);
		
		try {
			//엔티티를 삭제한다
			repository.delete(entity);
			
		} catch(Exception e) {
			//에외 발생시 id와 exception을 로깅
			
			log.error("error deleting enttity",entity.getId(), e);
			//exception 오브젝트를 리턴한다.
			
			throw new RuntimeException("error deleting enttiy"+ entity.getId());
			
			
		}
		
		return retrieve(entity.getUserId());
		
	}
}
