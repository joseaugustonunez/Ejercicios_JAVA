package Ejercicio1;

public class Main {
    public static void main(String args[]){
        
        Ejercicio ejercicio = new Ejercicio();
        
        ejercicio.establecerA(3);
        ejercicio.establecerB(2);
        ejercicio.establecerC(8);

        System.out.println("Valor A:"+ ejercicio.obtenerA());
        System.out.println("Valor B:"+ ejercicio.obtenerB());
        System.out.println("Valor C:"+ ejercicio.obtenerC());

        System.out.println("Valor de la discriminante es: "+ejercicio.discriminante());
        System.out.println("Valor: "+ejercicio.solucionUno());

    }
}
