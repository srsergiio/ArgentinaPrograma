/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA5.Colecciones.Ejerc2;

import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Pelicula {
      private String titulo;

    private String director;

    private int duracion;
    
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.titulo);
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
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
     public String getPelicula() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }
     public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPelicula(String titulo, String director, int duracion) {
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
    }
    public int compareTo(Pelicula Pelicula){
       return this.duracion>Pelicula.duracion?-1:this.duracion==Pelicula.duracion?0:1;
        
    }
}
