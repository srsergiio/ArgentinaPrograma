/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA5.Colecciones.Ejerc1;

/**
 *
 * @author Administrador
 */
public class test {
    public static void main(String [] main ){
    Cine cine1 =new Cine("CINEMARK", "MALVINAS ARGENTINA, BUENOS AIRES, ARGENTINA") ;
        
    cine1.agregarPelicula(new Pelicula("z", "director", 1));
    cine1.agregarPelicula(new Pelicula("a", "director", 3));
    cine1.agregarPelicula(new Pelicula("b", "director", 14));
    cine1.agregarPelicula(new Pelicula("c", "director", 0));
    cine1.agregarPelicula(new Pelicula("d", "director", 1));
    System.out.println("\nORDEN POR Duracion ->\n");
    cine1.listarMenorDuracionAMayorDuracion();
    cine1.getProyecciones().forEach((i)->System.out.println(i));
    
    System.out.println("\nORDEN POR TITULO ->\n");
    cine1.listaOrdenarPorTitulo();
    cine1.getProyecciones().forEach(e->System.out.println(e));
    
    }
}
