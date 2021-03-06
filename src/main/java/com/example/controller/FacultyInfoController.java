package com.example.controller;

import com.example.dao.FacultyInfoDao;
import com.example.model.FacultyModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/facultys")
public class FacultyInfoController {
    private FacultyInfoDao facultyInfoDao;

    public FacultyInfoController(FacultyInfoDao facultyInfoDao) {
        this.facultyInfoDao = facultyInfoDao;
    }

    @GetMapping("")
    public List<FacultyModel> getAll() {
        return facultyInfoDao.getAll();
    }
}
