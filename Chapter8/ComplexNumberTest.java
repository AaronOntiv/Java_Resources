package Chapter8;

import java.util.Scanner;

public class ComplexNumberTest {
    public static void main(String[]args){
        Scanner keyBoard= new Scanner(System.in);
        ComplexNumber myComNumer1;
        ComplexNumber myComNumer2;

        System.out.printf("Dame el real de numero 1\n");
        float num1=keyBoard.nextFloat();
        System.out.printf("Dame el imag de numero 1\n");
        float num2=keyBoard.nextFloat();
        myComNumer1=new ComplexNumber(num1, num2);

        System.out.printf("Dame el real de numero 2\n");
        num1=keyBoard.nextFloat();
        System.out.printf("Dame el imag de numero 2\n");
        num2=keyBoard.nextFloat();
        myComNumer2=new ComplexNumber(num1, num2);

        ComplexNumber myComNum3=ComplexNumber.sumaComplex(myComNumer1,myComNumer2);
        ComplexNumber myComNum4=ComplexNumber.multiComplexNumber(myComNumer1,myComNumer2);
        System.out.printf("Sum is:\n");
        ComplexNumber.showComplexNumber(myComNum3);
        System.out.printf("Mult is:\n");
        ComplexNumber.showComplexNumber(myComNum4);






    }
}
