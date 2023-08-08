package GUIA5.Arreglos;

public class Pila {

    private int tope=-1;

    private String[] elementos;

    public Pila(int tamano) {
        this.elementos= new String[tamano];
    }

    public void agregar(String elemento) {
        if(!pilaLlena()){
            this.tope++;
            this.elementos[this.tope]=elemento; 
        }   
    }

    public String verTope() {
        return this.elementos[this.tope];
    }

    public String quitar() {
        if(!pilaVacia()){  
           this.tope--;
           return this.elementos[this.tope+1];
        }return null;
    }

    public boolean pilaVacia() {
         return this.tope==-1;
    }

    public boolean pilaLlena() {
        return (this.elementos.length-1)==this.tope;
    }
    
    
    public static void main(String [] main){
        Pila p = new Pila(10);
        for(int i = 1; i<5+1;i++){ p.agregar("elemento"+i);}
       
        Pila p2 = new Pila(10);
        for(int i = 1; i<5+1;i++){ System.out.println(p.verTope());
           p2.agregar(p.quitar());
        }
           System.out.println(p2.verTope());
       
    }
}
