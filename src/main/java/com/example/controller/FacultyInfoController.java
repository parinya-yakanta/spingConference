package com.example.controller;

import com.example.dao.FacultyInfoDao;
import com.example.model.FacultyModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public FacultyModel getByFacultyId(@PathVariable int id) {
        return facultyInfoDao.getByFacultyId(id);
    }

    @Operation(summary = "Create facultys information.")
    @PostMapping(value = "")
    public void create(@RequestBody FacultyModel facultyModel) {
        facultyInfoDao.insert(facultyModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody FacultyModel facultyModel) {
        facultyInfoDao.update(facultyModel);
    }

    @DeleteMapping("/{id}")
    public FacultyModel facultyModel(@PathVariable int id) {
        return facultyInfoDao.deleteFacultyById(id);
    }
}
