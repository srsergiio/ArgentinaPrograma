/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA4;

/**
4. En un nuevo proyecto Java se pide:
a) Crear una clase de nombre Position con los siguientes atributos:

x de tipo entero.
y de tipo entero.
Sus métodos getter and setters
Constructor con todos los atributos.

b) Crear una clase abstracta de nombre Personaje con los siguientes atributos:

-ubicación de tipo Position
-nick de tipo String
-vidas de tipo int inicializado en 3.
-energia de tipo int inicializado en 100.
-orientación de tipo char(‘N’ norte, ‘S’ sur, ‘E’ este, ‘O’ oeste). Inicializado en ‘N’
-un constructor que permita inicializar su ubicación y Nick.

Con los métodos:
Disparar que consume 10 unidades de energía y podrá disparar hasta que consuma toda su energía.
Girar que cambia secuencialmente de orientación N, E, S, O y vuelve nuevamente N,E,S,O.....

Avanzar que si el personaje está mirando hacia el norte: crece en 1 el valor Y de su posición; si
está mirando al Sur: decrece en 1 el valor de Y, si mira al Este: crece en 1 el valor de X, y si mira
al Oeste: decrece en 1 el valor de X.

c) Crear una clase de nombre Guerrero que es un Personaje con los siguientes atributos
adicionales:
-caballo de tipo bool.
Con los métodos:
Sobreescribir el comportamiento de Avanzar para que si tiene un caballo avanzará de a 10 pasos
caso contrario se comportará como el método de la clase padre.
Sobreescribir el comportamiento de Disparar para que si tiene menos de 30 unidades de energía
pierda el caballo.
d) Luego en una clase TestHerencia, desde su método main se pide:
a. Crear un Guerrero de nombre “Thor” en la posición X=100, Y=200
b. Hacerlo girar hasta que mire al Oeste
c. Hacerlo Avanzar 5 pasos.
d. Hacerlo disparar 8 veces.
 */
public class Ejercicio4 {
    
}
