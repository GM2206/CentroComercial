package centrocomercial;

class Espacios {
    private int numeroLocal;
    private Boolean disponibilidad;

    public Espacios(int numeroLocal, Boolean disponibilidad) {
        this.numeroLocal = numeroLocal;
        this.disponibilidad = disponibilidad;
    }

    public int getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(int numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
