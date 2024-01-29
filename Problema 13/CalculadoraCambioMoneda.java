import java.util.Scanner;

public class CalculadoraCambioMoneda {

    public static void main(String[] args) {
        // Declaración de variables
        double pesos, tasaCambio, cantidadDolares;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Ingreso de la cantidad en pesos
        System.out.print("Ingrese la cantidad en pesos: ");
        pesos = scanner.nextDouble();

        // Ingreso de la tasa de cambio
        System.out.print("Ingrese la tasa de cambio: ");
        tasaCambio = scanner.nextDouble();

        // Cálculo de la cantidad en dólares
        cantidadDolares = pesos * tasaCambio;

        // Mostrar el resultado
        System.out.println("Con " + pesos + " pesos, puede adquirir " + cantidadDolares + " dólares.");

        // Cerrar el Scanner
        scanner.close();
    }
}
