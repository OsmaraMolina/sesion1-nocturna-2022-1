/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio14 {

    public static void main(String[] args) {
         //entrada 
        String palabra = "";
        int longitud = 0;
        int cantidadVocales = 0;
        int cantidadConsonantes = 0;
        //proceso
        palabra= JOptionPane.showInputDialog(null,"ingrese la palabra:");
        //proceso: obtenemos la longitud de la palabra
        longitud = palabra.length();
        //proceso: recorrer y contar las vocales y consonantes 
        for(int indice=0; indice<longitud; indice++){
            //validacion de vocales
            if(palabra.charAt(indice)=='a' || palabra.charAt(indice)== 'e'||
                    palabra.charAt(indice)== 'i'|| palabra.charAt(indice)=='o'||
                    palabra.charAt(indice)=='u'){
                cantidadVocales++;
            }else {
                cantidadConsonantes++;
            }
    }  
        //salida
        JOptionPane.showMessageDialog(null,"la cantidad de vocales es:"+cantidadVocales);
        JOptionPane.showMessageDialog(null,"la cantidad de vocales es:"+cantidadConsonantes);
}
    }