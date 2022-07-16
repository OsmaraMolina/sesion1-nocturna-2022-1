/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio15 {

    public static void main(String[] args) {
        // ENTRADA
        int numeroIngresado = 0;
        int contadorDescendente = 0;
        int contadorAscendente = 0;
        // proceso
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero:"));
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "**MENU DE CONVERSIONES*" + "\n"
                + "1.PRESENTAR SECUENCIA ASCENDENTE" + "\n" + "2. PREWENTAR SECUENCIA DESCENDENTE" + "\n" + "3.SALIR"));
        //EVALUAR LOS DOS ESCENARIOS CON SWITCH
        switch (entrada) {
            case 1:
                numeroIngresado++;
                //generamos la secuencia ascendente
                while (numeroIngresado < 9) {
                    JOptionPane.showMessageDialog(null, numeroIngresado);
                    numeroIngresado++;

                }
                break;
            case 2:
                numeroIngresado--;
                //generamos la secuencia descendente
                while (numeroIngresado > 0) {
                    JOptionPane.showMessageDialog(null, numeroIngresado);
                    numeroIngresado--;
                }
                break;
        }
    }
}
