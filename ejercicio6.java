/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

public class ejercicio6 {
//APLICACION QUE VALIDE EL PARQUIMETRO DE VEHICULOS
    public static void main(String[] args) {
        // ENTRADA  
        String vehiculo = "AUTOS";
        //PROCEDIMIENTO
        if(vehiculo.equals ("AUTOS")||vehiculo.equals("suv")||vehiculo.equals("camion")){ 
            System.out.println("tiene acceso al parquimetro.");
        }else{
            System.out.println("no tiene acceso al parquimetro.");
        }
    }
    
}
