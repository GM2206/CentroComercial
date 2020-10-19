package centrocomercial;

public class Almacen02 extends Centrocomercial{
    private int cantidadDeEnvios;
    private String nombre; 

    public Almacen02(String dueno, int aumentoVentas, int puertasAcceso, int par2, String almacenes) {
        super(dueno, aumentoVentas, puertasAcceso, par2, almacenes);
    }

    public Almacen02(int cantidadDeEnvios, String nombre, String dueno, int aumentoVentas, int puertasAcceso, int par2, String almacenes) {
        super(dueno, aumentoVentas, puertasAcceso, par2, almacenes);
        this.cantidadDeEnvios = cantidadDeEnvios;
        this.nombre = nombre;
    }

    public int getCantidadDeEnvios() {
        return cantidadDeEnvios;
    }

    public void setCantidadDeEnvios(int cantidadDeEnvios) {
        this.cantidadDeEnvios = cantidadDeEnvios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
