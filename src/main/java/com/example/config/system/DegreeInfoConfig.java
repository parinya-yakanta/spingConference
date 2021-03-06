package com.example.config.system;

import com.example.dao.DegreeInfoDao;
import com.example.dao.mysql.DegreeInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DegreeInfoConfig {
    @Bean
    @Autowired
    public DegreeInfoDao getDegreeConfig(DataSource dataSource) {
        return new DegreeInfoDaoMysql(dataSource);
    }
}
