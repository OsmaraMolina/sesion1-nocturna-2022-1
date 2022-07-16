/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import javax.swing.JOptionPane;

public class ejercicio12 {

    public static void main(String[] args) {
        // Entrada 
        String numeroEnteroString = "10";
        String numeroDecimalString = "5.5";
        int numeroEnteroConvertido = 0;
        Double numeroDecimalConvertido = 0.0;
        //Proceso
        numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
        numeroDecimalConvertido = Double.parseDouble(numeroEnteroString);
        //Salida
        JOptionPane.showMessageDialog(null, "El numero entero Convertido entero es: " + numeroEnteroConvertido);
        JOptionPane.showMessageDialog(null, "El numero string Convertido decimal es: " + numeroDecimalConvertido);

    }
}