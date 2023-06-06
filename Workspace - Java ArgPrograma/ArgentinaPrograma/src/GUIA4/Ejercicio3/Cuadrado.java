package GUIA4.Ejercicio3;

public class Cuadrado implements calculosFormas {
    
    int base;
    int altura;

    
    public Cuadrado(int base ,int altura){
        this.altura=altura;
        this.base=base;
    }
    @Override
    public void Area() {
        System.out.println("Area del Cuadrado : "+this.base*this.altura);
    }

    @Override
    public void Perimetro() {
        System.out.println("Perimetro del Cuadrado : "+(this.base + this.altura) * 2);
    }
}
