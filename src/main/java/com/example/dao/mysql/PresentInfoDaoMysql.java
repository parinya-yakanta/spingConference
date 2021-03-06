package com.example.dao.mysql;

import com.example.dao.PresentInfoDao;
import com.example.model.PresentModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PresentInfoDaoMysql implements PresentInfoDao {

    private final JdbcTemplate jdbcTemplate;

    public PresentInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class PresentInfoRowMapper implements RowMapper<PresentModel> {
        @Override
        public PresentModel mapRow(ResultSet rs_present, int rownumber) throws SQLException {
            return new PresentModel(
                    rs_present.getInt("id"),
                    rs_present.getString("name"),
                    rs_present.getString("created_at"),
                    rs_present.getString("updated_at")
            );
        }
    }

    @Override
    public List<PresentModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM presents", new PresentInfoRowMapper());
    }


    @Override
    public PresentModel getByPresentId(int Id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM presents WHERE id = ?",
                new PresentInfoRowMapper(), Id);
    }



    @Override
    public int insert(PresentModel presentModel) {
        return jdbcTemplate.update("INSERT INTO presents VALUES (?, ?, ?, ?,)",
                presentModel.getId(),
                presentModel.getName(),
                presentModel.getCreatedAt(),
                presentModel.getUpdatedAt()
        );
    }



    @Override
    public int update(PresentModel presentModel) {
        return jdbcTemplate.update("UPDATE presents" +
                        " SET name = ?," +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                presentModel.getName(),
                presentModel.getCreatedAt(),
                presentModel.getUpdatedAt(),
                presentModel.getId()
        );
    }
}
