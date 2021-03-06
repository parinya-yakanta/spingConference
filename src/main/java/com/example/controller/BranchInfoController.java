package com.example.controller;

import com.example.dao.BranchInfoDao;
import com.example.model.BranchModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
