package text_01;

import java.io.Serializable;

/**
 * @author heidou.f
 *         2016/5/17.
 *         序列化与反序列
 *         实现序列化接口的学生类
 */
public class Student_01 implements Serializable{
    private String name;
    private char sex;
    private int year;
    private double gpa;
    public Student_01(){}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student_01(String name,char sex,int year,double gpa){
        this.name = name;
        this.sex = sex;
        this.year = year;
        this.gpa = gpa;
    }

}
