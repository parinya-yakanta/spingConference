package com.example.controller;

import com.example.dao.UserInfoDao;
import com.example.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserInfoController {

    private UserInfoDao userInfoDao;

    @Autowired
    public UserInfoController(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }

    @GetMapping("")
    public List<UserModel> getAll() {
        return userInfoDao.getAll();
    }

}
