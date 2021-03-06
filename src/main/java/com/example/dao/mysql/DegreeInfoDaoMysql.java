package com.example.dao.mysql;

import com.example.dao.DegreeInfoDao;
import com.example.model.DegreeModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DegreeInfoDaoMysql implements DegreeInfoDao {

    private final JdbcTemplate jdbcTemplate;

    public DegreeInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class DegreeInfoRowMapper implements RowMapper<DegreeModel> {
        @Override
        public DegreeModel mapRow(ResultSet rs_degree, int rownumber) throws SQLException {
            return new DegreeModel(
                    rs_degree.getInt("id"),
                    rs_degree.getString("name"),
                    rs_degree.getString("created_at"),
                    rs_degree.getString("updated_at")
            );
        }
    }

    @Override
    public List<DegreeModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM degrees", new DegreeInfoRowMapper());
    }



    @Override
    public DegreeModel getByDegreeId(int Id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM degrees WHERE id = ?",
                new DegreeInfoRowMapper(), Id);
    }




    @Override
    public int insert(DegreeModel degreeModel) {
        return jdbcTemplate.update("INSERT INTO degrees VALUES (?, ?, ?, ?,)",
                degreeModel.getId(),
                degreeModel.getName(),
                degreeModel.getCreatedAt(),
                degreeModel.getUpdatedAt()
        );
    }



    @Override
    public int update(DegreeModel degreeModel) {
        return jdbcTemplate.update("UPDATE degrees" +
                        " SET name = ?," +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                degreeModel.getName(),
                degreeModel.getCreatedAt(),
                degreeModel.getUpdatedAt(),
                degreeModel.getId()
        );
    }

    @Override
    public DegreeModel deleteDegreeById(int Id) {
        return jdbcTemplate.queryForObject("DELETE FROM degrees WHERE id = ?",
                new DegreeInfoRowMapper(), Id);
    }

}
