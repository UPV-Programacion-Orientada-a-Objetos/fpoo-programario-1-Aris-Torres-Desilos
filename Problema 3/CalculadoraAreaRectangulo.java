import java.util.Scanner;

public class CalculadoraAreaRectangulo {

    public static void main(String[] args) {
        // Declarar variables
        double base, altura, area;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Ingresar la base del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        base = scanner.nextDouble();

        // Ingresar la altura del rectángulo
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = scanner.nextDouble();

        // Calcular el área del rectángulo
        area = base * altura;

        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);

        // Cerrar el Scanner
        scanner.close();
    }
}
