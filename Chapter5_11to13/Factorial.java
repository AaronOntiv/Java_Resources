package Chapter5_11to13;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        System.out.printf("Press 1 to: Look for the lowest value\n" +
                "Press 2 to: Calculate product of odd integers\n" +
                "Press 3 to calculate factorial from 1 to 20\n ");
        int op= entrada.nextInt();
        switch (op){
            case 1:
                lowestValue();
                break;
            case 2:
                productOddIntegers();

                break;
            case 3:
                factorial();
                break;
            default:
                System.out.println("No existe esa opcion.");
        }
    }



    public static void lowestValue(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Give me how many numers you will input");
        int aux=0;
        int totalNumers= entrada.nextInt();
        int in;
        int lowest=0;

        for(;totalNumers>0;totalNumers--){
            System.out.println("Give me numer:");
            in = entrada.nextInt();
            if(aux==0){
                lowest=in;
            }
            else{
                if(lowest>in){
                    lowest=in;
                }
            }
        }
        System.out.printf("El menor es: %d",lowest);
    }

    public static void productOddIntegers() {
        int product=1;

        for(int i=1;i<16;i++){
            if(i%2!=0){
                product*=i;
            }
        }
        System.out.printf("The product is: %d",product);

    }

    public static void factorial(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Give me a numer");
        int in= entrada.nextInt();
        int fact=1;
        for(;in>0;in--){
            fact*=in;
        }
        System.out.printf("El factorial es: %d",fact);
    }


}
