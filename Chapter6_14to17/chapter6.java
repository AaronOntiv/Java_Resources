package Chapter6_14to17;

import java.util.Scanner;

public class chapter6 {
    private static Scanner entrada=new Scanner(System.in);
    public static void main(String[]args){
        app();

    }

    public static void app(){
        double in;
        System.out.println("Welcome");
        int aux=1;
        while (aux!=0){
            System.out.println("\nPress\n1: For Floor\n2: For Ceil\n3: Hypotenuse Calculation\n4: Multiples\n5: Divisible by 5\n0: For exit\n");
            aux=entrada.nextInt();
            switch (aux){
                case 1:
                    System.out.println("Dame numero");
                    in= entrada.nextDouble();
                    System.out.printf("El Resultado es %d\n",floor(in));
                    break;
                case 2:
                    System.out.println("Dame numero");
                    in= entrada.nextDouble();
                    System.out.printf("El Resultado es %d\n",ceil(in));
                    break;
                case 3:
                    System.out.println("Dame el lado a:\n");
                    double a= entrada.nextDouble();
                    System.out.println("Dame el lado b:\n");
                    double hypo= hypotenuse(a,entrada.nextDouble());
                    System.out.printf("The hypetenuse is: %f\n",hypo);
                    break;
                case 4:
                    System.out.println("Dame multiple:\n");
                    int num1=entrada.nextInt();
                    System.out.printf("Dame numero para ver si es multiplo de %d:\n",num1);
                    int num2=entrada.nextInt();
                    isMultiple(num1,num2);
                    break;
                case 5:
                    System.out.println("Give me number and check wheter is divible by 5 or not ");
                    int num3=entrada.nextInt();
                    System.out.printf("The number %d is divisible by 5: %s",num3,isDivisible(num3));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error no option");
                    break;
            }

        }

    }

    public static int floor(double in){
        return (int)in;
    }
    public static int ceil(double in){
        if(in%(int)in>0.4){
            in+=1;
        }else{
            return (int)in;
        }
        return (int)in;
    }
    public static double hypotenuse(double a, double b){
        double hypo=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("The hypotenuse with my method is:%f\n",hypo);

        hypo=Math.hypot(a,b);
        return hypo;
    }
    public static void isMultiple(int a, int b){
        if(b%a!=0){
            System.out.println("No es multiplo");
        }else {
            System.out.println("es multiplo");
        }
    }
    public static boolean isDivisible(int a){
        if(a%5!=0){
            return false;
        }else {
            return true;
        }
    }
}
