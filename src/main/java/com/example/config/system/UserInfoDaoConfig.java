package com.example.config.system;

import com.example.dao.UserInfoDao;
import com.example.dao.mysql.UserInfoDaoMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class UserInfoDaoConfig {

    @Bean
    @Autowired
    public UserInfoDao getUserInfoDao(DataSource dataSource) {
        return new UserInfoDaoMysql(dataSource);
    }
}
