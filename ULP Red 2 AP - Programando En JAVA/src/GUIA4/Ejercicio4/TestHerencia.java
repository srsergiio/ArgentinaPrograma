package GUIA4.Ejercicio4;

public class TestHerencia {
    public static void main(String[] args) {
        // a. Crear un Guerrero de nombre "Thor" en la posición X=100, Y=200
        Position posicionThor = new Position(100, 200);
        Guerrero thor = new Guerrero(posicionThor, "Thor", true);

        // b. Hacerlo girar hasta que mire al Oeste
        while (thor.orientacion != 'O') {
            thor.girar();
        }

        // c. Hacerlo avanzar 5 pasos
        for (int i = 0; i < 5; i++) {
            thor.avanzar();
        }

        // d. Hacerlo disparar 8 veces
        for (int i = 0; i < 8; i++) {
            thor.disparar();
        }
    }
}
