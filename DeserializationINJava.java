
import java.io.*;
class Student {
    int age,sid;
    String name;
    Student(int sid,int age,String name)
    {
        this.sid=sid;
        this.age=age;
        this.name=name;
    }
    public void display()
    {
        System.out.println("sid:"+sid+" age:"+age+" Name:"+ame);
    }
}
public class DeserializationINJava {
    public static void main(String[] args) throws Exception {
        FileInputStream fis= new FileInputStream("Serializable/Student.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);// this is optional it is used to increase efficiency
        ObjectInputStream ois= new ObjectInputStream(bis);
         
        Student obj=(Student)ois.readObject();
        obj.display();
        ois.close();
    
    }
}
