package com.qsm.travelplan.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;

    private String nick;

    private String username;

    private String password;

    private String passwordSalt;

    private Integer branchId;

    private Integer departmentId;

    private String phone;

    private Integer level;

    private String sex;

    private String email;

    private String birthday;

    private Integer state;

    public User(Integer userId, String nick, String username, String password, String passwordSalt, Integer branchId, Integer departmentId, String phone, Integer level, String sex, String email, String birthday, Integer state) {
        this.userId = userId;
        this.nick = nick;
        this.username = username;
        this.password = password;
        this.passwordSalt = passwordSalt;
        this.branchId = branchId;
        this.departmentId = departmentId;
        this.phone = phone;
        this.level = level;
        this.sex = sex;
        this.email = email;
        this.birthday = birthday;
        this.state = state;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt == null ? null : passwordSalt.trim();
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}