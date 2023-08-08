/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA4.Ejercicio1;

/**
 *
 * @author Administrador
 */
public class Animal {
   protected String nombre, alimento, raza;
   protected int edad;
   
   public Animal (String nombre,String alimento,int edad, String raza){
       this.nombre=nombre;
       this.alimento=alimento;
       this.edad=edad;
       this.raza=raza;
   }
   
   public void alimentarse(){
       System.out.println("Clase Animal");
   }
}
