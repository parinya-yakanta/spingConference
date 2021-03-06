package com.example.dao.mysql;

import com.example.dao.FacultyInfoDao;
import com.example.model.FacultyModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FacultyInfoDaoMysql implements FacultyInfoDao {
    private final JdbcTemplate jdbcTemplate;

    public FacultyInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class FacultyInfoRowMapper implements RowMapper<FacultyModel> {
        @Override
        public FacultyModel mapRow(ResultSet rs_faculty, int rownumber) throws SQLException {
            return new FacultyModel(
                    rs_faculty.getInt("id"),
                    rs_faculty.getString("name"),
                    rs_faculty.getString("created_at"),
                    rs_faculty.getString("updated_at")
            );
        }
    }


    @Override
    public List<FacultyModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM facultys", new FacultyInfoRowMapper());
    }



    @Override
    public FacultyModel getByFacultyId(int Id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM facultys WHERE id = ?",
                new FacultyInfoRowMapper(), Id);
    }




    @Override
    public int insert(FacultyModel facultyModel) {
        return jdbcTemplate.update("INSERT INTO facultys VALUES (?, ?, ?, ?,)",
                facultyModel.getId(),
                facultyModel.getName(),
                facultyModel.getCreatedAt(),
                facultyModel.getUpdatedAt()
        );
    }



    @Override
    public int update(FacultyModel facultyModel) {
        return jdbcTemplate.update("UPDATE facultys" +
                        " SET name = ?," +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                facultyModel.getName(),
                facultyModel.getCreatedAt(),
                facultyModel.getUpdatedAt(),
                facultyModel.getId()
        );
    }

}
