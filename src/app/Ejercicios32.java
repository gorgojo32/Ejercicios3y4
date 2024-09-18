/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class Ejercicios32 {
public static boolean esElegibleParaBeca(double promedio, int actividades, double ingresosFamiliares) {
        return promedio >= 85 && actividades >= 3 && ingresosFamiliares < 30000000;
    }

    public static String clasificarUsuario(boolean logueado, boolean esAdmin) {
        if (esAdmin) {
            return "administrador";
        } else if (logueado) {
            return "usuario registrado";
        } else {
            return "visitante";
        }
    }

    public static boolean esInversionViable(double capital, double retornoEsperado, double riesgoAsociado) {
        return capital > 100000000 && retornoEsperado >= 10 && riesgoAsociado < 20;
    }

    public static double calcularSalarioNeto(double salarioBruto) {
        double impuestos = salarioBruto * 0.20;
        double seguridadSocial = salarioBruto * 0.05;
        double otrosDescuentos = 200000;
        return salarioBruto - impuestos - seguridadSocial - otrosDescuentos;
    }

    public static String asignarPrioridad(String urgencia, String impacto) {
        if (urgencia.equals("crítica") || impacto.equals("alto")) {
            return "alta";
        } else if (urgencia.equals("alta") || impacto.equals("medio")) {
            return "media";
        } else {
            return "baja";
        }
    }

    public static boolean esElegibleParaSeguroSalud(int edad, boolean tieneEnfermedadesCronicas, boolean esFumador) {
        return edad == 30 && !tieneEnfermedadesCronicas && !esFumador;
    }

    public static boolean esProyectoRentable(double ingresos, double costosIniciales, double costosOperativos, int años) {
        double costosTotales = costosIniciales + (costosOperativos * años);
        return ingresos > costosTotales;
    }

    public static double calcularImpuestoPropiedad(double valorPropiedad, String tipoPropiedad) {
        double tasa = tipoPropiedad.equals("residencial") ? 0.012 : 0.02;
        return valorPropiedad * tasa;
    }

    public static boolean cumpleNormasAmbientales(double co2, double agua, double residuos) {
        return co2 <= 100 && agua <= 40000 && residuos <= 150;
    }

    public static double calcularPensionJubilacion(int añosServicio, double salarioPromedio) {
        return añosServicio * salarioPromedio * 0.10;
    }

    public static String clasificarRiesgoInversion(double monto, double volatilidad) {
        if (volatilidad < 5) {
            return "bajo";
        } else if (volatilidad <= 15) {
            return "medio";
        } else {
            return "alto";
        }
    }

    public static boolean cumpleNormativaConstruccion(int pisos, boolean materialesResistentes, boolean diseñoAntisismico) {
        return pisos == 10 && materialesResistentes && diseñoAntisismico;
    }

    public static double calcularCostoTotalServicios(double internet, double cable, double telefono, double descuento) {
        double total = internet + cable + telefono;
        return total * (1 - descuento);
    }

    public static boolean esElegibleParaAdopcion(double ingresoMensual, boolean entornoAdecuado, boolean historialPositivo) {
        return ingresoMensual > 2000000 && entornoAdecuado && historialPositivo;
    }

    public static double calcularImpuestosImportacion(double valorProducto, double tasa) {
        return valorProducto * tasa;
    }

    public static double calcularEficienciaEnergetica(double consumoAnual, double porcentajeSolar, double ahorroEnergetico) {
        double consumoReducido = consumoAnual * (1 - ahorroEnergetico);
        return consumoReducido * (1 - porcentajeSolar);
    }

    public static double calcularBonificacion(double ventas) {
        double bonificacion = 0;
        if (ventas <= 50000000) {
            bonificacion = ventas * 0.05;
        } else {
            bonificacion = 50000000 * 0.05 + (ventas - 50000000) * 0.10;
        }
        return bonificacion;
    }

    public static String evaluarImpactoSocial(int personasBeneficiadas, int personasAfectadas, double costo) {
        double ratio = personasBeneficiadas / (double) personasAfectadas;
        if (ratio > 10 && costo < 5000000000L) {
            return "positivo";
        } else {
            return "negativo";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite cuantos años tiene:");
        int edad = scanner.nextInt();
        System.out.println("Digite su salario (ingreso anual):");
        int hola = scanner.nextInt();
        System.out.println("Cuanta puntuacion tiene: ");
        int puntuacion = scanner.nextInt();
        if (edad > 25 && hola > 50000000 && puntuacion > 700) {
            System.out.println("Es elegible para un préstamo hipotecario.");
        } else {
            System.out.println("No es elegible para un préstamo hipotecario.");
        }


        System.out.println("Digite el transporte:");
        String Automovil = scanner.nextLine();

        System.out.println("Digite cuantos kilometros recorrio:");
        int Kilometros = scanner.nextInt();

        int uno = 1500 * Kilometros;
        int dos = 900 * Kilometros;
        int tres = 3000 * Kilometros;

        if (Automovil == "carro") {
            System.out.println("Digite cuantos pasajeros lleva:");
            int pasajeros = scanner.nextInt();
            if (pasajeros > 3) {
                int total = (int) (uno * 0.9);
                System.out.println("tiene un descuento de:" + total);
            } else {
                System.out.println("el precio total es de:" + uno);
            }

        } else if (Automovil == "bus") {
            System.out.println("Digite cuantos pasajeros lleva:");
            int pasajeros = scanner.nextInt();
            if (pasajeros > 3) {
                int total = (int) (dos * 0.9);
                System.out.println("tiene un descuento de:" + total);
            } else {
                System.out.println("el precio total es de:" + dos);
            }

        } else if (Automovil == "avion") {
            System.out.println("Digite cuantos pasajeros lleva:");
            int pasajeros = scanner.nextInt();
            if (pasajeros > 3) {
                int total = (int) (tres * 0.9);
                System.out.println("tiene un descuento de:" + total);
            } else {
                System.out.println("el precio total es de:" + tres);
            }
        }

        
         System.out.println("Elegible para beca: " + esElegibleParaBeca(86, 3, 25000000));
        System.out.println("Clasificación de usuario: " + clasificarUsuario(true, false));
        System.out.println("Inversión viable: " + esInversionViable(150000000, 12, 15));
        System.out.println("Salario neto: " + calcularSalarioNeto(4000000));
        System.out.println("Prioridad del ticket: " + asignarPrioridad("alta", "medio"));
        System.out.println("Elegible para seguro de salud: " + esElegibleParaSeguroSalud(30, false, false));
        System.out.println("Proyecto rentable: " + esProyectoRentable(200000000, 50000000, 30000000, 5));
        System.out.println("Impuesto propiedad residencial: " + calcularImpuestoPropiedad(250000000, "residencial"));
        System.out.println("Cumple normas ambientales: " + cumpleNormasAmbientales(90, 30000, 140));
        System.out.println("Pensión de jubilación: " + calcularPensionJubilacion(35, 3000000));
        System.out.println("Riesgo de inversión: " + clasificarRiesgoInversion(50000000, 10));
        System.out.println("Cumple normativa construcción: " + cumpleNormativaConstruccion(10, true, true));
        System.out.println("Costo total de servicios: " + calcularCostoTotalServicios(150000, 120000, 90000, 0.15));
        System.out.println("Elegible para adopción: " + esElegibleParaAdopcion(2500000, true, true));
        System.out.println("Impuestos de importación: " + calcularImpuestosImportacion(1000000, 0.05));
        System.out.println("Eficiencia energética: " + calcularEficienciaEnergetica(150000, 0.50, 0.20));
        System.out.println("Bonificación de vendedor: " + calcularBonificacion(100000000));
        System.out.println("Impacto social de la política: " + evaluarImpactoSocial(10000, 1000, 5000000000L));
        
    }
}
