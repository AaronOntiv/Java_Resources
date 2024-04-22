package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class SellerTest {
    public static Scanner keyBoard= new Scanner(System.in);
    public static ArrayList<Seller> mySellers=new ArrayList<>();

    public static void main(String[]ars){
        saludo();

    }

    public static void saludo(){
        System.out.println("Hola Mundo");
        int option=1;
        while (option!=0){
            System.out.println("1: add\n2: show all\n3:out");
            option= keyBoard.nextInt();
            switch (option){
                case 1:
                    addSeller(mySellers);
                    break;
                case 2:
                    showRanges(mySellers);
                    break;
            }
        }

    }

    public static void addSeller(ArrayList<Seller> mySellers){
        System.out.println("Give me total sell: ");
        mySellers.add(new Seller(keyBoard.nextDouble()));
    }
    public static void showRanges(ArrayList<Seller> mySellers){
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
        for(Seller mySeller:mySellers){
            int salary=mySeller.calculateSalary();
            if(salary<300){
                a++;
            } else if (salary<400) {
                b++;
            } else if (salary<500) {
                c++;
            } else if (salary<600) {
                d++;
            } else if (salary<700) {
                e++;
            } else if (salary<800) {
                f++;
            } else if (salary<900) {
                g++;
            } else if (salary>1000) {
                h++;
            }else i++;
        }
        System.out.println("200-299: "+ a);
        System.out.println("300-399: "+ b);
        System.out.println("400-499: "+ c);
        System.out.println("500-599: "+ d);
        System.out.println("600-699: "+ e);
        System.out.println("700-799: "+ f);
        System.out.println("800-899: "+ g);
        System.out.println("900-999: "+ h);
        System.out.println("Mayor 1000: "+ i);
    }
}
