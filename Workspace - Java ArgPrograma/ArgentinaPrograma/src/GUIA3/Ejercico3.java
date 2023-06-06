/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA3;
import GUIA3.Ejercicio3.*;
/**
Nos piden modelar un Auto con las siguientes características y comportamiento para poder ser
anexado al proyecto.
A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo
tendrá como comportamiento:
• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener
en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible
suficiente.
• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos
tener en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay
combustible suficiente.
• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.
B- Hacer la clase Rueda, con atributos: marca y presión, Luego el auto debe tener 4 ruedas, además
Rueda tendrá los siguientes comportamientos:
• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI
C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas,
avanzar/retroceder, y llenarTanque.
Nota: La medida en PSI (libra por pulgada cuadrada). Generalmente los turismos ligeros suelen
llevar una presión recomendada comprendida entre los 28 a 30 PSI.
 */
public class Ejercico3 {
    public static void main(String[] main){
        Rueda[] r4 = new Rueda[4];
        r4[0]=new Rueda("china",28);
        r4[1]=new Rueda("china",28);
        r4[2]=new Rueda("china",28);
        r4[3]=new Rueda("china",28);
        Auto a1 = new Auto("Rojo", "ATE - 714",r4);
        int metros = 0;
        int MRecorridos=0;
        while(a1.getCombustible()>0){
             metros = (int) (Math.random() * 500) + 1;
             if(a1.getCombustible()>(0.1*metros)){
                 a1.getRueda()[(int) (Math.random() * 4)].Desinflar();
                 MRecorridos+=metros;
                a1.Avanzar(metros);
            }else{
                 if(a1.getCombustible()<1){ break;}
                 a1.LlenarTanque();
                 metros = (int) (Math.random() * 500) + 1;
             } 
        }
        a1.LlenarTanque();
        a1.Retroceder(metros); 
         MRecorridos+=metros;
          a1.getRueda()[(int) (Math.random() * 4)].Pinchar();
        System.out.println("Metros Recorridos : "+MRecorridos);
        System.out.println("Rueda 1 : "+a1.getRueda()[0].getPresion()+"\nRueda 2 : "+a1.getRueda()[1].getPresion()+   "\nRueda 3 : "+a1.getRueda()[2].getPresion()+
                            "\nRueda 4 : "+a1.getRueda()[3].getPresion());
    }
    
}
