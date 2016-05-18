package jicheng;

/**
 * @author heidou.f
 *         2016/5/16.
 */
public class Student extends Person {
    public Student(String n,String m){
        super(n);
        major = m;
    }
    public String getDescription(){
        return "a student majoring in " + major;
    }
    private String major;
}
