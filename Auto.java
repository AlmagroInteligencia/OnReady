package onready;

public class Auto extends Vehiculo {

    private int puertas;

    public Auto(String marca, String modelo, int puertas, double precio, String precio2) {
        super(marca, modelo, precio, precio2);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString()+" // Puertas: "+puertas+" // Precio: "+super.getPrecio2();
    }
    
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
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
