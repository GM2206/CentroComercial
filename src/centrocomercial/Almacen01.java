package centrocomercial;

public class Almacen01 extends Centrocomercial{
    private String nombreDelAlmacen;
    private int cantidadDeVentas;
    private int numeroDeTrabajadores;

    public Almacen01(String nombreDelAlmacen, int cantidadDeVentas, int numeroDeTrabajadores, String dueno, int aumentoVentas, int puertasAcceso, int par2, String almacenes) {
        super(dueno, aumentoVentas, puertasAcceso, par2, almacenes);
        this.nombreDelAlmacen = nombreDelAlmacen;
        this.cantidadDeVentas = cantidadDeVentas;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public String getNombreDelAlmacen() {
        return nombreDelAlmacen;
    }

    public void setNombreDelAlmacen(String nombreDelAlmacen) {
        this.nombreDelAlmacen = nombreDelAlmacen;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }
    
    
}
