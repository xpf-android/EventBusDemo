package com.example.eventbusdemo.bean;

/**
 * time: 2020/3/13 21:54
 * author: xpf
 * describe:
 */
public class RxBean {
    private String name;
    private String phone;
    private int gender;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "RxBean{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
