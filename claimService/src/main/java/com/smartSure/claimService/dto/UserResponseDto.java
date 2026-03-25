package com.smartSure.claimService.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
@Schema(name="User Response Dto")
public class UserResponseDto {
	
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Long phone;
	private String role;
}