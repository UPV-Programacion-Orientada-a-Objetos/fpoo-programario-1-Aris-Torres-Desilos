import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir variables
        int anoNacimiento, anoActual, edad;

        // Ingreso del año de nacimiento
        System.out.println("Ingrese el año de nacimiento:");
        anoNacimiento = scanner.nextInt();

        // Ingreso del año actual
        System.out.println("Ingrese el año actual:");
        anoActual = scanner.nextInt();

        // Calcular la edad
        edad = anoActual - anoNacimiento;

        // Mostrar la edad
        System.out.println("La edad es: " + edad);

        scanner.close();
    }
}
