import java.util.Scanner;

public class PagoLeche {

    public static void main(String[] args) {
        // Declaración de variables
        float litros, galones, precio_galon, pago;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Ingresar la cantidad de leche en litros
        System.out.print("Ingresa la cantidad de leche en litros: ");
        litros = scanner.nextFloat();

        // Calcular galones
        galones = litros/3.785;

        // Solicitar al usuario el precio por galón
        System.out.print("Ingresa el precio por galón: ");
        precio_galon = scanner.nextFloat();

        // Calcular el pago
        pago = galones * precio_galon;

        // Mostrar resultado
        System.out.println("Por la entrega de " + litros + " litros de leche, se pagará la cantidad de " + pago + " pesos");

        // Cerrar el Scanner
        scanner.close();
    }
}
