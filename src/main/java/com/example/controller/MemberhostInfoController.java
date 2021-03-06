package com.example.controller;

import com.example.dao.MemberhostInfoDao;
import com.example.model.MemberhostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/memberhosts")
public class MemberhostInfoController {

    private MemberhostInfoDao memberhostInfoDao;

    @Autowired
    public MemberhostInfoController(MemberhostInfoDao memberhostInfoDao) {
        this.memberhostInfoDao = memberhostInfoDao;
    }

    @GetMapping("")
    public List<MemberhostModel> getAll() {
        return memberhostInfoDao.getAll();
    }
}
