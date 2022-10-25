package edu.miu.cs.cs425.eregistrarapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthRequest {
    @NotBlank(message = "Username cannot be null, empty or blank space(s)")
    private String username;
    @NotBlank(message = "Password cannot be null, empty or blank space(s)")
    private String password;
}
