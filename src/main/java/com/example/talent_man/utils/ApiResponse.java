package com.example.talent_man.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApiResponse {
    private int status;
    private String message;
}
