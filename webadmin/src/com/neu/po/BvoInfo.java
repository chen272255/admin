package com.neu.po;

public class BvoInfo {
    private String uname;
    private String info_name;
    private String info_email;
    private String info_phone;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getInfo_name() {
        return info_name;
    }

    public void setInfo_name(String info_name) {
        this.info_name = info_name;
    }

    public String getInfo_email() {
        return info_email;
    }

    public void setInfo_email(String info_email) {
        this.info_email = info_email;
    }

    public String getInfo_phone() {
        return info_phone;
    }

    public void setInfo_phone(String info_phone) {
        this.info_phone = info_phone;
    }

    @Override
    public String toString() {
        return "BvoInfo{" +
                "uname='" + uname + '\'' +
                ", info_name='" + info_name + '\'' +
                ", info_email='" + info_email + '\'' +
                ", info_phone='" + info_phone + '\'' +
                '}';
    }
}
