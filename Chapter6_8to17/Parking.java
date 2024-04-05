package Chapter6_8to17;

public class Parking {
    private String license_plates;
    private String carModel;
    private double hours;


    public Parking(String license_plates,String carModel, double hours){
        this.license_plates=license_plates;
        this.carModel=carModel;
        this.hours=hours;
    }

    public Parking(String license_plates,double hours){
        this.license_plates=license_plates;
        this.hours=hours;
    }

    public double charge(){
        if(hours>3) {
            if (hours - (int) hours > 0.1) {
                hours=(int)(hours+1);
                return 2 + (hours - 3) * 0.5;
            } else {
                return 2 + (hours - 3) * 0.5;
            }
        }
        else {return 2;}
    }

    public String getLicense_plates() {
        return license_plates;
    }

    public double getHours() {
        return hours;
    }
}
