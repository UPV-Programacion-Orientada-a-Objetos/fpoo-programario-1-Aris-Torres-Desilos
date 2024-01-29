import java.util.Scanner;

public class CalculadoraSueldo {

    public static void main(String[] args) {
        // Declaración de variables
        double horas_trabajadas, pago_por_hora, sueldo_semanal;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese las horas trabajadas por el trabajador: ");
        horas_trabajadas = scanner.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        pago_por_hora = scanner.nextDouble();

        // Cálculo del sueldo semanal
        sueldo_semanal = horas_trabajadas * pago_por_hora;

        // Salida de resultados
        System.out.println("El sueldo semanal del trabajador es: " + sueldo_semanal + " pesos.");

        // Cerrar el Scanner
        scanner.close();
    }
}
