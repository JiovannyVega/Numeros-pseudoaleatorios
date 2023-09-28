package Algoritmos_no_congruenciales;

import java.util.Scanner;

import Principal.Metodos;

public class ProductosMedios {
    public static void inicio() {
        Scanner leer = new Scanner(System.in);
        int semilla_0, semilla_1, numeros;
        System.out.println("Ingresa la primera semilla:\t");
        semilla_0 = leer.nextInt();
        System.out.println("Ingresa la segunda semilla:\t");
        semilla_1 = leer.nextInt();
        System.out.println("Define cuantos numeros ri desea generar:\t");
        numeros = leer.nextInt();
        int x[] = new int[numeros + 2];
        x[0] = semilla_0;
        x[1] = semilla_1;
        for (int i = 0; i < numeros; i++) {
            x[i + 2] = Metodos.NumerosMedios4(x[i] * x[i + 1]);
        }
        for (int i = 0; i < numeros; i++) {
            System.out.print("X" + (i + 1) + "= " + x[i + 2]);
            System.out.println("\n\tr" + (i + 1) + "= " + Metodos.get4Decimals(x[i + 2]));
        }
        leer.close();
    }
}
