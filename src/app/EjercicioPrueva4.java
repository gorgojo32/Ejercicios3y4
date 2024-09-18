/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jpber
 */
public class EjercicioPrueva4 {

    public static void main(String[] args) {
   boolean continuar = true;

        while (continuar) {
            String[] opciones = {"Potencia", "Raíz cuadrada", "Seno", "Coseno", "Salir"};
            int operacion = JOptionPane.showOptionDialog(null, 
                "Elija una operación", 
                "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (operacion) {
                case 0 -> {
                    // Potencia
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
                    double exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exponente:"));
                    double resultadoPotencia = Math.pow(base, exponente);
                    JOptionPane.showMessageDialog(null,
                            String.format("Resultado de %.2f elevado a %.2f es: %.2f", base, exponente, resultadoPotencia));
                 }
                case 1 -> {
                    // Raíz cuadrada
                    double numeroRaiz = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número:"));
                    double resultadoRaiz = Math.sqrt(numeroRaiz);
                    JOptionPane.showMessageDialog(null,
                            String.format("La raíz cuadrada de %.2f es: %.2f", numeroRaiz, resultadoRaiz));
                 }
                case 2 -> {
                    // Seno
                    double anguloSeno = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo en grados:"));
                    double resultadoSeno = Math.sin(Math.toRadians(anguloSeno));
                    JOptionPane.showMessageDialog(null,
                            String.format("El seno de %.2f grados es: %.2f", anguloSeno, resultadoSeno));
                 }
                case 3 -> {
                    // Coseno
                    double anguloCoseno = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo en grados:"));
                    double resultadoCoseno = Math.cos(Math.toRadians(anguloCoseno));
                    JOptionPane.showMessageDialog(null,
                            String.format("El coseno de %.2f grados es: %.2f", anguloCoseno, resultadoCoseno));
                 }
                case 4 -> {
                    // Salir
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                 }
                default -> JOptionPane.showMessageDialog(null, "Operación no válida.");
            }
        }

    }
}
