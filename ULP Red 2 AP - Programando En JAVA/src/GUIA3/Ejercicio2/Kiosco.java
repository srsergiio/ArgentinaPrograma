package GUIA3.Ejercicio2;

public class Kiosco {

    private String Direccion;

    private String Nombre;

    private int Cuil;

    private Empleado[] ListaEmpleado = new Empleado[3];

    public Kiosco(String Direccion,String Nombre,int Cuil) {
        this.Direccion=Direccion;
        this.Nombre=Nombre;
        this.Cuil=Cuil;
        
    }

    public void incorporar(Empleado p1) {
        for (int i = 0; i < this.ListaEmpleado.length; i++) {
            if (this.ListaEmpleado[i]==null){
                this.ListaEmpleado[i]=p1; 
                break;
            } 
        } 
    }


    public void mayorAntiguedad() {
        Empleado masAntiguo=this.ListaEmpleado[0];
        for (int i = 0; i < this.ListaEmpleado.length; i++) {
             masAntiguo =  this.ListaEmpleado[i].getIngreso().compareTo(masAntiguo.getIngreso())<0?this.ListaEmpleado[i]:masAntiguo; 
        }
        System.out.println("Nombre : "+masAntiguo.getNombre()+
        "\nApellido : "+masAntiguo.getApellido()+
        "\nDni : "+masAntiguo.getDni()+
        "\nFecha de Contratacion : "+masAntiguo.getIngreso());
    }
}
