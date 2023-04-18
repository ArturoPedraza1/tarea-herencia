package ico.fes;

public class taxi extends automovil {
    protected String conductor;
    protected String tiempolaboral;
    protected String ruta;

    public taxi(String marca, String modelo, String tamaño, String capacidad, String tipo, String marcadellanta, String conductor, String tiempolaboral, String ruta) {
        super(marca, modelo, tamaño, capacidad, tipo, marcadellanta);
        this.conductor = conductor;
        this.tiempolaboral = tiempolaboral;
        this.ruta = ruta;
    }

    public taxi(String capacidad, String tipo, String marcadellanta, String conductor, String tiempolaboral, String ruta) {
        super(capacidad, tipo, marcadellanta);
        this.conductor = conductor;
        this.tiempolaboral = tiempolaboral;
        this.ruta = ruta;
    }

    public taxi(String conductor, String tiempolaboral, String ruta) {
        this.conductor = conductor;
        this.tiempolaboral = tiempolaboral;
        this.ruta = ruta;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getTiempolaboral() {
        return tiempolaboral;
    }

    public void setTiempolaboral(String tiempolaboral) {
        this.tiempolaboral = tiempolaboral;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "taxi{" +
                "conductor='" + conductor + '\'' +
                ", tiempolaboral='" + tiempolaboral + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marcadellanta='" + marcadellanta + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }

    public taxi() {
    }
    public void chambeando(){
        System.out.println("El taxi esta de ruta");
    }
    public void ocupado(){
        System.out.println("El taxi esta fuera de servicio");
    }
}
