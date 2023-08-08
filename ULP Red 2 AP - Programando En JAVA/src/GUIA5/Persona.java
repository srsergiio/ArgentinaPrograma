    package GUIA5;

public class Persona {

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private String nombre;

    private String apellido;

    private double milimetros;

    public double getMilimetros() {
        return milimetros;
    }

    public Persona(String nombre, String apellido, double milimetros) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.milimetros=milimetros;
    }

    public Persona() {
    }
}
