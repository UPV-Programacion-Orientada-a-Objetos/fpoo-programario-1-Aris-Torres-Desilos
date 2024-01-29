import java.util.Scanner;

public class MontoChequeConDesglose {
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
        
        // Cálculo de gastos totales
        double totalGastos = (gastoHotelPorDia + gastoComidaPorDia + otrosGastosPorDia) * numeroDias;
        
        // Cálculo del desglose de gastos
        double gastoHotelTotal = gastoHotelPorDia * numeroDias;
        double gastoComidaTotal = gastoComidaPorDia * numeroDias;
        double otrosGastosTotal = otrosGastosPorDia * numeroDias;
        
        // Mostrar el desglose de gastos y el monto total del cheque
        System.out.println("\nDesglose de gastos:");
        System.out.println("Gasto total en hotel: $" + gastoHotelTotal);
        System.out.println("Gasto total en comida: $" + gastoComidaTotal);
        System.out.println("Gasto total en otros: $" + otrosGastosTotal);
        System.out.println("\nEl monto total del cheque es: $" + totalGastos);
        
        scanner.close();
    }
}
