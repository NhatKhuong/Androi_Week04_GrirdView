package com.example.listviewdemover2.model;

public class Customer {
    private int id;
    private int avatar;
    private String name;
    private String birthday;
    private int flag;

    public Customer(int id,int avatar, String name, String birthday, int flag) {
        this.avatar = avatar;
        this.name = name;
        this.birthday = birthday;
        this.flag = flag;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getFlag() {
        return flag;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
