package com.example.dao;

import com.example.model.DegreeModel;

import java.util.List;

public interface DegreeInfoDao {
    List<DegreeModel> getAll();

    DegreeModel getByDegreeId(int Id);

    int insert(DegreeModel degreeModel);

    int update(DegreeModel degreeModel);

    DegreeModel deleteDegreeById(int id);
}
