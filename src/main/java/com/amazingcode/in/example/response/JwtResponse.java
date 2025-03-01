package com.amazingcode.in.example.response;

import lombok.*;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {
    private String username;
    private String jwtToken;
}
