package Algoritmos_Congruenciales;

import java.util.Scanner;
import java.util.Vector;

import Principal.Metodos;

public class AlgoritmoAditivo {
    public static void inicio() {
        Scanner leer = new Scanner(System.in);
        Vector<Integer> vector = new Vector<Integer>(0);
        int m, n;
        System.out.println("Indica con cuantos numeros iniciará Xi:\t");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el valor de X" + i + ":\t");
            vector.add(leer.nextInt());
        }
        System.out.println("Ingrese el modulo:\t");
        m = leer.nextInt();
        System.out.println("Indique cuantos numeros ri desea generar:\t");
        for(int i = 0; i < leer.nextInt(); i++) {
            vector.add(vector.get(i) + vector.get(i + n - 2));
            System.out.println("Hola mundo");
            System.out.print("X" + (i + 1) + "= " + vector.get(i + n - 1));
            double d = vector.get(i + n + 1);
            d /= (m - 1);
            System.out.println("\n\tr" + (i + 1) + "= " + Metodos.format4Dec(d));
        }
        leer.close();
    }
}
