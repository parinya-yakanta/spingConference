package com.example.controller.service;

import com.example.model.BranchModel;
import com.example.service.BranchInfoDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/v1/service/branchs")
public class BranchInfoServiceController {

    private BranchInfoDaoService branchInfoDaoService;

    @Autowired
    public BranchInfoServiceController(BranchInfoDaoService branchInfoDaoService) {
        this.branchInfoDaoService = branchInfoDaoService;
    }

    @GetMapping("")
    public List<BranchModel> getServiceBranch() {
        return branchInfoDaoService.getBranchAll();
    }
}
