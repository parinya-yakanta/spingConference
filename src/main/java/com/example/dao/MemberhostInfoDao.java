package com.example.dao;

import com.example.model.MemberhostModel;

import java.util.List;

public interface MemberhostInfoDao {
    List<MemberhostModel> getAll();

    MemberhostModel getByMemberhostId(int Id);

    int insert(MemberhostModel memberhostModel);

    int update(MemberhostModel memberhostModel);
}
