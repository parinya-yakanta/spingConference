package com.example.controller;

import com.example.dao.PositionInfoDao;
import com.example.model.PositionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/positions")
public class PositionInfoController {

    private PositionInfoDao positionInfoDao;

    @Autowired
    public PositionInfoController(PositionInfoDao positionInfoDao) {
        this.positionInfoDao = positionInfoDao;
    }

    @GetMapping("")
    public List<PositionModel> getAll() {
        return positionInfoDao.getAll();
    }

}
