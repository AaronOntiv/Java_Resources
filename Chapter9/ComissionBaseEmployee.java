package Chapter9;

public class ComissionBaseEmployee extends CommissionEmployee {
    private double baseSalary;

    public ComissionBaseEmployee(String firstName, String lastName, String socialNumber, double grossSales,
                                 double rateComission, double baseSalary) {
        super(firstName, lastName, socialNumber, grossSales, rateComission);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("base salary must be >0.0 ");
        }
        this.baseSalary = baseSalary;
    }

    public ComissionBaseEmployee(CommissionEmployee myComissionEmployee, double baseSalary) {
        super(myComissionEmployee.getFirstName(), myComissionEmployee.getLastName(),
                myComissionEmployee.getSocialSecurityNumber(), myComissionEmployee.getGrossSales(),
                myComissionEmployee.getRateComission());
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("base salary must be >0.0 ");
        }
        this.baseSalary = baseSalary;


    }

    @Override
    public double income() {
        return super.income() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s\n %s %f", super.toString(), "With base Salary: ", getBaseSalary());
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("base salary must be >0.0 ");
        }
        this.baseSalary = baseSalary;
    }
}
