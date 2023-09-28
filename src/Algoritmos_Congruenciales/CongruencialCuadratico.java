package Algoritmos_Congruenciales;

import java.util.Scanner;

import Principal.Metodos;

public class CongruencialCuadratico {
    public static void inicio() {
        Scanner leer = new Scanner(System.in);
        int x0, a, m, b, c, aux;
        System.out.println("Inserte la semilla inicial (X0):\t");
        x0 = leer.nextInt();
        aux = x0;
        System.out.println("Inserte el modulo (m):\t");
        m = leer.nextInt();
        System.out.println("Insterte a:\t");
        a = leer.nextInt();
        System.out.println("Insterte b:\t");
        b = leer.nextInt();
        System.out.println("Insterte c:\t");
        c = leer.nextInt();
        for(int i = 0; i < m; i++) {
            aux = ((a * (aux * aux)) + (b * aux) + c) % m;
            System.out.println("X" + (i + 1) + "= " + aux);
            double d = aux;
            d  /= (m - 1);
            System.out.println("\n\tr" + (i + 1) + "= " + Metodos.format4Dec(d));
        }
        leer.close();
    }
}
