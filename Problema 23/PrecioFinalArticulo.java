import java.util.Scanner;

public class PrecioFinalArticulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.println("Ingrese el precio del artículo:");
        double precioArticulo = scanner.nextDouble();
        
        // Calcular descuento
        double descuento = precioArticulo * 0.20;
        
        // Calcular precio con descuento
        double precioConDescuento = precioArticulo - descuento;
        
        // Calcular impuesto (IVA)
        double iva = precioConDescuento * 0.15;
        
        // Calcular precio final
        double precioFinal = precioConDescuento + iva;
        
        // Salida de resultados
        System.out.println("Precio con descuento: $" + precioConDescuento);
        System.out.println("Precio final: $" + precioFinal);
        
        scanner.close();
    }
}
