package com.account.demo.web.batch.csv;

import java.io.Serializable;

/**
 * @author chengchenrui
 * @version Id: StudentCsv.java, v 0.1 2017.2.27 15:24 chengchenrui Exp $$
 */
public class StudentCsv implements Serializable {

    /**
     * ID
     */
    private String studentId = "";
    /**
     * 名字
     */
    private String name      = "";
    /**
     * 年龄
     */
    private int    age       = 0;
    /**
     * 分数
     */
    private float  score     = 0;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
