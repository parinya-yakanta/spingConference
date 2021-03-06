package com.example.model;

public class ResearchModel {
    private int id;
    private String code;
    private String nameTh;
    private String nameEn;
    private String researcher;
    private int userId;
    private int facultyId;
    private int branchId;
    private int presentId;
    private int degreeId;
    private int positionId;
    private int memberhostId;
    private String pdf;
    private String word;
    private String playment;
    private String comment;
    private int confirm;
    private int status;
    private String rateS1;
    private String rateS2;
    private String recommendS1;
    private String recommendS2;
    private String fileResult;
    private String newFilePdf;
    private String newFileWord;
    private String videoFile;
    private String posterFile;
    private String videoYoutubLink;
    private String createdAt;
    private String updatedAt;

    public ResearchModel(int id, String code, String nameTh, String nameEn, String researcher, int userId, int facultyId, int branchId, int presentId, int degreeId, int positionId, int memberhostId, String pdf, String word, String playment, String comment, int confirm, int status, String rateS1, String rateS2, String recommendS1, String recommendS2, String fileResult, String newFilePdf, String newFileWord, String videoFile, String posterFile, String videoYoutubLink, String createdAt, String updatedAt) {
        this.id = id;
        this.code = code;
        this.nameTh = nameTh;
        this.nameEn = nameEn;
        this.researcher = researcher;
        this.userId = userId;
        this.facultyId = facultyId;
        this.branchId = branchId;
        this.presentId = presentId;
        this.degreeId = degreeId;
        this.positionId = positionId;
        this.memberhostId = memberhostId;
        this.pdf = pdf;
        this.word = word;
        this.playment = playment;
        this.comment = comment;
        this.confirm = confirm;
        this.status = status;
        this.rateS1 = rateS1;
        this.rateS2 = rateS2;
        this.recommendS1 = recommendS1;
        this.recommendS2 = recommendS2;
        this.fileResult = fileResult;
        this.newFilePdf = newFilePdf;
        this.newFileWord = newFileWord;
        this.videoFile = videoFile;
        this.posterFile = posterFile;
        this.videoYoutubLink = videoYoutubLink;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameTh() {
        return nameTh;
    }

    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getPresentId() {
        return presentId;
    }

    public void setPresentId(int presentId) {
        this.presentId = presentId;
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getMemberhostId() {
        return memberhostId;
    }

    public void setMemberhostId(int memberhostId) {
        this.memberhostId = memberhostId;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPlayment() {
        return playment;
    }

    public void setPlayment(String playment) {
        this.playment = playment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getConfirm() {
        return confirm;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRateS1() {
        return rateS1;
    }

    public void setRateS1(String rateS1) {
        this.rateS1 = rateS1;
    }

    public String getRateS2() {
        return rateS2;
    }

    public void setRateS2(String rateS2) {
        this.rateS2 = rateS2;
    }

    public String getRecommendS1() {
        return recommendS1;
    }

    public void setRecommendS1(String recommendS1) {
        this.recommendS1 = recommendS1;
    }

    public String getRecommendS2() {
        return recommendS2;
    }

    public void setRecommendS2(String recommendS2) {
        this.recommendS2 = recommendS2;
    }

    public String getFileResult() {
        return fileResult;
    }

    public void setFileResult(String fileResult) {
        this.fileResult = fileResult;
    }

    public String getNewFilePdf() {
        return newFilePdf;
    }

    public void setNewFilePdf(String newFilePdf) {
        this.newFilePdf = newFilePdf;
    }

    public String getNewFileWord() {
        return newFileWord;
    }

    public void setNewFileWord(String newFileWord) {
        this.newFileWord = newFileWord;
    }

    public String getVideoFile() {
        return videoFile;
    }

    public void setVideoFile(String videoFile) {
        this.videoFile = videoFile;
    }

    public String getPosterFile() {
        return posterFile;
    }

    public void setPosterFile(String posterFile) {
        this.posterFile = posterFile;
    }

    public String getVideoYoutubLink() {
        return videoYoutubLink;
    }

    public void setVideoYoutubLink(String videoYoutubLink) {
        this.videoYoutubLink = videoYoutubLink;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}





