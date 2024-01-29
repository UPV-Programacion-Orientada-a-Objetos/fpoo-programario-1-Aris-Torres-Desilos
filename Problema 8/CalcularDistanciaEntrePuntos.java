
import java.util.Scanner;

public class CalcularDistanciaEntrePuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del primer punto (X1, Y1):");
        double X1 = scanner.nextDouble();
        double Y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto (X2, Y2):");
        double X2 = scanner.nextDouble();
        double Y2 = scanner.nextDouble();

        double VX = X2 - X1;
        double VY = Y2 - Y1;

        double D = Math.sqrt(Math.pow(VX, 2) + Math.pow(VY, 2));

        System.out.println("La distancia entre los puntos es: " + D);

        scanner.close();
    }
}
