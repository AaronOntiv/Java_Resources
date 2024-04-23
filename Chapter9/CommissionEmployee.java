package Chapter9;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double rateComission;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double rateComission)  {
        super(firstName,lastName,socialSecurityNumber);
        if(grossSales<0.9){
            throw new IllegalArgumentException("Gross sales must be >0");
        }
        if(rateComission<=0.0|| rateComission>=1){
            throw new IllegalArgumentException("The rate Comission must be >0 and <1");
        }
        this.grossSales=grossSales;
        this.rateComission=rateComission;
    }

    public CommissionEmployee(Employee myEmployee, double grossSales, double rateComission){
        super( myEmployee.getFirstName(), myEmployee.getLastName(), myEmployee.getSocialSecurityNumber());
        if(grossSales<0.9){
            throw new IllegalArgumentException("Gross sales must be >0");
        }
        if(rateComission<=0.0|| rateComission>=1){
            throw new IllegalArgumentException("The rate Comission must be >0 and <1");
        }
        this.grossSales=grossSales;
        this.rateComission=rateComission;

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales<0.0){
            throw new IllegalArgumentException("Must be >0.0");
        }
        this.grossSales = grossSales;
    }

    public double getRateComission() {
        return rateComission;
    }

    public void setRateComission(double rateComission){
        if(rateComission<=0.0 || rateComission>=1.0){
            throw new IllegalArgumentException("It must be >0 and <1.0");
        }
        this.rateComission = rateComission;
    }

    public double income(){
        return  getGrossSales()*getRateComission();
    }

    @Override
    public String toString(){
        return String.format("%s\n%s%s\n%s%s",super.toString(),"Gross Sales: ",getGrossSales(),"Rate comission: ",getRateComission());
    }


}
