package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class TextDto {
        
    @NotNull
    private Long id;
    
    @NotBlank
    private String text;
}
