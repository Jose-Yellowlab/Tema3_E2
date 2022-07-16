package Conceptos_Basicos;

import java.util.Scanner;

public class Tema3_E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular el IVA: ");
        double base = sc.nextDouble();
        System.out.println("El valor con el IVA incluido es: " + resultado(base) + " El IVA es: " + resultado2(base));

    }

    private static double resultado2(double base) {
        return base * 0.21;
    }

    public static double resultado (double base){

        return base * 1.21;
    }
}


