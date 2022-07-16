/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

public class ejercicio2 {

    public static void main(String[] args) {
        // validacion de numero par o impar 
        /// entrada 
        int numero1 = 2;
        int residuo = 0;
        //proceso
        residuo = numero1 % 2;
        //salida
        if (residuo == 0) {
            System.out.println("EL NUMERO ES PAR");
        } else {
            System.out.println("EL NUMERO ES IMPAR");
        }
    }

}
