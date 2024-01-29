import java.util.Scanner;

public class CalcularCostoBoleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los kilómetros por recorrer:");
        double kilometros_por_recorrer = scanner.nextDouble();

        System.out.println("Ingrese el costo por kilómetro:");
        double costo_por_kilometro = scanner.nextDouble();
        
        double costo_boleto = kilometros_por_recorrer * costo_por_kilometro;
        
        System.out.println("El costo del boleto es: " + costo_boleto);
        
        scanner.close();
    }
}
