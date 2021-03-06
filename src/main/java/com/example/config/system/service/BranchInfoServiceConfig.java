package com.example.config.system.service;

import com.example.dao.BranchInfoDao;
import com.example.service.BranchInfoDaoService;
import com.example.service.Impl.BranchInfoDaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BranchInfoServiceConfig {
    @Bean
    @Autowired
    public BranchInfoDaoService getBranchInfoService(BranchInfoDao branchInfoDao) {
        return new BranchInfoDaoServiceImpl(branchInfoDao);
    }
}
