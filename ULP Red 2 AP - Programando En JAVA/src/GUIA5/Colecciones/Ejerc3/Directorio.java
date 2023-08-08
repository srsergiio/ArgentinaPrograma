package GUIA5.Colecciones.Ejerc3;

import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Directorio {
    
    HashMap<Integer,Cliente> Directorio = new HashMap();

    public Directorio() {
    }
    
    public void agregarCliente(int nroTel,Cliente Cliente){
        this.Directorio.put(nroTel, Cliente);
    }
    
    public Cliente buscarCliente(Integer nroTel){
        return this.Directorio.get(nroTel);
    }

    public Collection<Integer> buscarTeléfono(String apellido){
        ArrayList <Integer> listaTelefono = new ArrayList();
        for (Map.Entry<Integer,Cliente> elemento : Directorio.entrySet()) {
           // System.out.println(elemento.getValue().getApellido());
            if(elemento.getValue().getApellido().equals(apellido)){
                listaTelefono.add(elemento.getKey());
            }
        }
        return listaTelefono;
    }
    
   public Collection<Cliente> buscarClientes(String ciudad){
        ArrayList <Cliente> listCliente = new ArrayList();
        for (Map.Entry<Integer,Cliente> elemento :Directorio.entrySet()){
            if(elemento.getValue().getCiudad().equals(ciudad)){
               //System.ouelemento.getValue().getApellido();
                listCliente.add(elemento.getValue());
            }
        }
        return listCliente;
   }
   
   public void borrarCliente(Integer telefono){
       this.Directorio.remove(telefono);
   }
   
   public void listarDirectorio(){
       for(Map.Entry<Integer, Cliente> elemento:Directorio.entrySet()){
           System.out.println(elemento.getValue().getNombre()+" : "+elemento.getKey());
       }
   }
    
    public static void main (String [] main){
        Directorio d = new Directorio();
        d.agregarCliente(1234, new Cliente( 764337, "gonzalo", "callejos", "buenosAires", 4321));
        d.agregarCliente(12345, new Cliente( 3214345, "pablo", "schabero", "chaco", 4321));
        d.agregarCliente(666, new Cliente( 3214345, "elias", "Steinkamper", "corriente", 4321));
        d.agregarCliente(111, new Cliente( 3214345, "lucas", "pres", "tierra del fuego", 4321));
        d.agregarCliente(13134, new Cliente( 3214345, "lilian", " Ayalaga", "tucuman", 4321));
        
        
        System.out.println(d.buscarCliente(1234));
        //System.out.println(d.buscarClientes("buenosAires"));
        //d.borrarCliente(666);
       // d.listarDirectorio();
        
    }
}
