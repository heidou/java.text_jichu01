package text_01;

import java.io.*;

/**
 * @author heidou.f
 *         2016/5/17.
 *         实现学生类实例的序列化与反序列化
 */
public class UseStudent_01 {
    public static void main(String[] args){
        Student_01 st = new Student_01("Tom",'M',20,3.6);
        File file = new File("f:\\github\\Student.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);//对象输出流
            oos.writeObject(st);//对象序列化
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student_01 st1 = (Student_01)ois.readObject();//读取
            System.out.println("name = "+st1.getName());
            System.out.println("sex = "+st1.getSex());
            System.out.println("year = "+st1.getYear());
            System.out.println("gpa = "+st1.getGpa());
            ois.close();
            fis.close();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
