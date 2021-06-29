package ktbc;

import java.io.*;
import java.util.ArrayList;


public class Main implements Serializable {
    static public void ghiFile(ArrayList<Human> humans) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("humannhiphan.txt"));
        objectOutputStream.writeObject(humans);
        objectOutputStream.close();
    }

    static public ArrayList<Human> docFile() throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("humannhiphan.txt"));
        ArrayList<Human> list = (ArrayList<Human>) objectInputStream.readObject();
        objectInputStream.close();
        return list;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human("h", 23, "nam", 1231231));
        list.add(new Human("uynh1", 23, "nam", 1231231));
        list.add(new Human("huynh2", 23, "nam", 1231231));
        list.add(new Human("ynh3", 23, "nam", 1231231));
        list.add(new Human("huyg", 23, "nam", 1231231));
        ghiFile(list);
        list = docFile();
        for (Human h : list) {
            System.out.println(h);
        }


    }
}
