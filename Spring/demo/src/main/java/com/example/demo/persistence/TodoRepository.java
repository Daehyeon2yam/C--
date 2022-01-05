package com.example.demo.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.TodoEntity;


@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
	

	List<TodoEntity> findByUserId(String userId);

	Optional<TodoEntity> findById(String userId);
	

}
