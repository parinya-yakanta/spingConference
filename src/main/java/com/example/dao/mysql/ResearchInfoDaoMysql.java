package com.example.dao.mysql;

import com.example.dao.ResearchInfoDao;
import com.example.model.ResearchModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ResearchInfoDaoMysql implements ResearchInfoDao {
    private final JdbcTemplate jdbcTemplate;

    public ResearchInfoDaoMysql(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static class ResearchInfoRowMapper implements RowMapper<ResearchModel> {
        @Override
        public ResearchModel mapRow(ResultSet rs_research, int rownumber) throws SQLException {
            return new ResearchModel(
                    rs_research.getInt("id"),
                    rs_research.getString("code"),
                    rs_research.getString("name_th"),
                    rs_research.getString("name_en"),
                    rs_research.getString("researcher"),
                    rs_research.getInt("user_id"),
                    rs_research.getInt("faculty_id"),
                    rs_research.getInt("branch_id"),
                    rs_research.getInt("present_id"),
                    rs_research.getInt("degree_id"),
                    rs_research.getInt("position_id"),
                    rs_research.getInt("memberhost_id"),
                    rs_research.getString("pdf"),
                    rs_research.getString("word"),
                    rs_research.getString("playment"),
                    rs_research.getString("comment"),
                    rs_research.getInt("confirm"),
                    rs_research.getInt("status"),
                    rs_research.getString("rate_s1"),
                    rs_research.getString("rate_s2"),
                    rs_research.getString("recommend_s1"),
                    rs_research.getString("recommend_s2"),
                    rs_research.getString("file_result"),
                    rs_research.getString("new_file_pdf"),
                    rs_research.getString("new_file_word"),
                    rs_research.getString("video_file"),
                    rs_research.getString("poster_file"),
                    rs_research.getString("video_youtub_link"),
                    rs_research.getString("created_at"),
                    rs_research.getString("updated_at")
            );
        }
    }

    @Override
    public List<ResearchModel> getAll() {
        return jdbcTemplate.query("SELECT * FROM researchs",new ResearchInfoRowMapper());
    }

    @Override
    public ResearchModel getByResearchId(int Id) {
        return jdbcTemplate.queryForObject("SELECT * FROM researchs WHERE id = ?",
                new ResearchInfoRowMapper(),Id);
    }

    @Override
    public int insert(ResearchModel researchModel) {
        return jdbcTemplate.update("INSERT INTO researchs VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,)",
                researchModel.getId(),
                researchModel.getCode(),
                researchModel.getNameTh(),
                researchModel.getNameEn(),
                researchModel.getResearcher(),
                researchModel.getUserId(),
                researchModel.getFacultyId(),
                researchModel.getBranchId(),
                researchModel.getPresentId(),
                researchModel.getDegreeId(),
                researchModel.getPositionId(),
                researchModel.getMemberhostId(),
                researchModel.getPdf(),
                researchModel.getWord(),
                researchModel.getPlayment(),
                researchModel.getComment(),
                researchModel.getConfirm(),
                researchModel.getStatus(),
                researchModel.getRateS1(),
                researchModel.getRateS2(),
                researchModel.getRecommendS1(),
                researchModel.getRecommendS2(),
                researchModel.getFileResult(),
                researchModel.getNewFilePdf(),
                researchModel.getNewFileWord(),
                researchModel.getVideoFile(),
                researchModel.getPosterFile(),
                researchModel.getVideoYoutubLink(),
                researchModel.getCreatedAt(),
                researchModel.getUpdatedAt()
            );
        }

    @Override
    public int update(ResearchModel researchModel) {
        return jdbcTemplate.update("UPDATE researchs " +
                        " SET code = ?, name_th = ?, name_en = ?," +
                        " researcher = ?, user_id = ?, faculty_id = ?," +
                        " branch_id = ?, present_id = ?, degree_id = ?," +
                        " position_id = ?, memberhost_id = ?, pdf = ?," +
                        " word = ?, playment = ?, comment = ?," +
                        " confirm = ?, status = ?, rate_s1 = ?," +
                        " rate_s2 = ?, recommend_s1 = ?, recommend_s2 = ?," +
                        " file_result = ?, new_file_pdf = ?, new_file_word = ?," +
                        " video_file = ?, poster_file = ?, video_youtub_link = ?," +
                        " created_at = ?, updated_at = ?" +
                        " WHERE id = ?",
                researchModel.getCode(),
                researchModel.getNameTh(),
                researchModel.getNameEn(),
                researchModel.getResearcher(),
                researchModel.getUserId(),
                researchModel.getFacultyId(),
                researchModel.getBranchId(),
                researchModel.getPresentId(),
                researchModel.getDegreeId(),
                researchModel.getPositionId(),
                researchModel.getMemberhostId(),
                researchModel.getPdf(),
                researchModel.getWord(),
                researchModel.getPlayment(),
                researchModel.getComment(),
                researchModel.getConfirm(),
                researchModel.getStatus(),
                researchModel.getRateS1(),
                researchModel.getRateS2(),
                researchModel.getRecommendS1(),
                researchModel.getRecommendS2(),
                researchModel.getFileResult(),
                researchModel.getNewFilePdf(),
                researchModel.getNewFileWord(),
                researchModel.getVideoFile(),
                researchModel.getPosterFile(),
                researchModel.getVideoYoutubLink(),
                researchModel.getCreatedAt(),
                researchModel.getUpdatedAt(),
                researchModel.getId()
        );
    }

}

