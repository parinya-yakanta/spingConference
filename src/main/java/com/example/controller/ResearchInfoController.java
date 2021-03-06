package com.example.controller;

import com.example.dao.ResearchInfoDao;
import com.example.model.ResearchModel;
import com.example.model.UserModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResearchModel getByResearchId(@PathVariable int id) {
        return researchInfoDao.getByResearchId(id);
    }

    @Operation(summary = "Create researchs information.")
    @PostMapping(value = "")
    public void create(@RequestBody ResearchModel researchModel) {
        researchInfoDao.insert(researchModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody ResearchModel researchModel) {
        researchInfoDao.update(researchModel);
    }

    @DeleteMapping("/{id}")
    public ResearchModel researchModel(@PathVariable int id) {
        return researchInfoDao.deleteResearchById(id);
    }

}
