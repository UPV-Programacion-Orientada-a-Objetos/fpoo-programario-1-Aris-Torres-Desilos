import java.util.Scanner;

public class CobroEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas utilizadas en el estacionamiento:");
        int horasUtilizadas = scanner.nextInt();

        double cobro = 0;

        if (horasUtilizadas <= 3) {
            cobro = 5;
        } else {
            double excedenteHoras = horasUtilizadas - 3;
            cobro = 5 + excedenteHoras * 1.5;
        }

        System.out.println("El cobro es: $" + cobro);

        scanner.close();
    }
}
