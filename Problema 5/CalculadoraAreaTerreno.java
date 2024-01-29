import java.util.Scanner;

public class CalculadoraAreaTerreno {

    public static void main(String[] args) {
        // Declaración de variables
        float a, b, c, area_t, area_r, area_total;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Ingresar variables
        System.out.print("Ingrese el lado A: ");
        a = scanner.nextFloat();

        System.out.print("Ingrese el lado B: ");
        b = scanner.nextFloat();

        System.out.print("Ingrese el lado C: ");
        c = scanner.nextFloat();

        // Calcular área del triángulo
        area_t = (b * (a - c)) / 2;

        // Calcular área del rectángulo
        area_r = b * c;

        // Calcular área total
        area_total = area_t + area_r;

        // Mostrar resultado
        System.out.println("Area total del terreno: " + area_total);

        // Cerrar el Scanner
        scanner.close();
    }
}
