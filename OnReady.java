package onready;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnReady {

    public static void main(String[] args) {
        
        imprimirVehiculos();
        
    } // end main
    
    // Resolución
    public static void imprimirVehiculos() {
        
        // Ingreso inicial de vehículos en el orden dado
        Vehiculo vehiculo1 = new Auto("Peugeot","206",4,200000,"$200.000,00");
        Vehiculo vehiculo2 = new Moto("Honda","Titan","125c",60000,"$60.000,00");
        Vehiculo vehiculo3 = new Auto("Peugeot","208",5,250000,"$250.000,00");
        Vehiculo vehiculo4 = new Moto("Yamaha","YBR","160c", 80500,"$80.500,50");
        
        List<Vehiculo> lista = new ArrayList();
        lista.add(vehiculo1);
        lista.add(vehiculo2);
        lista.add(vehiculo3);
        lista.add(vehiculo4);
        
        // Impresión de los vehículos en el orden dado
        lista.forEach(item->System.out.println(item));
       
        System.out.println("=============================");
                       
        // Confección de una nueva lista con los precios para encontrar máx y mín
        List precios = new ArrayList();
        precios.add(vehiculo1.getPrecio());
        precios.add(vehiculo2.getPrecio());
        precios.add(vehiculo3.getPrecio());
        precios.add(vehiculo4.getPrecio());
        
        // Impresión del vehículo más caro
        if(vehiculo1.getPrecio()==(double)Collections.max(precios))
            System.out.println("Vehículo más caro: "+vehiculo1.getMarca()+" "+vehiculo1.getModelo());    
        if(vehiculo2.getPrecio()==(double)Collections.max(precios)) 
            System.out.println("Vehículo más caro: "+vehiculo2.getMarca()+" "+vehiculo2.getModelo());
        if(vehiculo3.getPrecio()==(double)Collections.max(precios)) 
            System.out.println("Vehículo más caro: "+vehiculo3.getMarca()+" "+vehiculo3.getModelo());
        if(vehiculo4.getPrecio()==(double)Collections.max(precios)) 
            System.out.println("Vehículo más caro: "+vehiculo4.getMarca()+" "+vehiculo4.getModelo());
            
        // Impresión del vehículo más barato
        if(vehiculo1.getPrecio()==(double)Collections.min(precios))
            System.out.println("Vehículo más barato: "+vehiculo1.getMarca()+" "+vehiculo1.getModelo());    
        if(vehiculo2.getPrecio()==(double)Collections.min(precios)) 
            System.out.println("Vehículo más barato: "+vehiculo2.getMarca()+" "+vehiculo2.getModelo());
        if(vehiculo3.getPrecio()==(double)Collections.min(precios)) 
            System.out.println("Vehículo más barato: "+vehiculo3.getMarca()+" "+vehiculo3.getModelo());
        if(vehiculo4.getPrecio()==(double)Collections.min(precios)) 
            System.out.println("Vehículo más barato: "+vehiculo4.getMarca()+" "+vehiculo4.getModelo());
        
        // Búsqueda de si algún vehículo contiene la letra "Y" en su modelo
        String letra = "Y";
        int contiene1 = vehiculo1.getModelo().indexOf(letra);
        int contiene2 = vehiculo2.getModelo().indexOf(letra);
        int contiene3 = vehiculo3.getModelo().indexOf(letra);
        int contiene4 = vehiculo4.getModelo().indexOf(letra);
        
        // Impresión del/los vehículo/s que contengan la letra "Y" en su modelo
        if(contiene1!=-1) System.out.println("Vehículo que contiene en el modelo la letra '"
                 +letra+"': "+vehiculo1.getMarca()+" "+vehiculo1.getModelo()+" "+vehiculo1.getPrecio2());
        if(contiene2!=-1) System.out.println("Vehículo que contiene en el modelo la letra '"
                 +letra+"': "+vehiculo2.getMarca()+" "+vehiculo2.getModelo()+" "+vehiculo2.getPrecio2());
        if(contiene3!=-1) System.out.println("Vehículo que contiene en el modelo la letra '"
                 +letra+"': "+vehiculo3.getMarca()+" "+vehiculo3.getModelo()+" "+vehiculo3.getPrecio2());
        if(contiene4!=-1) System.out.println("Vehículo que contiene en el modelo la letra '"
                 +letra+"': "+vehiculo4.getMarca()+" "+vehiculo4.getModelo()+" "+vehiculo4.getPrecio2());
        
        System.out.println("=============================");
        
        // Impresión de los Vehículos ordenados por precio de mayor a menor
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        
        Collections.sort(lista, new Comparador());
        
        for(Vehiculo v : lista) {
            System.out.println(v.getMarca()+" "+v.getModelo());
        }
        
    } // end imprimirVehiculos
    
} // end Clase OnReady
