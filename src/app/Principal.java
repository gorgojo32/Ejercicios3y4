/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author jpber
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("\033[30m no escales una montaña para que todo el mundo pueda verte");

        System.out.println("\033[30m no escales una montaña \033[32m para que todo el mundo pueda verte");

        System.out.println("\033[34m no escales una montaña para que todo el mundo pueda verte");

        System.out.println("\033[37m no escales una montaña \033[36m para que todo el mundo pueda verte");
        
        
        System.out.println("\033[31m no escales una montaña para que todo el mundo pueda verte");

        System.out.println("\033[33m no escales una montaña \033[41m para que todo el mundo pueda verte");

        System.out.println("\033[38m no escales una montaña para que todo el mundo pueda verte");

        System.out.println("\033[39m no escales una montaña \033[40m para que todo el mundo pueda verte");
        
        
        //printf(%[posicion dato$] [indicador formato][ancho][.precision]caracter de conversion);
          //INDICADORES DE FORMATO
        /*
        Alineacion ala izquierdas
        (mostarar los numeros negativos entre parentecis ,
        muestra el separador decimal +
        mostrap el signo psitivo en los numeros pocitivos rellenar con 0 con ceros)
        ** CARACTERES DE CONVERCION **
        D Numero entero decimal
        f Numero real con puto sijo
        E,e numero real con notacion cientifica
        g,para numeros muy grandes
        X,x numero entero en base hexadecimal
        s string
        S string en masyusculas
        C,c caracter unicode*/
        char c = 'A';
        System.err.printf("Caracter:  %c%n",c);
        
        
        int num = 152;
        System.err.printf("Numero decimal: %d%n",num);
        
        double exp = 123456.789;
        System.err.printf("Notacion exponencial: %e%n",exp);
        
        float f1 = 123456.789f;
        System.err.printf("Numeros flotante: %.2f%n",f1);
        
        
        int oc= 12;
        System.err.printf("Numero octal: %o%n",oc);     
        
        
        int hex = 365; 
        System.err.printf("Numero octal: %x%n",hex);
        
        String srt= "Adso,Tarde";
        System.err.printf("Cadena: %s%n",srt);
        
        Date dia = new Date();
        System.err.printf("fecha completa: %tc%n",dia);
        
        System.err.printf("fecha corta: %tD%n",dia);
        
        System.err.printf("Hora (24 horas): %tT%n",dia);
        
        System.err.printf("Anio: %tY%n",dia);
        
        System.err.printf("Mes (corto): %tb%n",dia);
        
        
        
        double expPrecision = 12345.6789;
        System.err.printf("Exponencial con Precision: %.3e%n ", expPrecision);
        
        
        //Elaborar factura
        String nombreEstablecimiento = "COMPUTRON";
        String direccion = "Calle 6 No 1-20";
        String celular = "celular: 3138518764";
        
        //Numero factura y fecha Actual
        String numeroFactura = "F123456";
        Date fechaActual = new Date();
        String fechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(fechaActual);
      
        
        System.out.println();
        System.out.println("========================");
        System.out.println(nombreEstablecimiento);
        System.out.println(direccion);
        System.out.println(celular);
        System.out.println("========================");
        System.out.println("No Factura: "+ numeroFactura );
        System.err.println("Fecha y Hora: "+ fechaHora);
        
        
        
        
        
        
        double total =2000000.50 + (2*200000.35)+120000.20+270000.50;
        System.out.printf("Total:       $%,.2f%n",total);
        System.out.println("gracias por la compra!!!");
        System.out.println("========================================");
        
    }
}
