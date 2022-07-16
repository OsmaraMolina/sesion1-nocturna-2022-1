/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
public class ejercicio5 {
//APLICACION QUE PERMITA VALIDAR EL LISTADO DE INVITADOS DE UNA FIESTA EN EL RANGO DE EDAD 18 A 30 AÑOS
    public static void main(String[] args) {
        String nombre = "carlos";
        int edad =20;
        //proceso
        if(edad >=18&&edad<=30){
            System.out.println(nombre +  " tiene acesso al evento");
        }else{
            System.out.println(nombre + "no tiene acesso al evento");
        }
    }
    
}