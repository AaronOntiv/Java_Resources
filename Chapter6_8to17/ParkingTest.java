package Chapter6_8to17;


import java.util.ArrayList;
import java.util.Scanner;

public class ParkingTest {
    private static ArrayList<Parking> myCars=new ArrayList<>();
    private static Scanner inKeyboard= new Scanner(System.in);

    public static void main(String[]args){

        int option = 1;

        while (option!=6) {
            System.out.println("Presiona 1 para ingresar un auto\n 2 Para Dar todos los autos entrantes\n6 Salir");
            option = inKeyboard.nextInt();
            String modelo= inKeyboard.nextLine();

            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    showAll();
                    break;


            }
        }




        saludo();

    }

    //Metodo tiene que ser static para que pueda ser llamado por main
    private static void saludo(){
        System.out.println("Adios");

    }

    private static void add(){
        System.out.println("Dame modelo:");
        String modelo= inKeyboard.nextLine();
        System.out.println("Dame horas:");
        double hours=inKeyboard.nextDouble();
        Parking newCar =new Parking(modelo,hours);
        myCars.add(newCar);
    }
    private static void showAll(){
        for(Parking car : myCars){
            System.out.println("Modelo: "+car.getLicense_plates());
            System.out.println("Horas: "+car.getHours());
            System.out.println("Precio total: "+car.charge());
            System.out.println("");
        }
    }
}
