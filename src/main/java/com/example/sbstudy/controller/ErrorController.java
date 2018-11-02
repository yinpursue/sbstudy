package com.example.sbstudy.controller;

import com.example.sbstudy.Exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    @RequestMapping("/hello")
    public String hello() throws MyException {
        throw new MyException("发生错误");
    }
}
