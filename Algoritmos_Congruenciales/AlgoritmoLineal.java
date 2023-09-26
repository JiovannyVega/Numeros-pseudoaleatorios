package Algoritmos_Congruenciales;

import java.util.Scanner;

import Principal.Metodos;

public class AlgoritmoLineal {
    public static void inicio() {
        Scanner leer = new Scanner(System.in);
        int semilla, a, c, m;
        System.out.println("Ingresa la semilla inicial (X0):\t");
        semilla = leer.nextInt();
        System.out.println("Ingresa la constante multiplicativa (a):\t");
        a = leer.nextInt();
        System.out.println("Ingresa la constante aditiva (c):\t");
        c = leer.nextInt();
        System.out.println("Ingresa el modulo (m):\t");
        m = leer.nextInt();
        int x[] = new int[m + 1];
        x[0] = semilla;
        for (int i = 0; i < m; i++) {
            x[i + 1] = ((a * x[i]) + c) % m;
            System.out.print("X" + (i + 1) + "= " + x[i + 1]);
            double d = x[i + 1];
            d /= (m - 1);
            System.out.println("\n\tr" + (i + 1) + "= " + Metodos.format4Dec(d));
        }
        leer.close();
    }
}
