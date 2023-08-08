package GUIA3.Ejercicio4;
public class Hombre {
    public Hombre(){}
    public  void JugarConRobot(Robot r) {
       if(r.Estado){
        r.Avanzar(500);
        r.energiaActual();
        r.Retroceder(20);
        r.energiaActual();
        r.Dormir();
       }else{
           System.out.println("Robot esta dormido");
       }
        
       
    }
}
