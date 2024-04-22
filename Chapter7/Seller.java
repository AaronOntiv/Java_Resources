package Chapter7;

public class Seller {
    private double paidWeek;
    private double totalSales;
    private String name;

    public Seller(double paidWeek, double totalSales, String name){
        this.name=name;
        this.paidWeek=paidWeek;
        this.totalSales=totalSales;
    }
    public Seller(double paidWeek, double totalSales){
        this.paidWeek=paidWeek;
        this.totalSales=totalSales;
        this.name="x";
    }
    public Seller(double totalSales){
        this.name="x";
        this.paidWeek=200;
        this.totalSales=totalSales;
    }

    public int calculateSalary(){
        return (int) paidWeek+ (int)totalSales/100*9;
    }



    public double getPaidWeek() {
        return paidWeek;
    }
    public void setPaidWeek(double paidWeek) {
        this.paidWeek = paidWeek;
    }
    public double getTotalSales() {
        return totalSales;
    }
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
