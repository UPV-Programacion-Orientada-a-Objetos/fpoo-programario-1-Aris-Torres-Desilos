import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        // Definir variables
        double suma = 0;
        double promedio;
        double calificacion;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Ciclo de calificaciones
        for (int i = 1; i <= 4; i++) {
            // Calificación del examen i
            System.out.print("Ingrese la calificación del examen " + i + ": ");
            calificacion = scanner.nextDouble();

            // Sumar acumulador
            suma = suma + calificacion;
        }

        // Calcular promedio
        promedio = suma / 4;

        // Mostrar resultado
        System.out.println("El promedio de las calificaciones es: " + promedio);

        // Cerrar el Scanner
        scanner.close();
    }
}
