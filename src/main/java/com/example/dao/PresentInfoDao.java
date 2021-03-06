package com.example.dao;

import com.example.model.PresentModel;

import java.util.List;

public interface PresentInfoDao {
    List<PresentModel> getAll();

    PresentModel getByPresentId(int Id);

    int insert(PresentModel presentModel);

    int update(PresentModel presentModel);

    PresentModel deletePresentById(int id);
}
