package Chapter7;

public class Flight {
    private int numberSeat;
    private String nameUser;
    private int typeClass;

    public Flight(int numberSeat, String nameUser, int typeClase) {
        this.numberSeat = numberSeat;
        this.nameUser = nameUser;
        this.typeClass = typeClase;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getTypeClase() {
        return typeClass;
    }

    public void setTypeClase(int typeClase) {
        this.typeClass = typeClase;
    }

    public void showPassenger(){
        System.out.printf("Passenger: %s\nNumber seat: %d\nClass: %S",getNameUser(),getNumberSeat(),(getTypeClase()==1?"First":"SECOND"));
    }
}