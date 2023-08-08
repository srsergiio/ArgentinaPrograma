package GUIA4.Ejercicio2;

public class Televisor extends Electrodomestico {

    private int Resolucion;

    private boolean sintonizador_TDT;

    public Televisor(double Precio, String Color, char Consumo_Energetico, double Peso, int Resolucion, boolean sintonizador_TDT) {
        super( Precio,Color,Consumo_Energetico,Peso);
        this.Resolucion=Resolucion;
        this.sintonizador_TDT=sintonizador_TDT;
    }

    public Televisor() {
    }

    public int getResolucion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean getsintonizador_TDT() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setResolucion() {
    }

    public void setsintonizador_TDT() {
    }

    public void untitledMethod() {
    }

    public void precioFinal() {
        super.precioFinal();
        if(this.Resolucion>=40){this.Precio*=1.30;}
        if(this.sintonizador_TDT){this.Precio+=500;}
    }
    
  
}
