import java.util.Scanner;

public class CalcularCostoLlamada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tiempo que dura la llamada (en minutos):");
        double tiempo_llamada = scanner.nextDouble();

        System.out.println("Ingrese el costo por minuto:");
        double costo_por_minuto = scanner.nextDouble();
        
        double costo_llamada = tiempo_llamada * costo_por_minuto;
        
        System.out.println("El costo de la llamada es: $" + costo_llamada);
        
        scanner.close();
    }
}
