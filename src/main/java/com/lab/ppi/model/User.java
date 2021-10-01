package com.lab.ppi.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class User {

    private Long id;

    @NotNull
    @Size(min = 3, max = 30)
    private String name;

    @Email
    private String email;

}
