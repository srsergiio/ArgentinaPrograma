/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA4.Ejercicio1;

/**
 *
 * @author Administrador
 */
public class Gato extends Animal {
    
    public Gato (String nombre, String alimento, int edad, String raza){ 
        super(nombre, alimento,edad,raza);
    }
    public void alimentarse() {
        super.alimentarse(); // Llamada al método de la clase base
        System.out.println("El Gato "+nombre+" esta comiendo su "+alimento);
    }    
}
