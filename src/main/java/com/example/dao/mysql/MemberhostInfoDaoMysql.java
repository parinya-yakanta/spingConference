package com.example.dao.mysql;

import com.example.dao.MemberhostInfoDao;
import com.example.model.MemberhostModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberhostInfoDaoMysql implements MemberhostInfoDao {

    private final JdbcTemplate jdbcTemplate;

    public MemberhostInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class MemberhostInfoRowMapper implements RowMapper<MemberhostModel> {
        @Override
        public MemberhostModel mapRow(ResultSet rs_memberhost, int rownumber) throws SQLException {
            return new MemberhostModel(
                    rs_memberhost.getInt("id"),
                    rs_memberhost.getString("name"),
                    rs_memberhost.getString("created_at"),
                    rs_memberhost.getString("updated_at")
            );
        }
    }


    @Override
    public List<MemberhostModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM memberhosts", new MemberhostInfoRowMapper());
    }


    @Override
    public MemberhostModel getByMemberhostId(int Id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM presents WHERE id = ?",
                new MemberhostInfoRowMapper(), Id);
    }



    @Override
    public int insert(MemberhostModel memberhostModel) {
        return jdbcTemplate.update("INSERT INTO memberhosts VALUES (?, ?, ?, ?,)",
                memberhostModel.getId(),
                memberhostModel.getName(),
                memberhostModel.getCreatedAt(),
                memberhostModel.getUpdatedAt()
        );
    }


    @Override
    public int update(MemberhostModel memberhostModel) {
        return jdbcTemplate.update("UPDATE memberhosts" +
                        " SET name = ?," +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                memberhostModel.getName(),
                memberhostModel.getCreatedAt(),
                memberhostModel.getUpdatedAt(),
                memberhostModel.getId()
        );
    }
}
