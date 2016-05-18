package mianshi;

/**
 * @author heidou.f
 *         2016/5/13.
 */
public class ParamTest {
   public static class Employee{
        private String name;
        private double salary;
        public Employee(String n,double s){
            name = n;
            salary = s;
        }
        public String gerName(){return name;}
        public double getSalary(){return salary;}

        public void raiseSalary(double byPercent){
            double raise = salary * byPercent/100;
            salary+= raise;
        }
    }
    public static void main(String[] args){
        //Test 1 方法不能修改一个基本数据类型参数
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before:percent=" + percent);
        tripleValue(percent);
        System.out.println("After:percent="+percent);

        //Test2 方法可以改变对象参数的状态
        System.out.println("\nTesting tripleSalary:");
        Employee harry = new Employee("Harry",50000);
        System.out.println("Before="+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("After:salary=" + harry.getSalary());

        //Test3  方法不能实现让对象参数引用一个新对象
        System.out.println("\nTesting swap:");
        Employee a = new Employee("AA",70000);
        Employee b = new Employee("BB",60000);
        System.out.println("Before:a=" + a.gerName());
        System.out.println("Before:b="+ b.gerName());
        swap(a,b);
        System.out.println("After:a="+ a.gerName());
        System.out.println("After:b=" + b.gerName());
    }

    public static void tripleValue(double x){
        x = 3*x;
        System.out.println("End of method:x="+x);
    }
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("End of method:salary=" +x.getSalary());
    }
    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method:x=" +x.gerName());
        System.out.println("End of method:y=" +y.gerName());
    }
}
