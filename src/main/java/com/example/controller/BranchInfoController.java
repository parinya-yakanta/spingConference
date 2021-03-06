package com.example.controller;

import com.example.dao.BranchInfoDao;
import com.example.model.BranchModel;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/branchs")
public class BranchInfoController {

    private BranchInfoDao branchInfoDao;

    @Autowired
    public BranchInfoController(BranchInfoDao branchInfoDao) {
        this.branchInfoDao = branchInfoDao;
    }

    @GetMapping("")
    public List<BranchModel> getAll() {
        return branchInfoDao.getAll();
    }

    @GetMapping("/{id}")
    public BranchModel getByBranchId(@PathVariable int id) {
        return branchInfoDao.getByBranchId(id);
    }

    @Operation(summary = "Create branchs information.")
    @PostMapping(value = "")
    public void create(@RequestBody BranchModel branchModel) {
        branchInfoDao.insert(branchModel);
    }

    @PutMapping(value = "")
    public void update(@RequestBody BranchModel branchModel) {
        branchInfoDao.update(branchModel);
    }

    @DeleteMapping("/{id}")
    public BranchModel branchModel(@PathVariable int id) {
        return branchInfoDao.deleteBranchById(id);
    }

}
