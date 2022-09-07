package com.springsecurity.FirstBootSecurity.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonDTO {

    @Getter
    @Setter
    @NotNull(message = "name should not empty")
    @Size(min = 2, max = 100, message = "1 char < name < 101 char")
    private String username;

    @Getter
    @Setter
    @NotNull(message = "year should not empty")
    @Min(value = 1900, message = "more 1900")
    private int yearOfBirth;

    @Getter
    @Setter
    @NotNull(message = "password should not empty")
    private String password;
}
