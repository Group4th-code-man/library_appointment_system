package com.luf.ssm.beans;

public class Student {

private String s_id;
private String s_name;
private String s_password;
private String status;//预约资格

    public Student(String s_id, String s_name, String s_password, String status) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_password = s_password;
        this.status = status;
    }

    public String getS_id() {
        return s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public String getS_password() {
        return s_password;
    }

    public String getStatus() {
        return status;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id='" + s_id + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_password='" + s_password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
