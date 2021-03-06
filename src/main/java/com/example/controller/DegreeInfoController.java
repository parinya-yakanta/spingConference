package com.example.controller;

import com.example.dao.DegreeInfoDao;
import com.example.model.DegreeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/degrees")
public class DegreeInfoController {

    private DegreeInfoDao degreeInfoDao;

    @Autowired
    public DegreeInfoController(DegreeInfoDao degreeInfoDao) {
        this.degreeInfoDao = degreeInfoDao;
    }

    @GetMapping("")
    public List<DegreeModel> getAll() {
        return degreeInfoDao.getAll();
    }
}
