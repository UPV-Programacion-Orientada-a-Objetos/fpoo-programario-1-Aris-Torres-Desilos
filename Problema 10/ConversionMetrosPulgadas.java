import java.util.Scanner;

public class ConversionMetrosPulgadas {

    public static void main(String[] args) {
        // Declaración de variables
        double metros, pulgadas;

        // Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la cantidad de metros de tela: ");
        metros = scanner.nextDouble();

        // Conversión (1 pulgada = 0.0254 m)
        pulgadas = metros / 0.0254;

        // Salida de resultados
        System.out.println("Se requiere " + pulgadas + " pulgadas de tela.");

        // Cerrar el Scanner
        scanner.close();
    }
}
