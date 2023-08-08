package Chapter3_14;
import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        Fecha miFecha1 =new Fecha();
        System.out.println("Dame valor para dia.");
        miFecha1.setDay((entrada.nextInt()));
        System.out.println("Dame valor para mes.");
        miFecha1.setMonth((entrada.nextInt()));
        System.out.println("Dame valor para year.");
        miFecha1.setYear((entrada.nextInt()));

        System.out.println("Mostrando a miFecha1: ");
        miFecha1.showDate();

        System.out.println("Creando a un objeto Fecha con constructor normal");
        int year,month,day;
        System.out.println("Dame valor para dia.");
        day=entrada.nextInt();
        System.out.println("Dame valor para mes.");
        month=entrada.nextInt();
        System.out.println("Dame valor para year.");
        year=entrada.nextInt();

        Fecha miFecha2 = new Fecha( month,day,year);
        System.out.println("miFecha2 ha sido creada");
        miFecha2.showDate();

    }
}
