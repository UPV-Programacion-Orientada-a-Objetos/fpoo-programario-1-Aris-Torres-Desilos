import java.util.Scanner;

public class SumaDeDosNumeros {
    public static void main(String[] args) {
        //entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        scanner.close();

        //suma de los dos números
        double suma = numero1 + numero2;

        // Mostrar el resultado
        System.out.println("La suma de es: " + suma);
    }
}
