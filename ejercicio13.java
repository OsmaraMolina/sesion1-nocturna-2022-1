/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import javax.swing.JOptionPane;

public class ejercicio13 {

    public static void main(String[] args) {
//ENTRADA 
        String numeroenterostring ="5";
        String numerodecimalstring ="2.50";
        int numeroenteroconvertido=0;
        double numerodecimalconvertido=0.0;
        //PROCESO
        numeroenteroconvertido=Integer.parseInt(numeroenterostring);
        numerodecimalconvertido=Double.parseDouble(numerodecimalstring);
        //SALIDA
        JOptionPane.showMessageDialog(null, "El numero entero convertido es: "+numeroenterostring);
        JOptionPane.showMessageDialog(null, "El numero decimal convertido es: "+numerodecimalconvertido);

    }

    
}
