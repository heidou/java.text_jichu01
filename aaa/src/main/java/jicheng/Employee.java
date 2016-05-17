package jicheng;

import sun.java2d.loops.GeneralRenderer;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author heidou.f
 *         2016/5/16.
 */
public class Employee extends Person {

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();}

    public double getSalary() {
        return salary;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public Date getHireDay() {
        return hireDay;
    }
    private double salary;
    private Date hireDay;



}
