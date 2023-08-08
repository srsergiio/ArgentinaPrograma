package GUIA3.Ejercicio2;


import java.time.LocalDate;

public class Empleado {

    private String Nombre;

    private String Apellido;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDni() {
        return Dni;
    }

    private LocalDate Ingreso;

    private int Dni;

    public Empleado(String Nombre,String Apellido,LocalDate Ingreso,int Dni) {
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Ingreso=Ingreso;
        this.Dni=Dni;
    }

    public LocalDate getIngreso() {
        return Ingreso;
    }
    
}
