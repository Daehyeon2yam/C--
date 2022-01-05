package com.example.demo.dto; //Http 응답으로 사용하는 DTO

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ResponseDTO<T>{
	private String error;
	private List<T> data;  //Todo DTO뿐만 아니라, 다른 모델의 DTO도 리턴할수 있도록 자바 제네릭을 사

}
