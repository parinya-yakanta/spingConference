package com.example.dao.mysql;

import com.example.dao.PositionInfoDao;
import com.example.model.PositionModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PositionInfoDaoMysql implements PositionInfoDao {

    private final JdbcTemplate jdbcTemplate;

    public PositionInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class PositionInfoRowMapper implements RowMapper<PositionModel> {
        @Override
        public PositionModel mapRow(ResultSet rs_position, int rownumber) throws SQLException {
            return new PositionModel(
                    rs_position.getInt("id"),
                    rs_position.getString("name"),
                    rs_position.getString("created_at"),
                    rs_position.getString("updated_at")
            );
        }
    }

    @Override
    public List<PositionModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM positions", new PositionInfoRowMapper());
    }


    @Override
    public PositionModel getByPositionId(int Id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM positions WHERE id = ?",
                new PositionInfoRowMapper(), Id);
    }


    @Override
    public int insert(PositionModel positionModel) {
        return jdbcTemplate.update("INSERT INTO positions VALUES (?, ?, ?, ?,)",
                positionModel.getId(),
                positionModel.getName(),
                positionModel.getCreatedAt(),
                positionModel.getUpdatedAt()
        );
    }


    @Override
    public int update(PositionModel positionModel) {
        return jdbcTemplate.update("UPDATE presents" +
                        " SET name = ?," +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                positionModel.getName(),
                positionModel.getCreatedAt(),
                positionModel.getUpdatedAt(),
                positionModel.getId()
        );
    }

}
