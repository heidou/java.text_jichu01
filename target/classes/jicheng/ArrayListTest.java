package jicheng;

import mianshi.EmployeeTest;

import java.util.ArrayList;

/**
 * @author heidou.f
 *         2016/5/18.
 */
public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<EmployeeTest.Employee> staff = new ArrayList<EmployeeTest.Employee>();

        staff.add(new EmployeeTest.Employee("Carl",75000,1987,12,15));
        staff.add(new EmployeeTest.Employee("Harry",50000,1989,10,1));
        staff.add(new EmployeeTest.Employee("Tony",40000,1990,3,15));
        for( EmployeeTest.Employee e:staff)
            e.raiseSalary(5);
        for (EmployeeTest.Employee e:staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
    }
}
