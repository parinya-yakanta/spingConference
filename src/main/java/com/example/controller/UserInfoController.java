package com.example.controller;

import com.example.dao.UserInfoDao;
import com.example.model.UserModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public UserModel getByUserId(@PathVariable int id) {
        return userInfoDao.getByUserId(id);
    }

    @Operation(summary = "Create users information.")
    @PostMapping(value = "")
    public void create(@RequestBody UserModel userModel) {
        userInfoDao.insert(userModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody UserModel userModel) {
        userInfoDao.update(userModel);
    }

    @DeleteMapping("/{id}")
    public UserModel userModel(@PathVariable int id) {
        return userInfoDao.deleteUserById(id);
    }

}
