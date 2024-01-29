import java.util.Scanner;

public class CalculadoraPago {

    public static void main(String[] args) {
        // Declaración de variables
        double alto_en_m, ancho_en_m, largo_en_m, precio_por_m3, volumen_en_m3, pago;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresa el valor de alto en metros: ");
        alto_en_m = scanner.nextDouble();

        System.out.print("Ingresa el valor de ancho en metros: ");
        ancho_en_m = scanner.nextDouble();

        System.out.print("Ingresa el valor de largo en metros: ");
        largo_en_m = scanner.nextDouble();

        System.out.print("Ingresa el valor de precio por metro cúbico: ");
        precio_por_m3 = scanner.nextDouble();

        // Cálculos
        volumen_en_m3 = alto_en_m * largo_en_m * ancho_en_m;
        pago = volumen_en_m3 * precio_por_m3;

        // Mostrar resultados
        System.out.println("Valor de pago: " + pago);
        System.out.println("Valor de volumen en metros cúbicos: " + volumen_en_m3);

        // Cerrar el Scanner
        scanner.close();
    }
}
