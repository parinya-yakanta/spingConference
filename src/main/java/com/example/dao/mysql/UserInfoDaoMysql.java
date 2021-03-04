package com.example.dao.mysql;

import com.example.dao.UserInfoDao;
import com.example.model.UserModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserInfoDaoMysql implements UserInfoDao {
    private final JdbcTemplate jdbcTemplate;

    public UserInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class UserInfoRowMapper implements RowMapper<UserModel> {
        @Override
        public UserModel mapRow(ResultSet rs_user, int rownumber) throws SQLException {
            return new UserModel(
                    rs_user.getInt("id"),
                    rs_user.getString("prefix"),
                    rs_user.getString("name"),
                    rs_user.getString("card"),
                    rs_user.getString("age"),
                    rs_user.getString("sex"),
                    rs_user.getString("tel"),
                    rs_user.getString("institution"),
                    rs_user.getString("address"),
                    rs_user.getString("food"),
                    rs_user.getString("image"),
                    rs_user.getInt("isAdmin"),
                    rs_user.getInt("position_id"),
                    rs_user.getString("email"),
                    rs_user.getString("email_verified_at"),
                    rs_user.getString("password"),
                    rs_user.getInt("status"),
                    rs_user.getString("confirm_playment"),
                    rs_user.getString("remember_token"),
                    rs_user.getString("created_at"),
                    rs_user.getString("updated_at")
            );
        }
    }

    @Override
    public List<UserModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM users", new UserInfoRowMapper());
    }

    @Override
    public UserModel getByUserId(int Id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM Users WHERE id = ?",
                new UserInfoRowMapper(), Id);
    }


    @Override
    public int insert(UserModel userModel) {
        return jdbcTemplate.update("INSERT INTO Users VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)",
                userModel.getId(),
                userModel.getPrefix(),
                userModel.getName(),
                userModel.getCard(),
                userModel.getAge(),
                userModel.getSex(),
                userModel.getTel(),
                userModel.getInstitution(),
                userModel.getAddress(),
                userModel.getFood(),
                userModel.getImage(),
                userModel.getIsAdmin(),
                userModel.getPositionId(),
                userModel.getEmail(),
                userModel.getEmailVerifiedAt(),
                userModel.getPassWord(),
                userModel.getStatus(),
                userModel.getConfirmPlayment(),
                userModel.getRememberToken(),
                userModel.getCreatedAt(),
                userModel.getUpdatedAt()
        );
    }


    @Override
    public int update(UserModel userModel) {
        return jdbcTemplate.update("UPDATE Users " +
                        " SET prefix = ?, name = ?, card = ?" +
                        " age = ?, sex = ?, tel = ?" +
                        " institution = ?, address = ?, food = ?" +
                        " image = ?, isAdmin = ?, position_id = ?" +
                        " email = ?, email_verified_at = ?, password = ?" +
                        " status = ?, confirm_playment = ?, remember_token = ?" +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                userModel.getPrefix(),
                userModel.getName(),
                userModel.getCard(),
                userModel.getAge(),
                userModel.getSex(),
                userModel.getTel(),
                userModel.getInstitution(),
                userModel.getAddress(),
                userModel.getFood(),
                userModel.getImage(),
                userModel.getIsAdmin(),
                userModel.getPositionId(),
                userModel.getEmail(),
                userModel.getEmailVerifiedAt(),
                userModel.getPassWord(),
                userModel.getStatus(),
                userModel.getConfirmPlayment(),
                userModel.getRememberToken(),
                userModel.getCreatedAt(),
                userModel.getUpdatedAt(),
                userModel.getId()
        );
    }

}
