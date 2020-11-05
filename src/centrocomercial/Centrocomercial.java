package centrocomercial;
//Este es un nuevo comentario
public class Centrocomercial {
     
    private String almacenes; //Este string muestra el nombre del almacen que se maneja 
    private int aumentoVentas; //Aqui vemos la cantidad de muestras que tenemos
    private int puertasAcceso; //Este muestra las puertas que tiene el centro comercial 
    private String dueno; //Aqui vemos el nombre del dueño del centro comercial
    
    public Centrocomercial (String dueno, int aumentoVentas, int puertasAcceso, int par2, String almacenes){
        this.almacenes = almacenes;
        this.aumentoVentas = aumentoVentas;
        this.puertasAcceso = puertasAcceso;
        this.dueno = dueno;
        this.dinero = new Cajeros("Bancolombia", 10, true);
    }
    
    //Composicion y agregacion 
    
    private Espacios local = null;
    private Cajeros dinero; 
    
    public void aumentoEnergia (){
        aumentoVentas -= 2;
        puertasAcceso += 1;    
    }
    
    public void vender (String dueno){
        this.dueno = dueno;     
    }
    
    public int getAumentoVentas() {
        return aumentoVentas;
    }

    public void setAumentoVentas(int aumentoVentas) {
        this.aumentoVentas = aumentoVentas;
    }

    public int getPuertasAcceso() {
        return puertasAcceso;
    }

    public void setPuertasAcceso(int puertasAcceso) {
        this.puertasAcceso = puertasAcceso;
    }

    public Espacios getLocal() {
        return local;
    }

    public void setLocal(Espacios local) {
        this.local = local;
    }

    public Cajeros getDinero() {
        return dinero;
    }

    //Aqui comienza el metodo get y set
    public void setDinero(Cajeros dinero) {
        this.dinero = dinero;
    }

    public String getAlmacenes() {
        return almacenes;
    }
            
    public void setAlmacenes(String almacenes){
        this.almacenes = almacenes;
    }
    
    public int getaumentoVentas() {
        return aumentoVentas;
    }
    
    public void setaumentoVentas(int aumentoVentas) {
        this.aumentoVentas = aumentoVentas;
    }
                
    public int getpuertasAcceso() {
        return puertasAcceso;
    }
            
    public void setpuertasAcceso(int puertasAcceso) {
        this.puertasAcceso = puertasAcceso;
    }
            
    public String getDueno () {
        return dueno;
    }
            
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
            
    public static void main(String[] args){
        Centrocomercial chipichape = new Centrocomercial("Gabriela", 
                15, 
                12, 
                4, 
                "Zara");
        
        //Agregacion:
        
        Cajeros dinero = new Cajeros("Bancolombia", 15, true);
        
        chipichape.getDinero();
        
        System.out.println("El nombre de los cajeros que se encuentran en este cc:");
        System.out.println(chipichape.getDinero().getNombre());
        System.out.println("La cantidad de empleados de estos cajeros/bancos son:");
        System.out.println(chipichape.getDinero().getTrabajadores());
        System.out.println("Cajeros automaticos:");
        System.out.println(chipichape.getDinero().getAutomatico());
    }    
}
