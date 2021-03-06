package com.example.dao;

import com.example.model.FacultyModel;

import java.util.List;

public interface FacultyInfoDao {
    List<FacultyModel> getAll();

    FacultyModel getByFacultyId(int Id);

    int insert(FacultyModel facultyModel);

    int update(FacultyModel facultyModel);

    FacultyModel deleteFacultyById(int id);
}
