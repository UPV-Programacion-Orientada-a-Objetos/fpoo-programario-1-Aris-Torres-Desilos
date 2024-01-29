import java.util.Scanner;

public class CalcularHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del cateto A:");
        double A = scanner.nextDouble();

        System.out.println("Ingrese la longitud del cateto B:");
        double B = scanner.nextDouble();

        double A_cuadrado = A * A;
        double B_cuadrado = B * B;
        double suma_cuadrados = A_cuadrado + B_cuadrado;
        double hipotenusa = Math.sqrt(suma_cuadrados);

        System.out.println("La hipotenusa es: " + hipotenusa);

        scanner.close();
    }
}
