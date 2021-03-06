package com.example.dao.mysql;

import com.example.dao.BranchInfoDao;
import com.example.model.BranchModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BranchInfoDaoMysql implements BranchInfoDao {
    private final JdbcTemplate jdbcTemplate;

    public BranchInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class BranchInfoRowMapper implements RowMapper<BranchModel> {
        @Override
        public BranchModel mapRow(ResultSet rs_branch, int rownumber) throws SQLException {
            return new BranchModel(
                    rs_branch.getInt("id"),
                    rs_branch.getString("name"),
                    rs_branch.getInt("faculty_id"),
                    rs_branch.getString("created_at"),
                    rs_branch.getString("updated_at")
            );
        }
    }



    @Override
    public List<BranchModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM branchs", new BranchInfoRowMapper());
    }



    @Override
    public BranchModel getByBranchId(int Id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM branchs WHERE id = ?",
                new BranchInfoRowMapper(), Id);
    }




    @Override
    public int insert(BranchModel branchModel) {
        return jdbcTemplate.update("INSERT INTO branchs VALUES (?, ?, ?, ?, ?,)",
                branchModel.getId(),
                branchModel.getName(),
                branchModel.getFacultyId(),
                branchModel.getCreatedAt(),
                branchModel.getUpdatedAt()
        );
    }



    @Override
    public int update(BranchModel branchModel) {
        return jdbcTemplate.update("UPDATE branchs" +
                        " SET name = ?, faculty_id = ?" +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                branchModel.getName(),
                branchModel.getFacultyId(),
                branchModel.getCreatedAt(),
                branchModel.getUpdatedAt(),
                branchModel.getId()
        );
    }

    @Override
    public BranchModel deleteBranchById(int Id) {
        return jdbcTemplate.queryForObject("DELETE FROM branchs WHERE id = ?",
                new BranchInfoRowMapper(), Id);
    }

}
