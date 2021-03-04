package com.example.dao;

import com.example.model.UserModel;

import java.util.List;

public interface UserInfoDao {
    List<UserModel> getAll();

    UserModel getByUserId(int Id);

    int insert(UserModel userModel);

    int update(UserModel userModel);
}
