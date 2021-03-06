package com.example.dao;

import com.example.model.BranchModel;

import java.util.List;

public interface BranchInfoDao {
    List<BranchModel> getAll();

    BranchModel getByBranchId(int Id);

    int insert(BranchModel branchModel);

    int update(BranchModel branchModel);
}
