/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA5.Colecciones.Ejerc2;
import java.util.HashSet;
import java.util.Objects;
/**
 *
 * @author Administrador
 */
public class Cine {
      private String nombre;
      private String direccion;
      private HashSet<Pelicula> proyecciones = new HashSet<>();
      
    @Override
    public String toString() {
        return "Cine{" + "nombre=" + nombre + ", direccion=" + direccion + ", proyecciones=" + proyecciones + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cine other = (Cine) obj;
        return Objects.equals(this.nombre, other.nombre);
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Pelicula> getProyecciones() {
        return proyecciones;
    }

    public void setProyecciones(HashSet<Pelicula> proyecciones) {
        this.proyecciones = proyecciones;
    }

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Cine(){
        
    }
    
    public void agregarPelicula(Pelicula p){
        proyecciones.add(p);
    }
}
