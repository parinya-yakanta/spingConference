package com.example.controller;

import com.example.dao.ResearchInfoDao;
import com.example.model.ResearchModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/researchs")
public class ResearchInfoController {

    private ResearchInfoDao researchInfoDao;

    @Autowired
    public ResearchInfoController(ResearchInfoDao researchInfoDao) {
        this.researchInfoDao = researchInfoDao;
    }

    @GetMapping("")
    public List<ResearchModel> getAll() {
        return researchInfoDao.getAll();
    }
}
