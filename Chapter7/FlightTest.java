package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class FlightTest {
    public static void main(String[]args){
        boolean[] flight=new boolean[10];
        Arrays.fill(flight,false);
        Scanner keyBoard=new Scanner(System.in);
        int option=1;
        while (option!=0) {
            System.out.println("\nPress:\n1 FirstClase\n2 Second Clase\n0: out");
            option = keyBoard.nextInt();
            switch (option) {
                case 1:
                    if (!showFirsClass(flight)) {
                        System.out.println("Do you want to choise second class?");
                        System.out.println("1:Yes\n2:No");
                        int option2 = keyBoard.nextInt();
                        if (option2 == 1) {
                            if (!showSecondClass(flight)) {
                                System.out.println("\nThere's not seats");
                                break;
                            } else {
                                System.out.println("\nGime numer seat");
                                int numberSeat = keyBoard.nextInt();
                                if (choise2Seat(flight, numberSeat) == true) {
                                    System.out.println("Give me your name:");
                                    keyBoard.nextLine();
                                    String name = keyBoard.nextLine();
                                    Flight myPassenger = new Flight(numberSeat, name, 2);
                                    myPassenger.showPassenger();
                                }

                            }
                        }
                    } else {
                        System.out.println("\nGime numer seat");
                        int numberSeat = keyBoard.nextInt();
                        if (choise1Seat(flight, numberSeat) == true) {
                            System.out.println("Give me your name:");
                            keyBoard.nextLine();
                            String name = keyBoard.nextLine();
                            Flight myPassenger = new Flight(numberSeat, name, 1);
                            myPassenger.showPassenger();
                        }

                    }
                    break;

                case 2:
                    if (!showSecondClass(flight)) {
                        System.out.println("Do you want to choise first class?");
                        System.out.println("1:Yes\n2:No");
                        int option2 = keyBoard.nextInt();
                        if (option2 == 1) {
                            if (!showFirsClass(flight)) {
                                System.out.println("There's not seats");
                                break;
                            } else {
                                System.out.println("\nGime numer seat");
                                int numberSeat = keyBoard.nextInt();
                                if (choise1Seat(flight, numberSeat) == true) {
                                    System.out.println("Give me your name:");
                                    keyBoard.nextLine();
                                    String name = keyBoard.nextLine();
                                    Flight myPassenger = new Flight(numberSeat, name, 1);
                                    myPassenger.showPassenger();
                                }

                            }
                        }
                    } else {
                        System.out.println("\nGime numer seat");
                        int numberSeat = keyBoard.nextInt();
                        if (choise2Seat(flight, numberSeat) == true) {
                            System.out.println("Give me your name:");
                            keyBoard.nextLine();
                            String name = keyBoard.nextLine();
                            Flight myPassenger = new Flight(numberSeat, name, 2);
                            myPassenger.showPassenger();
                        }

                    }
                    break;
            }
        }

    }


    private static boolean showFirsClass(boolean[] flight){
        System.out.println("Available seats: ");
        int totalSeats=0;
        for(int i=0;i<5;i++){
            if(flight[i]==false){
                System.out.print((i+1));
                totalSeats++;
            }
        }
        if(totalSeats==0){
            System.out.println("No available seats:");
            return false;
        }
        else return true;
    }

    private static boolean showSecondClass(boolean[] flight){
        System.out.println("Available seats: ");
        int totalSeats=0;
        for(int i=5;i<10;i++){
            if(flight[i]==false){
                System.out.print((i+1));
                totalSeats++;
            }
        }
        if(totalSeats==0){
            System.out.println("No available seats:");
            return false;
        }
        else return true;
    }

    private static boolean choise1Seat(boolean[]flight,int option){
        if(option<6){
            if(flight[option-1]==false){
                flight[option-1]=true;
                System.out.println("Assigned");
                return true;
            }else {
                System.out.println("Not valid");
                return false;
            }
        }
        else {
            System.out.println("not valid");
            return false;
        }
    }

    private static boolean choise2Seat(boolean[]flight,int option){
        if(option<11 && option>5){
            if(flight[option-1]==false){
                flight[option-1]=true;
                System.out.println("Assigned");
                return true;
            }else {
                System.out.println("Not valid");
                return false;
            }
        }
        else {
            System.out.println("not valid");
            return false;
        }


    }
}
