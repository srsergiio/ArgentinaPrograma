package GUIA5.Colecciones.Ejerc1;

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
