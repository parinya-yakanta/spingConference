package com.example.dao;

import com.example.model.PositionModel;

import java.util.List;

public interface PositionInfoDao {
    List<PositionModel> getAll();

    PositionModel getByPositionId(int Id);

    int insert(PositionModel positionModel);

    int update(PositionModel positionModel);

    PositionModel deletePositionById(int id);
}
