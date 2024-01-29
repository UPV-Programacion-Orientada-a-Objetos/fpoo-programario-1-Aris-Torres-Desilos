import java.util.Scanner;

public class CalcularAreaFigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la hipotenusa (H):");
        double H = scanner.nextDouble();
        System.out.println("Ingrese el valor del radio (R):");
        double R = scanner.nextDouble();

        double areaTriangulo1 = (R * R) / 2;
        double areaTriangulo2 = (H * R) / 2;
        double areaSemicircunferencia = (Math.PI * R * R) / 2;
        double areaTotal = areaTriangulo1 + areaTriangulo2 + areaSemicircunferencia;

        System.out.println("El área total de la figura es: " + areaTotal);

        scanner.close();
    }
}
