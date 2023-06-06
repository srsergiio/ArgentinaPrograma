package GUIA4.Ejercicio2;

public class Lavadora extends Electrodomestico {

    private double Carga;

    public Lavadora(double Precio, String Color, char Consumo_Energetico, double Peso, double Carga) {
        super( Precio,Color,Consumo_Energetico,Peso);
        this.Carga=Carga;
    }

    public Lavadora() {
    }

    public void precioFinal() {
        super.precioFinal();
        if(this.Carga>30) this.Precio+=500;
    }

    public double getCarga() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCarga() {
    }
     
}
