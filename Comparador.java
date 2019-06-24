package onready;

import java.util.Comparator;

public class Comparador implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       Vehiculo v1 = (Vehiculo) o1;
       Vehiculo v2 = (Vehiculo) o2;
       
       int comparador = 0;
       if(v1.getPrecio()>v2.getPrecio()) comparador = -1;
       if(v1.getPrecio()<v2.getPrecio()) comparador = 1;     
       
       return comparador;
    }

}
