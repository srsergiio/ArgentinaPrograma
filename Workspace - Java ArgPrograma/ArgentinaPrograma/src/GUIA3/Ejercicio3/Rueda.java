/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA3.Ejercicio3;

/**
 *
 * @author Administrador
 */
public class Rueda {
    private String Marca;

    public double getPresion() {
        return presion;
    }
    private double presion;
    
    public Rueda(String Marca,double presion){
        this.Marca=Marca;
        this.presion=presion;
    }
   public void Inflar(){
   this.presion=28;
  } 
   public void Pinchar(){
   this.presion=0;
   } 
   public void Desinflar(){
       this.presion-=0.5;
   } 
}
