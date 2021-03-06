package com.example.service.Impl;

import com.example.dao.BranchInfoDao;
import com.example.model.BranchModel;
import com.example.service.BranchInfoDaoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BranchInfoDaoServiceImpl implements BranchInfoDaoService {

    private BranchInfoDao branchInfoDao;

    @Autowired
    public BranchInfoDaoServiceImpl(BranchInfoDao branchInfoDao) {
        this.branchInfoDao = branchInfoDao;
    }

    @Override
    public List<BranchModel> getBranchAll() {
        return branchInfoDao.getAll();
    }

}
