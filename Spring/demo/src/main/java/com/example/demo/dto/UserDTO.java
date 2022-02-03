package com.example.demo.dto;
//사용자 서비스를 이용해 현재 사용자를 가져오는 기능과 레지스터 기능을 구현 

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private String token;
	private String email;
	private String username;
	private String password;
	private String id;
}
