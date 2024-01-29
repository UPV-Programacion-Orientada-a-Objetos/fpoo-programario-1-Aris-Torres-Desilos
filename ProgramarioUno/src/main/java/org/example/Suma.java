package org.example;
import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();
        scanner.close();

        //suma de numerous
        double suma = numero1 + numero2;

        //Resultant
        System.out.println("La suma es: " + suma);
    }
}
