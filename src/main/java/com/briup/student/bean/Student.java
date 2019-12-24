package com.briup.student.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Student implements Serializable {
    @ApiModelProperty(value = "学生姓名")
private String name;
    @ApiModelProperty(value = "学号",required = true)
private int id;
    @ApiModelProperty(value = "成绩")
private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
