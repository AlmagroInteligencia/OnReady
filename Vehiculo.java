package onready;

public abstract class Vehiculo implements Funcionamiento{
    
    private String marca;
    private String modelo;
    private double precio;
    private String precio2;

    public Vehiculo(String marca, String modelo, double precio, String precio2) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.precio2 = precio2;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getPrecio2() {
        return precio2;
    }

    public void setPrecio2(String precio2) {
        this.precio2 = precio2;
    }

}
