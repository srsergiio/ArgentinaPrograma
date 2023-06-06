/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA4;

import GUIA4.Ejercicio1.*;
import GUIA4.Ejercicio2.Lavadora;
import GUIA4.Ejercicio2.Televisor;



/**
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
lo siguiente:
 */

public class Main_Guia4 {
    public static void main(String[] args) {
//        Perro p1 = new Perro("perro", "Croquetas", 11, "chiwuwua");
//        p1.alimentarse();
//        Gato g1 = new Gato("rodolfo", "higado", 3, "naranja");
//        g1.alimentarse();
//        Caballo c= new Caballo("tiraalblanco", "pasto", 3, "mula");
//        c.alimentarse();
        
        
        
        /*
        Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
        consumo energético (letras entre A y F) y peso.
        Los constructores que se deben implementar son los siguientes:
        • Un constructor vacío.
        • Un constructor con todos los atributos pasados por parámetro.
        Los métodos a implementar son:
        • Métodos getters y setters de todos los atributos.
        • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es
        correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
        9
        • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el
        color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro,
        rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se
        invocará al crear el objeto y no será visible.
        • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio.
        Esta es la lista de precios:
        A continuación se debe crear una subclase llamada Lavadora, con el atributo carga, además de los
        atributos heredados.
        Los constructores que se implementarán serán:
        • Un constructor vacío.
        • Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al
        constructor de la clase padre.
        Los métodos que se implementara serán:
        • Método get y set del atributo carga.
        • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si
        tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se
        incrementará el precio. Este método debe llamar al método padre y añadir el código necesario.
        Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar
        al precio.
        10
        Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en
        pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
        Los constructores que se implementarán serán:
        • Un constructor vacío.
        • Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda
        que debes llamar al constructor de la clase padre.
        Los métodos que se implementara serán:
        • Método get y set de los atributos resolución y sintonizador TDT.
        • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el
        televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un
        sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en
        la clase Electrodomestico también deben afectar al precio.
        Finalmente, en el Main_Guia4 debemos realizar lo siguiente:
        Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio
        final de los dos electrodomésticos
        */
        Lavadora Lavadora= new Lavadora (255, "gris", 'A', 80,  31);
        Lavadora.precioFinal();
        System.out.println("Lavadora : "+Lavadora.getPrecio());
        Televisor Televisor= new Televisor (255, "gris", 'A', 80,  40,true);
        Televisor.precioFinal();
        System.out.println("Televisor : "+Televisor.getPrecio());
        
    }
}

