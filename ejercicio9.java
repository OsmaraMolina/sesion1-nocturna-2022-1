/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
//aplicacion que permita validar el lugar de votacion , la edad la mesa de un proceso de elecciones
//presidenciales

public class ejercicio9 {

    public static void main(String[] args) {
        // entrada
        String nombre = "osmara";
        boolean lugar = true;
        boolean edad = true;
        boolean mesa = true;
        if (lugar == true) {
            if (edad == true) {
                if (mesa == true) {
                    System.out.println(nombre  + "esta acto para realizar el proceso de votacion ");
                } else {
                    System.out.println(nombre + "no se encuentra en la mesa correcta ,pero si se encuentra el lugar correcto ");
                }
            } else {
                System.out.println(nombre + "no la edad para poder sufragar");
                System.out.println("la edad minima para realizar este proceso");
            }
        } else {
            System.out.println("no se esncuentra en el lugar establecido ");
        }
    }
}


