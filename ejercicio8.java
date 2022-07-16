/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

public class ejercicio8 {
//APLICACION QUE VALIDE EL MEDIO DE PAGO EN EFECTIVOS Y DOCUMENTOS DE LA VENTA // DE UN VEHICULO A CLIENTE

    public static void main(String[] args) {
        // entrada
        String vehiculo = "ford-f150";
        boolean licencia = true;
        boolean efectivo = false;
        // proceso
        if (licencia == true) {
            if (efectivo == true) {
                System.out.println(vehiculo + "se ejecuta la venta del vehiculo");
            } else {
                System.out.println(vehiculo + " no se ejecuta la venta del vehiculo");
            }
        } else {
            System.out.println(vehiculo + " no se ejecuta la venta del vehiculo");

        }

    }

}
