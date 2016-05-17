package jicheng;

/**
 * @author heidou.f
 *         2016/5/16.
 */
public abstract class Person {
    private String name;
    public Person(String n){
        name = n;
    }
    public abstract String getDescription();
    public String getName(){return name;}
}
