package com.example.controller;

import com.example.dao.PresentInfoDao;
import com.example.model.PresentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/presents")
public class PresentInfoController {

    private PresentInfoDao presentInfoDao;

    @Autowired
    public PresentInfoController(PresentInfoDao presentInfoDao) {
        this.presentInfoDao = presentInfoDao;
    }

    @GetMapping("")
    public List<PresentModel> getAll() {
        return presentInfoDao.getAll();
    }
}
