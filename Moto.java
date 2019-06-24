package onready;

public class Moto extends Vehiculo{
    
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, double precio, String precio2) {
        super(marca, modelo, precio, precio2);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()+" // Cilindrada: "+cilindrada+" // Precio: "+super.getPrecio2();
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void encender() {
        // Para implementar a futuro
    }

    @Override
    public void acelerar() {
        // Para implementar a futuro
    }

    @Override
    public void frenar() {
        // Para implementar a futuro
    }

    @Override
    public void apagar() {
        // Para implementar a futuro
    }

}
