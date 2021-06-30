import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToObject("save.txt",students);
        List<Student> list = readToObject("save.txt");
        for (Student a: list){
            System.out.println(a);
        }


    }
    public static void writeToObject(String filePath, List<Student> students){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(students);
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<Student> readToObject(String filePath){
        List<Student> students = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            students = (List<Student>) ois.readObject();
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
}
