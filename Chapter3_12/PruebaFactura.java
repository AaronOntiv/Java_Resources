package Chapter3_12;
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[]args){
        //Para introducir valores
        Scanner entrada= new Scanner(System.in);
        String idPieza;
        int numArticulos;
        double precioUnitario;
        String descripcion;



        System.out.println("Dame id de pieza: ");
        idPieza=entrada.nextLine();

        System.out.println("Dame numero de articulos");
        numArticulos=entrada.nextInt();

        System.out.println("Dame precio unitario");
        precioUnitario=entrada.nextDouble();

        Factura miFactura= new Factura(idPieza,numArticulos,precioUnitario);

        System.out.println("Desea agregar una descripcion del producto?");
        System.out.printf("%s\n%s","Si presione 1","No presione 2:");
        int decision= entrada.nextInt();
        if(decision==1){
            System.out.println("Agrega descriocion: ");
            entrada.nextLine();
            descripcion =entrada.nextLine();
            miFactura.setDescriPieza(descripcion);
        }
        System.out.printf("%s\n%f","El monto de factura es: ", miFactura.getMontoFactura());


    }
}
