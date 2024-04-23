package Chapter9;

public class EmployeeTest {
    public static void main(String[]args){
        System.out.println("Creatin a new Employee");
        Employee myEmployee=new Employee("Cesar","Pedro","555245");
        System.out.printf(myEmployee.toString());
        System.out.println("\ncreating a new ComissionEmployee");
        CommissionEmployee myComissionEmployee= new CommissionEmployee(myEmployee,5000,.5);
        System.out.printf(myComissionEmployee.toString());
        System.out.println("\nCreating a comossionBaseEmployee");
        ComissionBaseEmployee myComissionBaseEmployee=new ComissionBaseEmployee(myComissionEmployee,150);
        System.out.printf(myComissionBaseEmployee.toString());

    }
}
