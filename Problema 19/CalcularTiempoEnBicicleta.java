import java.util.Scanner;

public class CalcularTiempoEnBicicleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entradas
        System.out.println("Ingrese la distancia entre ciudades (en km):");
        double distancia_entre_ciudades = scanner.nextDouble();

        System.out.println("Ingrese la velocidad de la persona en bicicleta (en km/h):");
        double velocidad = scanner.nextDouble();
        
        // Calcular el tiempo
        double tiempo = distancia_entre_ciudades / velocidad;
        
        // Salida
        System.out.println("El tiempo que tarda en llegar es: " + tiempo + " horas");
        
        scanner.close();
    }
}
