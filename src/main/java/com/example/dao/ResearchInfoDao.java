package com.example.dao;

import com.example.model.ResearchModel;

import java.util.List;

public interface ResearchInfoDao {
    List<ResearchModel> getAll();

    ResearchModel getByResearchId(int Id);

    int insert(ResearchModel researchModel);

    int update(ResearchModel researchModel);
}
