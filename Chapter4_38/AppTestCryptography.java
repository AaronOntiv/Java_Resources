package Chapter4_38;

import java.util.Scanner;

public class AppTestCryptography {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        UserCryptography user1= new UserCryptography();
        UserCryptography user2= new UserCryptography();
        System.out.println("Starting the test");
        System.out.println("User1 is sending a message");
        System.out.println("Write numer ");
        int message= entrada.nextInt();
        System.out.printf("User1 is goint to send: %d\n",message);
        user1.setMessageSend(message);
        user2.setMessageRece(user1.encrypt());
        System.out.printf("User2 received %d\n",user2.getMessageRece());
        System.out.printf("User2 Decrepty as: %d\n", user2.decrypt());








    }
}
