package com.example.demo.dtos;

import com.example.demo.entities.UserEntity;

import lombok.Data;

@Data
public class LoginResponseDTO {
	private String accessToken;
    private String tokenType = "Bearer";
    private String username;

    public LoginResponseDTO(String accessToken, String username) {
        this.accessToken = accessToken;
        this.username = username;
    }
}
