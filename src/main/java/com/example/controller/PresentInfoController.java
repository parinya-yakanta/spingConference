package com.example.controller;

import com.example.dao.PresentInfoDao;
import com.example.model.PresentModel;
import com.example.model.ResearchModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public PresentModel getByPresentId(@PathVariable int id) {
        return presentInfoDao.getByPresentId(id);
    }

    @Operation(summary = "Create presents information.")
    @PostMapping(value = "")
    public void create(@RequestBody PresentModel presentModel) {
        presentInfoDao.insert(presentModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody PresentModel presentModel) {
        presentInfoDao.update(presentModel);
    }

    @DeleteMapping("/{id}")
    public PresentModel presentModel(@PathVariable int id) {
        return presentInfoDao.deletePresentById(id);
    }
}
