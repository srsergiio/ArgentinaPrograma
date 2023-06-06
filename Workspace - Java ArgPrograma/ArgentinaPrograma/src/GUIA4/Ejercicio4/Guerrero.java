package GUIA4.Ejercicio4;

public class Guerrero extends Personaje {
    private boolean caballo;

    public Guerrero(Position ubicacion, String nick, boolean caballo) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }

    @Override
    public void avanzar() {
        if (caballo) {
            if (orientacion == 'N')
                ubicacion.setY(ubicacion.getY() + 10);
            else if (orientacion == 'S')
                ubicacion.setY(ubicacion.getY() - 10);
            else if (orientacion == 'E')
                ubicacion.setX(ubicacion.getX() + 10);
            else if (orientacion == 'O')
                ubicacion.setX(ubicacion.getX() - 10);
        } else {
            super.avanzar();
        }
    }

    @Override
    public void disparar() {
        if (energia < 30) {
            caballo = false;
        }
        // Implementación del disparo
    }
}
