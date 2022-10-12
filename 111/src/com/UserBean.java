package com;

public class UserBean {

    private String loginid;
    private String psd1;
    private String psd2;
    private String phoneno;
    private String userName;
    private String sex;
    private String email;
    private String sign;


    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPsd1() {
        return psd1;
    }

    public void setPsd1(String psd1) {
        this.psd1 = psd1;
    }

    public String getPsd2() {
        return psd2;
    }

    public void setPsd2(String psd2) {
        this.psd2 = psd2;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userName='" + loginid + '\'' +
                ", psd='" + psd2 + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", name='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}

