package centrocomercial;

class Cajeros {
    private String nombre;
    private int trabajadores;
    private Boolean automatico;

    public Cajeros(String nombre, int trabajadores, Boolean automatico) {
        this.nombre = nombre;
        this.trabajadores = trabajadores;
        this.automatico = automatico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(int trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Boolean getAutomatico() {
        return automatico;
    }

    public void setAutomatico(Boolean automatico) {
        this.automatico = automatico;
    }
}
