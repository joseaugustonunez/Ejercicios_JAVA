package Ejercicio1;

import java.lang.Math;

public class Ejercicio {

    double a;

    double b;

    double c;

    double solucion1;

    double solucion2;

    public void establecerA(double numA)
    {
        a = numA;
    }

    public double obtenerA()
    {
        return a;
    }

    public void establecerB(double numB)
    {
        b = numB;
    }

    public double obtenerB()
    {
        return b;
    }

    public void establecerC(double numC)
    {
        c = numC;
    }

    public double obtenerC()
    {
        return c;
    }

    public double discriminante()
    {
        double expresion;
        expresion = Math.pow(obtenerB(), 2) - 4*obtenerA()*obtenerC();
        return expresion;
    }
    public double solucionUno(){
        if (discriminante()> 0)
        {
            solucion1=((obtenerB()*(-1))+(Math.sqrt(Math.pow(obtenerB(), 2)- 4*obtenerA()*obtenerC())))/(2*obtenerA());
            solucion2=((obtenerB()*(-1))-(Math.sqrt(Math.pow(obtenerB(), 2)- 4*obtenerA()*obtenerC())))/(2*obtenerA());
            System.out.println("La primera raiz es: " + solucion1);
            System.out.println("La segunda raiz es: " + solucion2);
        }else{
            if (discriminante() == 0)
            {
               solucion1=(obtenerB()*-1)/(2*obtenerA());
               System.out.println("Su raiz es unica y es: " + solucion1);
            }else{
                System.out.println("No tiene raices reales"); 
            }
        }
        return 0;
    }
}