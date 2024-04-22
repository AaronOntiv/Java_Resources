package Chapter7;

import java.util.Scanner;

public class RemovalDuplicates {
    public static void main(String[]args){
        Scanner keyBoard =new Scanner(System.in);
        int[] my_array=new int[5];
        int flag=0;
        while (flag<5){
            flag++;
            System.out.println("Dame valor");
            int in=keyBoard.nextInt();
            boolean isPresent=false;
            for(int value:my_array){
                if(value==in){
                    System.out.println("Valor repetido");
                    flag--;
                    isPresent=true;
                    break;
                }
            }
            if(!isPresent){
                my_array[flag-1]=in;
                System.out.println("El vector es:");
                for(int value:my_array){
                    System.out.print(" ");
                    System.out.print(value);
                }
            }
        }


    }
}
