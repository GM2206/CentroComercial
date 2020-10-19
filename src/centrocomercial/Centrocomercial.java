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
    }
    
    public void aumentoEnergia (){
        aumentoVentas -= 2;
        puertasAcceso += 1;    
    }
    
    public void vender (String dueno){
        this.dueno = dueno;     
    }
        
    //Aqui comienza el metodo get y set
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
        
        Almacen01 almacen01 = new Almacen01("Forever21", 
                250, 
                20, "Sebastian", 100, 2, 5, "Ropa Juvenil");
      
        System.out.println(String.format("Nombre almacen: %s", almacen01.getNombreDelAlmacen()));
        System.out.println(String.format("Cantidad de Ventas: %d", almacen01.getCantidadDeVentas()));
        System.out.println(String.format("La cantidad de trabajadores es: %d", almacen01.getNumeroDeTrabajadores()));
        System.out.println(String.format("El nombre del dueño es: %s", almacen01.getDueno()));
        System.out.println(String.format("Aumento de ventas es: %d", almacen01.getaumentoVentas()));
        System.out.println(String.format("Las puuertas de acceso son: %d", almacen01.getpuertasAcceso()));
        System.out.println(String.format("Part2, equivale a: %d", almacen01.getAlmacenes()));
    }    
}
