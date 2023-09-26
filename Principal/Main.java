package Principal;

import java.util.Scanner;

import Algoritmos_Congruenciales.AlgoritmoAditivo;
import Algoritmos_Congruenciales.AlgoritmoLineal;
import Algoritmos_Congruenciales.AlgoritmoMultiplicativo;
import Algoritmos_no_congruenciales.CuadradosMedios;
import Algoritmos_no_congruenciales.MultiplicadorConstante;
import Algoritmos_no_congruenciales.ProductosMedios;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona el algoritmo que deseas usar:");
        System.out.println("Algoritmos no congruanciales");
        System.out.println("1. Algoritmo de cuadrados medios\t2. Algoritmo de productos medios\t3. Algoritmo de multiplicador constante");
        System.out.println("Algoritmos congruenciales:");
        System.out.println("4. Lineal\t5. Multiplicativo\t6. Aditivo\t7. Cuadratico");
        switch (leer.nextInt()) {
            case 1:
                CuadradosMedios.inicio();
                break;
            case 2:
                ProductosMedios.inicio();
                break;
            case 3:
                MultiplicadorConstante.inicio();
                break;
            case 4:
                AlgoritmoLineal.inicio();
                break;
            case 5:
                AlgoritmoMultiplicativo.inicio();
                break;
            case 6:
                AlgoritmoAditivo.inicio();
                break;
            default:
                System.out.println("Favor de elegir un numero correcto");
                break;
        }
        leer.close();
    }
}
