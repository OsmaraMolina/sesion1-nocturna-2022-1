/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

public class ejercicio10 {
//APLICACION QUE SIMULE EL CACLCULO DE ROL DE PAGO DE UN EMPLEADO

    public static void main(String[] args) {
        String empleado = "osmara molina";
        String cargo = "Gerente de compras";
        double pagoHora = 20.0;
        int numeroHora = 160;
        double sueldo = 0.0;
        double iess = 0.0;
        double netoRecibir = 0.0;
        //proceso
        sueldo = pagoHora * numeroHora;
        iess = sueldo * 0.09;
        netoRecibir = sueldo - iess;
        // salida 
        System.out.println("---------rol del mes de mayo 2022-------" );
        System.out.println("Empleado:" + empleado);
        System.out.println("Cargo:" + cargo);
        System.out.println("Sueldo:" + sueldo);
        System.out.println("Descuento del iess:" + iess);
        System.out.println("ValornetoRecibir:" + netoRecibir);
    }

}
