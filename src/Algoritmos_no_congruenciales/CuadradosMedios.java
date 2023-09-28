package Algoritmos_no_congruenciales;

import java.util.Scanner;

import Principal.Metodos;

public class CuadradosMedios {
    public static void inicio () {
        Scanner leer = new Scanner(System.in);
        int semilla, numeros;
        System.out.println("Ingresa la semilla inicial:\t");
        semilla = leer.nextInt();
        System.out.println("Define cuantos numeros ri desea generar:\t");
        numeros = leer.nextInt();
        int x[] = new int[numeros + 1];
        x[0] = semilla;
        for (int i = 0; i < numeros; i++) {
            x[i + 1] = Metodos.NumerosMedios4(x[i] * x[i]);
            System.out.print("X" + (i + 1) + "= " + x[i + 1]);
            System.out.println("\n\tr" + (i + 1) + "= " + Metodos.get4Decimals(x[i + 1]));
        }
        leer.close();
    }
}
