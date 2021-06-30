import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteToObject {
    public WriteToObject(String filePath, List<Student> students){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(students);
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
