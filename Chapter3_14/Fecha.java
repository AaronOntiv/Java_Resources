package Chapter3_14;

public class Fecha {
    int year;
    int day;
    int month;

    public Fecha(int month, int day,int year){
        this.month=month;
        this.day=day;
        this.year=year;
    }

    public Fecha(){
        month=0;
        year=0;
        day=0;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void showDate(){
        System.out.println("La fecha es: "+ getMonth()+"/"+getDay()+"/"+getYear());
    }
}
