package com.example.sbstudy.controller;

import com.example.sbstudy.entity.UserBirthday;
import com.example.sbstudy.vo.UserBirthdayVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalDateController {

    @PostMapping("/userBirthday")
    public UserBirthdayVO userBirthday(@RequestBody UserBirthday userBirthday) throws Exception {
        UserBirthdayVO  userBirthdayVO  = new UserBirthdayVO();
        userBirthdayVO.setName(userBirthday.getName());
        userBirthdayVO.setBirthday(userBirthday.getBirthday());
        return userBirthdayVO;
    }
}
