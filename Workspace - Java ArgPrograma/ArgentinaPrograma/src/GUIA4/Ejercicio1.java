/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA4;

import GUIA4.ejercicio1.*;


/**
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
lo siguiente:
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Perro p1 = new Perro("perro", "Croquetas", 11, "chiwuwua");
        p1.alimentarse();
        Animal g1 = new Gato("rodolfo", "higado", 3, "naranja");
        g1.alimentarse();
        Caballo c= new Caballo("tiraalblanco", "pasto", 3, "mula");
        c.alimentarse();
    }
}

