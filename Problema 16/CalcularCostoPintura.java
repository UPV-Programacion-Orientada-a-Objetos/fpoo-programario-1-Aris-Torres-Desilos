import java.util.Scanner;

public class CalcularCostoPintura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el área en metros cuadrados a pintar:");
        double m2_pintura = scanner.nextDouble();

        System.out.println("Ingrese el precio por metro cuadrado de pintura:");
        double precio_por_m2 = scanner.nextDouble();

        double costo_total = m2_pintura * precio_por_m2;

        System.out.println("El costo total del trabajo es: $" + costo_total);

        scanner.close();
    }
}
