package com.example.sbstudy.vo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserBirthdayVO {
    private String name;
    private LocalDate birthday;
}
