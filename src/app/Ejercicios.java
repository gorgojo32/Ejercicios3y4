
package app;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jpber
 */
public class Ejercicios {
   //Estos ejercicios son los que dejo de 3ras 
    public static void main(String[] args) {
 // Imprimir un mensaje en color negro
        imprimirEnColor("Este mensaje esta en color negro.", 30);
        
        // Imprimir un mensaje donde una parte está en color negro y otra en color verde
        imprimirEnColor("Esta parte esta en color negro, y esta en color verde.", 30, 32);
        
        // Imprimir un mensaje en color rojo
        imprimirEnColor("Este mensaje esta en color rojo.", 31);
        
        // Imprimir una línea de asteriscos en color rojo
        imprimirEnColor("", 31);
        
        // Imprimir un mensaje en color verde
        imprimirEnColor("Este mensaje esta en color verde.", 32);
        
        // Imprimir un mensaje en color naranja (amarillo)
        imprimirEnColor("Este mensaje esta en color naranja (amarillo).", 33);
        
        // Imprimir un mensaje en color azul
        imprimirEnColor("Este mensaje esta en color azul.", 34);
        
        // Imprimir un mensaje en color morado
        imprimirEnColor("Este mensaje esta en color morado.", 35);
        
        // Imprimir un mensaje en color cian
        imprimirEnColor("Este mensaje esta en color cian.", 36);
        
        // Imprimir un mensaje en color blanco
        imprimirEnColor("Este mensaje está en color blanco.", 37);
        
        // Imprimir un mensaje en diferentes colores y luego restablecer el color a su valor predeterminado
        imprimirEnColor("Este mensaje está en varios colores, y luego vuelvo al color predeterminado.", 31, 32, 33, 34, 35, 36, 37, 0);
        
        // Imprimir un carácter específico
        char caracter = 'A';
        System.out.printf("Carácter especifico: %c%n", caracter);
        
        // Imprimir un número entero en base decimal
        int numeroEntero = 123;
        System.out.printf("Número entero en base decimal: %d%n", numeroEntero);
        
        // Imprimir un número flotante en notación exponencial
        double numeroFlotante = 12345.6789;
        System.out.printf("Número flotante en notación exponencial: %e%n", numeroFlotante);
        
        // Imprimir un número flotante
        System.out.printf("Número flotante: %.2f%n", numeroFlotante);
        
        // Imprimir un número entero en base 8
        int numeroOctal = 64;
        System.out.printf("Número en base 8: %o%n", numeroOctal);
        
        // Imprimir una cadena de caracteres
        String cadena = "Hola, mundo!";
        System.out.printf("Cadena de caracteres: %s%n", cadena);
        
        // Imprimir un número entero en base 16
        int numeroHexadecimal = 255;
        System.out.printf("Número en base 16: %x%n", numeroHexadecimal);
        
        // Imprimir la fecha y hora actuales
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHoraActual = dateFormat.format(new Date());
        System.out.printf("Fecha y hora actuales: %s%n", fechaHoraActual);
    }

    // Método para imprimir un mensaje en un color específico
    private static void imprimirEnColor(String mensaje, int... colores) {
        StringBuilder formato = new StringBuilder("\u001B[");
        for (int i = 0; i < colores.length; i++) {
            formato.append(colores[i]);
            if (i < colores.length - 1) {
                formato.append(";");
            }
        }
        formato.append("m%s\u001B[0m%n");
        System.out.printf(formato.toString(), mensaje);

        
        
        
    
        String nombreEmpresa = "Artesanías Nobsa";
        String direccion = "Carrera 8 Centro";
        String celular = "3136789012";
        
        // Datos de la factura
        String numeroFactura = "F123456";
        
        // Lista de artículos
        String[] articulos = {"Jarrón de barro", "Tapete tejido", "Figura de madera", "Pulsera artesanal"};
        int[] cantidades = {2, 1, 3, 5};
        double[] preciosUnitarios = {45000.00, 80000.00, 25000.00, 12000.00};
        
        // Calcular el total
        double total = 0;
        double[] totalesPorArticulo = new double[articulos.length];
        for (int i = 0; i < articulos.length; i++) {
            totalesPorArticulo[i] = cantidades[i] * preciosUnitarios[i];
            total += totalesPorArticulo[i];
        }
        
        // Imprimir la factura
        imprimirEncabezado(nombreEmpresa, direccion, celular);
        imprimirDatosFactura(numeroFactura);
        imprimirTabla(articulos, cantidades, preciosUnitarios, totalesPorArticulo);
        imprimirTotal(total);
        imprimirMensajeAgradecimiento();
    }

    private static void imprimirEncabezado(String nombre, String direccion, String celular) {
        System.out.println("--------------------------------------------------");
        System.out.println("          " + nombre);
        System.out.println("          " + direccion);
        System.out.println("          Celular: " + celular);
        System.out.println("--------------------------------------------------");
    }

    private static void imprimirDatosFactura(String numeroFactura) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHoraActual = dateFormat.format(new Date());
        
        System.out.println("Número de Factura: " + numeroFactura);
        System.out.println("Fecha y Hora: " + fechaHoraActual);
        System.out.println("--------------------------------------------------");
    }

    private static void imprimirTabla(String[] articulos, int[] cantidades, double[] preciosUnitarios, double[] totalesPorArticulo) {
        System.out.printf("%-20s %-10s %-15s %-10s%n", "Artículo", "Cantidad", "Precio Unitario", "Total");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < articulos.length; i++) {
            System.out.printf("%-20s %-10d $%-14.2f $%-10.2f%n", 
                articulos[i], cantidades[i], preciosUnitarios[i], totalesPorArticulo[i]);
        }
        
        System.out.println("--------------------------------------------------");
    }

    private static void imprimirTotal(double total) {
        System.out.printf("Total General: $%-10.2f%n", total);
        System.out.println("--------------------------------------------------");
    }

    private static void imprimirMensajeAgradecimiento() {
        System.out.println("¡Gracias por su compra en Artesanías Nobsa!");
        System.out.println("--------------------------------------------------");

    }
}
