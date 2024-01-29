import java.util.Scanner;

public class AhorroAnual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.println("Ingrese el sueldo semanal:");
        double sueldoSemanal = scanner.nextDouble();
        
        // Calcular el ahorro semanal
        double ahorroSemanal = sueldoSemanal * 0.15;
        
        // Calcular el ahorro mensual
        double ahorroMensual = ahorroSemanal * 4; // 4 semanas por mes
        
        // Calcular el ahorro anual
        double ahorroAnual = ahorroMensual * 12; // 12 meses por año
        
        // Mostrar el ahorro anual
        System.out.println("El ahorro anual es: $" + ahorroAnual);
        
        scanner.close();
    }
}
