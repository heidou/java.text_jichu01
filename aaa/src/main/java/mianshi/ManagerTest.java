package mianshi;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author heidou.f
 *         2016/5/15.
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1976, 12, 15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy", 40000, 1990, 3, 15);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireday=" + e.getHireDay());
    }

    static class Employee {
        public Employee(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            hireDay = calendar.getTime();
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public Date getHireDay() {
            return hireDay;
        }


        private String name;
        private double salary;
        private Date hireDay;
    }

    static class Manager extends Employee {

        public Manager(String n, double s, int year, int month, int day)

        {  //Manage类的构造器不能直接访问E类的私有域，所以必须利用E类的构造器对部分私有域进行初始化
            //super调用构造器语句必须是子类构造器的第一句  未显示调用构造器，自动调用默认构造器（没有参数的），没有则出错
            super(n, s, year, month, day);//调用超类Employee中含有的n,s,year,month和day参数的构造器的间歇形式
            bonus = 0;
        }

        public double getSalary() {
            double baseSalary = super.getSalary();
            return baseSalary + bonus;
        }

        public void setBonus(double b) {
            bonus = b;
        }

        private double bonus;
    }
}



