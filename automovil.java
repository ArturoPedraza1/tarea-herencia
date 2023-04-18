package ico.fes;

public class automovil extends vehiculo {
    protected String capacidad;
    protected String tipo;
    protected String marcadellanta;

    public automovil(String marca, String modelo, String tamaño, String capacidad, String tipo, String marcadellanta) {
        super(marca, modelo, tamaño);
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.marcadellanta = marcadellanta;
    }

    public automovil(String capacidad, String tipo, String marcadellanta) {
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.marcadellanta = marcadellanta;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarcadellanta() {
        return marcadellanta;
    }

    public void setMarcadellanta(String marcadellanta) {
        this.marcadellanta = marcadellanta;
    }

    @Override
    public String toString() {
        return "automovil{" +
                "capacidad='" + capacidad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marcadellanta='" + marcadellanta + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }

    public automovil() {
    }
    public void disponible(){
        System.out.println("El automovil esta disponible");
    }
    public void apagado(){
        System.out.println("El automovil esta apagado");
    }
}
