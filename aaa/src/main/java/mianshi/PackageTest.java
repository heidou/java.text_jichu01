package mianshi;
import static java.lang.System.*;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author heidou.f
 *         2016/5/14.
 */
public class PackageTest {
    public static void main(String[] args){
        Employee harry = new Employee("Harry",50000,1989,10,1);
        harry.raiseSalary(5);
       out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
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
            return hireDay;
        }

        public void raiseSalary(double byPercent) {
            double raise = this.salary * byPercent / 100;
            salary += raise;
        }

        private String name;
        private double salary;
        private Date hireDay;
    }
}
