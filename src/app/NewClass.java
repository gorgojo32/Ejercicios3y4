
package app;

import java.time.Duration;
import java.time.LocalTime;


//Estos ejercicios son los 4tos que dejo
public class NewClass {
    // 1. Calcular el interés compuesto
    public static double calcularInteresCompuesto(double principal, double tasaInteres, int años) {
        return principal * Math.pow(1 + tasaInteres / 100, años);
    }

    // 2. Calcular el precio final después de aplicar un descuento
    public static double calcularPrecioFinal(double precioOriginal, double descuentoPorcentaje) {
        return precioOriginal * (1 - descuentoPorcentaje / 100);
    }

    // 3. Determinar el número mínimo de trabajadores necesarios
    public static int calcularTrabajadores(int trabajoTotal, int trabajoPorTrabajadorPorDia, int dias) {
        return (int) Math.ceil((double) trabajoTotal / (trabajoPorTrabajadorPorDia * dias));
    }

    // 4. Convertir millas a kilómetros
    public static double millasAKilometros(double millas) {
        return millas * 1.60934;
    }

    // 5. Calcular el área de un círculo
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // 6. Determinar la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // 7. Calcular el volumen de un cilindro
    public static double calcularVolumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    // 8. Calcular la raíz cuadrada
    public static double calcularRaizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    // 9. Calcular el costo total de un préstamo con interés simple
    public static double calcularInteresSimple(double principal, double tasaInteres, int tiempo) {
        return principal * (1 + (tasaInteres / 100) * tiempo);
    }

    // 10. Determinar el ángulo en radianes dado el valor del seno
    public static double calcularAngulo(double valorSeno) {
        return Math.asin(valorSeno);
    }

    // 11. Calcular la diferencia de tiempo en minutos
    public static long calcularDiferenciaMinutos(LocalTime tiempo1, LocalTime tiempo2) {
        return Duration.between(tiempo1, tiempo2).toMinutes();
    }

    // 12. Convertir Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 13. Calcular el promedio de ventas mensuales
    public static double calcularPromedioMensual(double totalAnual, int meses) {
        return totalAnual / meses;
    }

    // 14. Calcular el perímetro de una elipse
    public static double calcularPerimetro(double longitud, double anchura) {
        return Math.PI * (3 * (longitud + anchura) - Math.sqrt((3 * longitud + anchura) * (longitud + 3 * anchura)));
    }

    // 15. Calcular la amortización mensual de un préstamo hipotecario
    public static double calcularAmortizacion(double monto, double tasaInteresAnual, int plazoAnios) {
        double tasaInteresMensual = tasaInteresAnual / 12 / 100;
        int numeroPagos = plazoAnios * 12;
        return (monto * tasaInteresMensual) / (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));
    }

    // 16. Calcular la velocidad promedio
    public static double calcularVelocidad(double distancia, double tiempo) {
        return distancia / tiempo;
    }

    // 17. Calcular la depreciación anual de un activo
    public static double calcularDepreciacion(double costoInicial, double valorResidual, int vidaUtil) {
        return (costoInicial - valorResidual) / vidaUtil;
    }

    // 18. Determinar el máximo común divisor (MCD)
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 19. Calcular la probabilidad de un evento
    public static double calcularProbabilidad(int casosFavorables, int casosTotales) {
        return (double) casosFavorables / casosTotales;
    }

    // 20. Calcular el valor futuro de una anualidad
    public static double calcularValorFuturo(double pago, double tasaInteres, int numPagos) {
        double tasaInteresMensual = tasaInteres / 12 / 100;
        return pago * ((Math.pow(1 + tasaInteresMensual, numPagos) - 1) / tasaInteresMensual);
    }

    public static void main(String[] args) {
        // 1. Interés compuesto
        double monto = calcularInteresCompuesto(1000, 5, 10);
        System.out.println("Monto después de 10 años: " + monto);

        // 2. Precio final después de descuento
        double precioFinal = calcularPrecioFinal(100, 10);
        System.out.println("Precio final: " + precioFinal);

        // 3. Número mínimo de trabajadores
        int trabajadores = calcularTrabajadores(1000, 10, 20);
        System.out.println("Número mínimo de trabajadores: " + trabajadores);

        // 4. Convertir millas a kilómetros
        double kilometros = millasAKilometros(10);
        System.out.println("10 millas son " + kilometros + " kilómetros");

        // 5. Área de un círculo
        double area = calcularArea(5);
        System.out.println("Área del círculo: " + area);

        // 6. Hipotenusa de un triángulo rectángulo
        double hipotenusa = calcularHipotenusa(3, 4);
        System.out.println("Hipotenusa: " + hipotenusa);

        // 7. Volumen de un cilindro
        double volumen = calcularVolumen(3, 7);
        System.out.println("Volumen del cilindro: " + volumen);

        // 8. Raíz cuadrada
        double raiz = calcularRaizCuadrada(16);
        System.out.println("Raíz cuadrada: " + raiz);

        // 9. Costo total de un préstamo con interés simple
        double costoTotal = calcularInteresSimple(1000, 5, 3);
        System.out.println("Costo total del préstamo: " + costoTotal);

        // 10. Ángulo en radianes dado el valor del seno
        double angulo = calcularAngulo(0.5);
        System.out.println("Ángulo en radianes: " + angulo);

        // 11. Diferencia de tiempo en minutos
        LocalTime tiempo1 = LocalTime.of(10, 30);
        LocalTime tiempo2 = LocalTime.of(12, 45);
        long diferenciaMinutos = calcularDiferenciaMinutos(tiempo1, tiempo2);
        System.out.println("Diferencia en minutos: " + diferenciaMinutos);

        

        // 12. Convertir Fahrenheit a Celsius
        double celsius = fahrenheitACelsius(98.6);
        System.out.println("98.6 grados Fahrenheit son " + celsius + " grados Celsius");

        // 13. Promedio mensual de ventas
        double promedioMensual = calcularPromedioMensual(12000, 12);
        System.out.println("Promedio mensual de ventas: " + promedioMensual);

        // 14. Perímetro de una elipse
        double perimetro = calcularPerimetro(5, 3);
        System.out.println("Perímetro de la elipse: " + perimetro);

        // 15. Amortización mensual de un préstamo hipotecario
        double amortizacionMensual = calcularAmortizacion(200000, 4.5, 30);
        System.out.println("Amortización mensual: " + amortizacionMensual);

        // 16. Velocidad promedio
        double velocidadPromedio = calcularVelocidad(150, 3);
        System.out.println("Velocidad promedio: " + velocidadPromedio + " km/h");

        // 17. Depreciación anual de un activo
        double depreciacionAnual = calcularDepreciacion(10000, 2000, 5);
        System.out.println("Depreciación anual: " + depreciacionAnual);

        // 18. Máximo común divisor
        int mcd = calcularMCD(48, 18);
        System.out.println("Máximo común divisor: " + mcd);

        // 19. Probabilidad de un evento
        double probabilidad = calcularProbabilidad(3, 10);
        System.out.println("Probabilidad del evento: " + probabilidad);

        // 20. Valor futuro de una anualidad
        double valorFuturo = calcularValorFuturo(100, 6, 12);
        System.out.println("Valor futuro de la anualidad: " + valorFuturo);
        
    }
}
