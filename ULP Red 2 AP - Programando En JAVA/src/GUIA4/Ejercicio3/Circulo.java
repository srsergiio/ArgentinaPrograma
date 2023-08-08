package GUIA4.Ejercicio3;

public class Circulo implements calculosFormas {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    @Override
    public  void Area() {
         System.out.println("Area del Circulo : "+Math.pow(calculosFormas.PI*this.radio, 2));
    }

    @Override
    public   void Perimetro() {
        System.out.println("Perimetro del Circulo : "+PI * (2*this.radio));
    }

   
    
    
}
