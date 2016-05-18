package mianshi;

import java.util.Random;

/**
 * @author heidou.f
 *         2016/5/14.
 */
public class ConstructorTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry",40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();
        for(Employee e :staff)
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
    }
}
     class Employee {
    public Employee(String n, double s) {
        name = n;  //参数名
        salary = s;
    }

    public Employee(double s) {//构造器的第一个语句形如this（），这个构造器将调用同一个类的另一个构造器
        this("Employee #" + nextId, s);
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    private static int nextId;
    private int id;
    private String name = "";
    private double salary;

    static {   //显示域初始化
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }
}