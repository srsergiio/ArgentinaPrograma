package GUIA4.Ejercicio2;

public class Electrodomestico {

    protected double Precio;

    protected String Color;

    protected char Consumo_Energetico;

    protected double Peso;

    public Electrodomestico(double Precio, String Color, char Consumo_Energetico, double Peso) {
        this.Precio= Precio;
        this.Color=comprobarColor( Color);
        this.Consumo_Energetico=comprobarConsumoEnergetico(Consumo_Energetico);
        this.Peso=Peso;
    }

    public Electrodomestico() {
    }

    public double getPrecio() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return  this.Precio;
    }

    public String getColor() {
       // throw new UnsupportedOperationException("Not supported yet.");
        return this.Color;
    }

    public char getConsumo_Energetico() {
     //   throw new UnsupportedOperationException("Not supported yet.");
     return this.Consumo_Energetico;
    }

    public double getPeso() {
       // throw new UnsupportedOperationException("Not supported yet.");
       return this.Peso;
    }

    public void setPrecio(double Precio) {
        this.Precio=Precio;
    }

    public void setColor(String Color) {
        this.Color=Color;
    }

    public void setConsumo_Energetico(char Consumo_Energetico) {
        this.Consumo_Energetico=Consumo_Energetico;
    }

    public void setPeso(double Peso) {
        this.Peso=Peso;
    }

    public static char comprobarConsumoEnergetico(char letra) {
        char [] Consumos ={'A','B','C','D','E','F','a','b','c','d','e','f'};
        for(int i =0 ; i<Consumos.length;i++ ){
            if (letra==Consumos[i]){
               return letra;
            }
        }
        return 'F';
    }

    public static String comprobarColor(String color) {
        
        String [] Colores ={"blanco", "negro","rojo", "azul", "gris"};
        for(int i =0 ; i<Colores.length;i++ ){
            if(color.toLowerCase().equals(Colores[i])){
                return color;
            }
        }
        return "blanco";
    }

    public void precioFinal() {
        int [][] Consumo={{'A',1000,},{'B',800,},{'C',600,},{'D',500,},{'E',300,},{'F',100}};
        for(int i =0 ; i<Consumo.length;i++ ){
            if(this.Consumo_Energetico==Consumo[i][0] ){
                this.Precio+=Consumo[i][1];
                break;
            }
        } 
        int [][] Pesos={{1,100},{20,500},{50,800},{80,1000}};
        for(int i =Pesos.length-1 ; i>0;i-- ){

            if(this.Peso>=Pesos[i][0] ){
                
                this.Precio+=Pesos[i][1];
                break;
            }
        }
        
    }
    
  
    
}
