package com.example.config.system;

import com.example.dao.FacultyInfoDao;
import com.example.dao.mysql.FacultyInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FacultyInfoConfig {
    @Bean
    @Autowired
    public FacultyInfoDao getFacultyConfig(DataSource dataSource) {
        return new FacultyInfoDaoMysql(dataSource);
    }
}
