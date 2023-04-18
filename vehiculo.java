package ico.fes;

public class vehiculo {
    protected String marca;
    protected String modelo;
    protected String tamanio;

    public vehiculo(String marca, String modelo, String tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String tamaño) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamaño='" + tamanio + '\'' +
                '}';
    }

    public vehiculo() {
    }
    public void encendido(){
        System.out.println("El vehiculo esta encendido");
    }
    public void avanzando(){
        System.out.println("El vehiculo esta avanzando");
    }
}
