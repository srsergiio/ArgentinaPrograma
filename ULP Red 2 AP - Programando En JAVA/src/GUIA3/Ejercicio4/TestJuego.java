package GUIA3.Ejercicio4;

public class TestJuego {

    public static void main(String[] main) {
        Robot robocop = new Robot();
        
        Hombre hombre = new Hombre();
        hombre.JugarConRobot(robocop);
        
        Hombre hombre2 = new Hombre();
        hombre2.JugarConRobot(robocop);
        robocop.Despertar();
        hombre2.JugarConRobot(robocop);
    }
}
