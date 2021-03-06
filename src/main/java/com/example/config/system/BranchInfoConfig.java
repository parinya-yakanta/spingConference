package com.example.config.system;

import com.example.dao.BranchInfoDao;
import com.example.dao.mysql.BranchInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class BranchInfoConfig {
    @Bean
    @Autowired
    public BranchInfoDao getBranchConfig(DataSource dataSource) {
        return new BranchInfoDaoMysql(dataSource);
    }
}
