package com.example.backend.entities.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class UserDto {
  private String username;
  private String email;
  private String accessToken;
  private String refreshToken;
}
