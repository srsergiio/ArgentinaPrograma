/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA3.Ejercicio3;

/**
 *
 * @author Administrador
 */
public class Auto {

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public Rueda[] getRueda() {
        return rueda;
    }

    public void setRueda(Rueda[] rueda) {
        this.rueda = rueda;
    }
    private String Color , Patente;
    private double combustible  =  50;
    private Rueda[] rueda ;
    
    
    public Auto(String Color, String Patente,Rueda [] CuatroRuedas){       
        this.Color=Color;
        this.Patente=Patente;
        this.rueda=CuatroRuedas;
    }
    public void Avanzar(double Metros){
        if( this.combustible - 0.1*Metros >=0){
            this.combustible -= 0.1*Metros;
            System.out.println( "Combustible : "+ this.combustible);
        }else{
        System.out.println( "No tiene combustible suficiente : "+ this.combustible);
        }
    }
    public void Retroceder(double Metros){
        if( this.combustible - 0.1*Metros >=0){
            this.combustible -= 0.1*Metros;
            System.out.println( "Combustible : "+ this.combustible);
        }else{
        System.out.println( "No tiene combustible suficiente : "+ this.combustible);
        }
    }
    public void LlenarTanque(){
        this.combustible = 50;
         System.out.println( "Se lleno el tanque : "+ this.combustible);
    }
}
