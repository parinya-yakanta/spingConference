package com.example.config.system;

import com.example.dao.PositionInfoDao;
import com.example.dao.mysql.PositionInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PositionInfoConfig {

    @Bean
    @Autowired
    public PositionInfoDao getPositionConfig(DataSource dataSource) {
        return new PositionInfoDaoMysql(dataSource);
    }
}
