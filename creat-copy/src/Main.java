import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int count = 0;
    static File file1 = new File("mau1.txt");
    static File file2 = new File("copy1.txt");
    public static List<String> list = new ArrayList<>();
    public static List<String> list1 = new ArrayList<>();
    public static void docFile(String filePath){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static void ghiFile(String filePath){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (String a: list){
                bufferedWriter.write(a);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void docFileCopy(String filePath){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            for (int i = 0; i < list.size(); i++){
                list1.get(i) = list.get(i).split();
            }
            while ((line = bufferedReader.readLine()) != null){
                list1.add(line);
                count++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {

        if (!file1.exists()){
            file1.createNewFile();
        }
        if (!file2.exists()){
            file2.createNewFile();
        }
        docFile("D:\\java\\modun2\\29-6-21\\creat-copy\\mau.txt");
        ghiFile("D:\\java\\modun2\\29-6-21\\creat-copy\\copy1.txt");
        docFileCopy("D:\\java\\modun2\\29-6-21\\creat-copy\\copy1.txt");
        for (String a: list1){
            System.out.println(a);
        }
        System.out.println(count);
    }
}
