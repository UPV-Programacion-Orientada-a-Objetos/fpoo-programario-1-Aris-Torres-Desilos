import java.util.Scanner;

public class MontoCheque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.println("Ingrese el número de días que estará en Monterrey:");
        int numeroDias = scanner.nextInt();
        
        System.out.println("Ingrese el gasto diario en hotel:");
        double gastoHotelPorDia = scanner.nextDouble();
        
        System.out.println("Ingrese el gasto diario en comida:");
        double gastoComidaPorDia = scanner.nextDouble();
        
        System.out.println("Ingrese otros gastos diarios:");
        double otrosGastosPorDia = scanner.nextDouble();
        
        // Calcular el total de gastos
        double totalGastos = (gastoHotelPorDia + gastoComidaPorDia + otrosGastosPorDia) * numeroDias;
        
        // Mostrar el monto del cheque
        System.out.println("El monto del cheque es: $" + totalGastos);
        
        scanner.close();
    }
}
