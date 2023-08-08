package GUIA5.Colecciones.Ejerc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cine {

    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> proyecciones = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Pelicula> getProyecciones() {
        return proyecciones;
    }

    public Comparator<Pelicula> getOrdenMenorD() {
        return OrdenMenorD;
    }

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarPelicula(Pelicula p) {
        this.proyecciones.add(p);
    }

    public void listarTodo() {
        for (Pelicula elemento : this.proyecciones) {
            System.out.print(elemento.toString());
        }
    }

    public void intlistarDuranMas(int hora) {
        for (Pelicula elemento : this.proyecciones) {
            if (elemento.getDuracion() >= hora) {
                System.out.println(elemento.toString());
            }
        }
    }

    public void listarMenorDuracionAMayorDuracion() {
        Collections.sort(proyecciones, OrdenMenorD);
    }


    public void listaOrdenarPorTitulo() {
        Collections.sort(proyecciones,Oalfavetico);
    }

    public void listaOrdenarPorDirector() {
        Collections.sort(proyecciones,OalfDirect);
    }

    public static void main(String[] main) {
        
    }

    Comparator<Pelicula> OrdenMenorD = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion() < o2.getDuracion() ? -1 : o1.getDuracion() == o2.getDuracion() ? 0 : 1;
        }
    };
   
    Comparator<Pelicula> Oalfavetico = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            int LetraMenor = (int) Double.NEGATIVE_INFINITY;
            switch(o1.getTitulo().length() <o2.getTitulo().length()?-1:o1.getTitulo().length() >o2.getTitulo().length()? 1:0 ){
                case -1:
                   LetraMenor= OrdenAlfavetico(o1.getTitulo(),o2.getTitulo() ,o1.getTitulo().length());
                case 0:
                     LetraMenor= OrdenAlfavetico(o1.getTitulo(),o2.getTitulo() ,o1.getTitulo().length());
                case 1:   
                     LetraMenor= OrdenAlfavetico(o1.getTitulo(),o2.getTitulo() ,o2.getTitulo().length());
            }
            
            return LetraMenor;
        }
    };
       
    Comparator<Pelicula> OalfDirect = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            int LetraMenor = (int) Double.NEGATIVE_INFINITY;
            switch(o1.getDirector().length() <o2.getDirector().length()?-1:o1.getDirector().length() >o2.getDirector().length()? 1:0 ){
                case -1:
                   LetraMenor= OrdenAlfavetico(o1.getDirector(),o2.getDirector() ,o1.getDirector().length());
                case 0:
                     LetraMenor= OrdenAlfavetico(o1.getDirector(),o2.getDirector() ,o1.getDirector().length());
                case 1:   
                     LetraMenor= OrdenAlfavetico(o1.getDirector(),o2.getDirector() ,o2.getDirector().length());
            }
            
            return LetraMenor;
        }
    };
    public int  OrdenAlfavetico(String s1,String s2,int l){
          int Orden=(int) Double.NEGATIVE_INFINITY;
          for (int i = 0 ;i<s1.length();i++){
              Orden = s1.charAt(i)<s2.charAt(i)?-1:s1.charAt(i)>s2.charAt(i)?1:0;
              if(Orden!=0){
                  break;
              }
          }
          return Orden;
       }
                    
}
