package jicheng;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author heidou.f
 *         2016/5/17.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob", 50000, 1989, 10, 1);

        System.out.println("alice1 ==alice2:" + (alice1 == alice2));
        System.out.println("alice1 ==alice3:" + (alice1 == alice3));
        System.out.println("alice2 ==alice3:" + (alice2 == alice3));
        System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
        System.out.println("alice1.equals(alice2):" + alice1.equals(alice2));
        System.out.println("alice2.equals(alice3):" + alice2.equals(alice3));
        System.out.println("alice1.equals(bob):" + alice1.equals(bob));
        System.out.println("bob.toString:" + bob);

        Manager car1 = new Manager("Carl", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl", 80000, 1987, 12, 15);
        boss.setBonus(5000);
      //  car1.setBonus(5000);
        System.out.println("boss.toString:" + boss);
        System.out.println("car1.toString:" + car1);
        System.out.println("car1.equals(boss):" + car1.equals(boss));
        System.out.println("alice1.hashCode():" + alice1.hashCode());
        System.out.println("alice3.hashCode():" + alice3.hashCode());
        System.out.println("boss.hashCode():" + boss.hashCode());
        System.out.println("car1.hashCode():" + car1.hashCode());
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
            return (Date) hireDay.clone();
        }

        public void raiseSalary(double byPercent) {
            double raise = this.salary * byPercent / 100;
            this.salary += raise;
        }

        public boolean equals(Object otherObject) {
            if (this == otherObject) return true;
            if (otherObject == null) return false;
            if (getClass() != otherObject.getClass()) return false;
            Employee other = (Employee) otherObject;
            return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);
        }

        public int hashCode() {
            return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireDay.hashCode();
        }

        public String toString() {
            return getClass().getName() + "[name=" + name + ",salary+" + salary + ",hireDay=" + hireDay + "]";
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

        public boolean equals(Object otherObject) {
            if (!super.equals(otherObject)) return false;
            Manager other = (Manager) otherObject;
            return bonus == other.bonus;
        }

        public int hashCode() {
            return super.hashCode() + 17 * new Double(bonus).hashCode();
        }

        public String toString() {
            return super.toString() + "[bonus=" + bonus + "]";
        }

        private double bonus;
    }
}
