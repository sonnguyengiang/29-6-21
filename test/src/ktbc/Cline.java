package ktbc;

import java.io.IOException;
import java.util.Scanner;

public class Cline {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
       while (true){
           Manager manager = new Manager();
           System.out.println("1.add nv");
           System.out.println("2.xoa nv");
           System.out.println("3.edit nv");
           System.out.println("4.show");
           System.out.println("5.exit");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   manager.add();
                   break;
               case 2:
                   manager.xoa();
                   break;
               case 3:
                   manager.sua();
                   break;
               case 4:
                   manager.show();
                   break;
               case 5:
                   System.exit(0);
           }
       }
    }
}
