package GUIA3.Ejercicio4;

public class Robot {
     Bateria Bateria;
     boolean Estado;
     
    public Robot() {
      this.Bateria = new Bateria();
      this.Estado= true;
    }
     
     
    public void Avanzar(int Pasos) {
        
        if((this.Bateria.getcarga()-(Pasos*0.1))>=0){
            if ( this.Estado){ 
                this.Bateria.setcarga((int) (this.Bateria.getcarga()-(Pasos*0.1)));
            }
            if ( !this.Estado){
                System.out.println("Robot esta dormido");
            }
        }else{
            System.out.println("No hay bateria suficiente recarga el robot");
        }
       
    }

    public void Retroceder(int Pasos) {
         if((this.Bateria.getcarga()-(Pasos*0.1))>=0){
            if ( this.Estado){ 
                this.Bateria.setcarga((int) (this.Bateria.getcarga()-(Pasos*0.1)));
            }
            if ( !this.Estado){
                System.out.println("Robot esta dormido");
            }
        }else{
            System.out.println("No hay bateria suficiente recarga el robot");
        }
    }

    public void Dormir() {
        this.Estado=false;
    }

    public void Despertar() {
        this.Estado=true;
    }

    public void Recargar() {
        this.Bateria.setcarga(1000);
    }

    public boolean bateriaLLena() {
        return this.Bateria.getcarga()==1000;
    }

    public boolean bateriaVacia() {
        return this.Bateria.getcarga()==0;
    }

    public void energiaActual() {
        System.out.println("Energia actual : "+this.Bateria.getcarga());
    }
}
