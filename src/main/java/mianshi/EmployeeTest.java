package mianshi;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author heidou.f
 *         2016/5/12.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony", 40000, 1990, 3, 15);
// 无法从静态上下文中引用非静态 变量 this class 类+static
        for (Employee e : staff)
            e.raiseSalary(5);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }

    public static class Employee {
        public Employee(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            GregorianCalendar calendar = new GregorianCalendar(year, month-1 , day);
            hireDay = calendar.getTime();
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public Date getHireDay() {
            return (Date)hireDay.clone();
        }

        public void raiseSalary(double byPercent) {
            double raise = this.salary * byPercent / 100;
            this.salary += raise;
        }

        private String name;
        private double salary;
        private Date hireDay;
    }
}
