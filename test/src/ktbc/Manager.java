package ktbc;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager{
    ArrayList<NhanVien> list = docFile();
    Scanner scanner = new Scanner(System.in);
    public void ghiFile(ArrayList<NhanVien> list) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nhanvien.txt"));
            oos.writeObject(list);
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<NhanVien> docFile(){
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nhanvien.txt"));
            list = (ArrayList<NhanVien>) ois.readObject();
            ois.close();

        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void add(){
        System.out.println("----Menu----");
        System.out.print("enter a name: ");
        String name = scanner.nextLine();
        System.out.print("enter a age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter a gender: ");
        String gender = scanner.nextLine();
        System.out.print("enter a address: ");
        String address = scanner.nextLine();
        list.add(new NhanVien(name,age,gender,address));
        ghiFile(list);
    }

    public void sua(){
        System.out.print("enter a name that you want remove: ");
        String name = scanner.nextLine();
        int check = -1;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getName().equals(name)){
                check = i;
            }
        }
        if (check >= 0){


            list.set(check,1);
        } else {
            System.out.println("not found " + name);
        }
        ghiFile(list);
    }
    public void xoa(){
        System.out.print("enter a name that you want edit: ");
        String name = scanner.nextLine();
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getName().equals(name)){
                list.remove(i);
            }
        }
        ghiFile(list);
    }
    public void show(){
        for (NhanVien a: list){
            System.out.println(a);
        }
    }
}
