package Chapter4_38;


import static java.lang.Math.pow;

public class UserCryptography {
    private int messageSend;
    private int messageRece;




    public UserCryptography(int messageSend){
        if(messageSend >9999){
            System.out.println("Error only four digits numbers.");
            this.messageSend =0;
        }
        else{
            this.messageSend = messageSend;
        }
    }

    public UserCryptography(){
        this.messageSend=0;
        this.messageRece=0;
    }

    public int getMessageSend() {
        return messageSend;
    }


    public void setMessageSend(int messageSend) {
        if(messageSend>9999){
            System.out.println("Error message must be 4 dig");
            this.messageSend=0;
        }
        else {this.messageSend=messageSend;}
    }

    public int getMessageRece() {
        return messageRece;
    }

    public void setMessageRece(int messageRece) {
        this.messageRece = messageRece;
    }



    public int encrypt(){
        int newMessage=0;
        int originalmesage=getMessageSend();

        for(int i=4;i>0;i--){
           int aux= (int) (( (originalmesage/(int)pow(10,i-1) +7)%10)*pow(10,i-1));
           newMessage+=aux;
           originalmesage=originalmesage%(int)pow(10,i-1);
        }
        return (newMessage/1000*10)+(newMessage%1000/100)+(newMessage%100/10*1000)+(newMessage%10*100);
     }

    public int decrypt(){
        int mesEncry=getMessageRece();
        return (mesEncry/1000+3)%10*10+(mesEncry%1000/100+3)%10+(mesEncry%100/10+3)%10*1000+(mesEncry%10+3)%10*100;
    }



}
