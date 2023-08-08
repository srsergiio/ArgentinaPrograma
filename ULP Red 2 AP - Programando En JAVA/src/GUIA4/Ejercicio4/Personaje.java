package GUIA4.Ejercicio4;

public abstract class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas = 3;
    protected int energia = 100;
    protected char orientacion = 'N';

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }

    public abstract void disparar();

    public void girar() {
        switch (orientacion) {
            case 'N':
                orientacion = 'E';
                break;
            case 'E':
                orientacion = 'S';
                break;
            case 'S':
                orientacion = 'O';
                break;
            case 'O':
                orientacion = 'N';
                break;
        }
    }

    public void avanzar() {
        switch (this.orientacion) {
            case 'N' -> ubicacion.setY(ubicacion.getY() + 1);
            case 'S' -> ubicacion.setY(ubicacion.getY() - 1);
            case 'E' -> ubicacion.setX(ubicacion.getX() + 1);
            case 'O' -> ubicacion.setX(ubicacion.getX() - 1);
        }
    }
}

