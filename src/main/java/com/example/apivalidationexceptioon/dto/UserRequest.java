package com.example.apivalidationexceptioon.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.*;

@Getter
@AllArgsConstructor(staticName = "build")
public class UserRequest {
    private int userId;
    @NotNull(message = "username shouldn't be null nor blank") @NotBlank
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number")
    private String mobile;
    private String gender;
    @Min(18) @Max(65)
    private int age;
    @NotBlank
    private String nationality;
}
