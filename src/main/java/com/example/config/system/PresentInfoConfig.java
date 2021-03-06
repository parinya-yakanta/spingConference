package com.example.config.system;

import com.example.dao.PresentInfoDao;
import com.example.dao.mysql.PresentInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PresentInfoConfig {

    @Bean
    @Autowired
    public PresentInfoDao getPresentConfig(DataSource dataSource) {
        return new PresentInfoDaoMysql(dataSource);
    }
}
