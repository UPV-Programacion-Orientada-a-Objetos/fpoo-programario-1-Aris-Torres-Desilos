import java.util.Scanner;

public class CalculadoraAreaTriangulo {

    public static void main(String[] args) {
        // Declaración de variables
        double base, altura, area;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la longitud de la base del triángulo: ");
        base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        altura = scanner.nextDouble();

        // Cálculo del área
        area = (base * altura) / 2;

        // Salida de resultados
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el Scanner
        scanner.close();
    }
}
