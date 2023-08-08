package GUIA3.Ejercicio1;


public class Persona {
	String Nombre, Apellido; 
	int Edad, Documento ;
	Perro [] mascotas= new Perro [3];
	

	public Persona(String nombre, String apellido, int edad, int documento ) {
		this.Nombre=nombre;
		this.Apellido=apellido;
		this.Edad=edad;
		this.Documento=documento;	
	}
	
	public void adoptarPerro(Perro Mascota){
             if(this.mascotas[2]!=null){
                    System.out.println("No pudiste Adoctar una Mascota ");
                }else{
                    for(int i =0;i<this.mascotas.length;i++){
                        if(this.mascotas[i]==null){
                            this.mascotas[i]=Mascota;
                            System.out.println("Adotaste una Mascota ");
                            break;
                        }
                    }
             }
	}
	
    public void  perroMasGrande(){
       int perroMasGrande=0;
       for(int i =1;i<this.mascotas.length;i++){
           if(this.mascotas[perroMasGrande].getEdad()<this.mascotas[i].getEdad()){
                perroMasGrande=i;
           }
       }
       System.out.println("tu perro mas grande es : "+this.mascotas[perroMasGrande].getNombre()+" con una edad de :"+this.mascotas[perroMasGrande].getEdad()+" anios");
    }

}
