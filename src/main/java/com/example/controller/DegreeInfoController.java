package com.example.controller;

import com.example.dao.DegreeInfoDao;
import com.example.model.DegreeModel;
import com.example.model.FacultyModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public DegreeModel getByDegreeId(@PathVariable int id) {
        return degreeInfoDao.getByDegreeId(id);
    }

    @Operation(summary = "Create degrees information.")
    @PostMapping(value = "")
    public void create(@RequestBody DegreeModel degreeModel) {
        degreeInfoDao.insert(degreeModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody DegreeModel degreeModel) {
        degreeInfoDao.update(degreeModel);
    }

    @DeleteMapping("/{id}")
    public DegreeModel degreeModel(@PathVariable int id) {
        return degreeInfoDao.deleteDegreeById(id);
    }
}
