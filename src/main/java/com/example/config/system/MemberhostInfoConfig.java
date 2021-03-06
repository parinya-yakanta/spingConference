package com.example.config.system;

import com.example.dao.MemberhostInfoDao;
import com.example.dao.mysql.MemberhostInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MemberhostInfoConfig {
    @Bean
    @Autowired
    public MemberhostInfoDao getMemberhostCinfig(DataSource dataSource) {
        return new MemberhostInfoDaoMysql(dataSource);
    }
}
