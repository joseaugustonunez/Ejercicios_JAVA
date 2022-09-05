package Ejercicio2;

public class Main {

    public static void main(String args[])
    {
        Bases bases = new Bases();

        bases.establcerNumero(194);
        bases.establcerBase(5);

        System.out.println("La conversion es:"+bases.convertir());
        System.out.println("La inversion es:"+bases.invertir());

    }
}

