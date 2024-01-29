import java.util.Scanner;

public class PagoConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entradas
        System.out.println("Ingrese el consumo de energía eléctrica (en kilowatts):");
        double consumo_en_kw = scanner.nextDouble();
        
        System.out.println("Ingrese el costo por kilowatt:");
        double costo_por_kw = scanner.nextDouble();
        
        // Calcular el pago por el consumo de energía eléctrica
        double pago = consumo_en_kw * costo_por_kw;
        
        // Salida
        System.out.println("El pago por el consumo de energía eléctrica es: $" + pago);
        
        scanner.close();
    }
}
