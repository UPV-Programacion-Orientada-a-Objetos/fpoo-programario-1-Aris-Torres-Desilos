import java.util.Scanner;

public class CalculadoraAreaCircunferencia {

    public static void main(String[] args) {
        // Declarar variables
        double radio, area;
        final double PI = 3.141592653589793; // Valor de PI

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Ingresar el radio de la circunferencia
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();

        // Calcular el área
        area = PI * radio * radio;

        // Mostrar el resultado
        System.out.println("El área de la circunferencia es: " + area);

        // Cerrar el Scanner
        scanner.close();
    }
}
