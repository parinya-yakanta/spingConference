package com.example.model;

public class UserModel {
    private int Id;
    private String prefix;
    private String name;
    private String card;
    private String age;
    private String sex;
    private String tel;
    private String institution;
    private String address;
    private String food;
    private String image;
    private int isAdmin;
    private int positionId;
    private String email;
    private String emailVerifiedAt;
    private String passWord;
    private int status;
    private String confirmPlayment;
    private String rememberToken;
    private String createdAt;
    private String updatedAt;

    public UserModel(int id, String prefix, String name, String card, String age, String sex, String tel, String institution, String address, String food, String image, int isAdmin, int positionId, String email, String emailVerifiedAt, String passWord, int status, String confirmPlayment, String rememberToken, String createdAt, String updatedAt) {
        Id = id;
        this.prefix = prefix;
        this.name = name;
        this.card = card;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
        this.institution = institution;
        this.address = address;
        this.food = food;
        this.image = image;
        this.isAdmin = isAdmin;
        this.positionId = positionId;
        this.email = email;
        this.emailVerifiedAt = emailVerifiedAt;
        this.passWord = passWord;
        this.status = status;
        this.confirmPlayment = confirmPlayment;
        this.rememberToken = rememberToken;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(String emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getConfirmPlayment() {
        return confirmPlayment;
    }

    public void setConfirmPlayment(String confirmPlayment) {
        this.confirmPlayment = confirmPlayment;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
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
