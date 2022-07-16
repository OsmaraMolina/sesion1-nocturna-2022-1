/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
// verificacion de 2 numeros pares a partir de operadores LOGICOS

public class ejercicio4 {

    public static void main(String[] args) {
        int numero1 = 9;
        int numero2 = 7;
        int residuo1 = 0;
        int residuo2 = 0;
        //proceso
        residuo1 = numero1 % 2;
        residuo2 = numero2 % 2;
        if (residuo1 == 0 && residuo2 == 0) {
            //salida
            System.out.println("LOS DOS NUMEROS SON PARES");
        } else {
            System.out.println("LOS DOS NUMEROS NO SON PARES");
        }

    }
}
