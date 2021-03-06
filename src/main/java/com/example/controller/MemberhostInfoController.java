package com.example.controller;

import com.example.dao.MemberhostInfoDao;
import com.example.model.MemberhostModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public MemberhostModel getByMemberhostId(@PathVariable int id) {
        return memberhostInfoDao.getByMemberhostId(id);
    }

    @Operation(summary = "Create memberhosts information.")
    @PostMapping(value = "")
    public void create(@RequestBody MemberhostModel memberhostModel) {
        memberhostInfoDao.insert(memberhostModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody MemberhostModel memberhostModel) {
        memberhostInfoDao.update(memberhostModel);
    }

    @DeleteMapping("/{id}")
    public MemberhostModel memberhostModel(@PathVariable int id) {
        return memberhostInfoDao.deleteMemberhostById(id);
    }

}
