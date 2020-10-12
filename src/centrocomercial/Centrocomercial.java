package centrocomercial;
//Este es un nuevo comentario
public class Centrocomercial {
     
    private String almacenes; 
    private int aumentoVentas;
    private int puertasAcceso; 
    private String dueno;
    
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
        Centrocomercial centroComercialChipichape = new Centrocomercial("Gabriela", 15, 12, 4, "Zara");
        
        System.out.println("El centro comercial cuenta con almacenes" + centroComercialChipichape.getAlmacenes());
        System.out.println("El centro comercial tiene un aumento de " + centroComercialChipichape.getaumentoVentas() + "ventas por día");
        System.out.println("El centro comercial tiene " + centroComercialChipichape.getpuertasAcceso() + "puertas de acceso");
        System.out.println("La dueña del centro comercial es" + centroComercialChipichape.getDueno());
        
        centroComercialChipichape.aumentoEnergia();
        
        System.out.println("El centro comercial cuenta con " + centroComercialChipichape.getAlmacenes() + "almacenes");
        System.out.println("El centro comercial tiene un aumento de " + centroComercialChipichape.getaumentoVentas() + "ventas por día");
        System.out.println("El centro comercial tiene " + centroComercialChipichape.getpuertasAcceso() + "puertas de acceso");
        System.out.println("La dueña del centro comercial es" + centroComercialChipichape.getDueno());
    }    
}
