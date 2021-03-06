package com.example.config.system;

import com.example.dao.ResearchInfoDao;
import com.example.dao.mysql.ResearchInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ResearchInfoDaoConfig {

    @Bean
    @Autowired
    public ResearchInfoDao getResearchConfig(DataSource dataSource) {
        return new ResearchInfoDaoMysql(dataSource);
    }
}
