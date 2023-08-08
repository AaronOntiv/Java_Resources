package Chapter3_12;

public class Factura {
    private String idPieza;
    private String descriPieza;
    private int numArticulos;
    private double precioUnitario;




    public Factura(String idPieza,int numArticulos, double precioUnitario){
        if(numArticulos>0){
            this.numArticulos=numArticulos;
        }

        if(precioUnitario>=0){
            this.precioUnitario=precioUnitario;
        }
        else {
            precioUnitario=0;
        }

        this.idPieza=idPieza;
    }


    public String getDescriPieza() {
        return descriPieza;
    }

    public void setDescriPieza(String descriPieza) {
        this.descriPieza = descriPieza;
    }

    public double getMontoFactura(){
        return numArticulos*precioUnitario;
    }


}
