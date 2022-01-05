package com.example.demo.dto;

import lombok.Data;

//requestBody는 보통 반환하고자 하는 리소스가 복잡할 때 사용.
@Data
public class TestRequestBodyDTO {
	private int id;
	private String message;
}
