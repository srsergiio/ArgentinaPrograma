/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA5.Colecciones.Ejerc2;

/**
 * Basados en el ejemplo anterior, ahora nos piden que las Películas no deben
 * repetirse en el Cine,
 * para ello en lugar de utilizar un ArrayList, utilizaremos un HashSet; pero
 * ojo!!! Para que el
 * HashSet sepa cuando una Película está repetida, es decir, tienen el mismo
 * título, bastará con
 * sobreescribir los métodos equals y hashCode en la clase Película.
 * CONTROL SHIFT F
 */
public class MAIN {
   public static void main(String[] main) {
      Cine cine = new Cine(); 
      cine.agregarPelicula(new Pelicula("A", "Sergio", 2));
      cine.agregarPelicula(new Pelicula("A", "Sergio", 2));
      cine.agregarPelicula(new Pelicula("B", "Sergio", 2));
      cine.getProyecciones().forEach(e -> System.out.println(e));
   }
}
w