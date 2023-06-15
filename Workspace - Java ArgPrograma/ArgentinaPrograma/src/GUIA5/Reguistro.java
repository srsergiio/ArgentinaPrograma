package GUIA5;

public class Reguistro {

    private Persona[][] listPersonas;

    public Reguistro() {  
        this.listPersonas = new Persona[12][3];
    }

    public void agregarRegistro(Persona p, int mesY, int localX) {
        this.listPersonas[mesY][localX] = p;
    }
    
    public void promedioMasAlto() {
        double contMilimetros=0;
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 3; i++) {
               contMilimetros+= this.listPersonas[j][i].getMilimetros();
            }
        }
        System.out.println("promedio Global de milimetros registrado : "+contMilimetros/36);
    }
    
    public void promedioPorReguion() {
        
        double sanLuis=0;
        double merlo=0;
        double villaMercedes=0;
        
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 3; i++) {
               switch(i){
                   case 0->sanLuis+=this.listPersonas[j][i].getMilimetros();
                   case 1->merlo+=this.listPersonas[j][i].getMilimetros();
                   case 2->villaMercedes+=this.listPersonas[j][i].getMilimetros();
               }
            }
        }
        System.out.println("promedio lluvia san Luis : "+sanLuis/12+"\npromedio lluvia merlo : "+merlo/12+"\npromedio lluvia villa Mercedes : "+villaMercedes/12);
    }
    
    public void imprimirPersonas() {
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    String[] localidades = {"San Luis", "Merlo", "Villa Mercedes"};
    for (int j = 0; j < 12; j++) {
        for (int i = 0; i < 3; i++) {
            Persona persona = this.listPersonas[j][i];
            if (persona != null) {
                System.out.println("Persona registrada en  [" + meses[j] + "][" + localidades[i] + "]:");
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Apellido: " + persona.getApellido());
                System.out.println("Milímetros promedio: " + persona.getMilimetros());
                System.out.println("------------------------");
            }
        }
    }
}

    public static void main(String[] args) {

        String[] nombres = {"Juan","María","Pedro","Ana","Luis","Sofía","Carlos","Laura","José","Isabel","Miguel","Carmen"};
        String[] apellidos = {"Gómez","Rodríguez","López","Fernández","Pérez","González","Martínez","Sánchez","Romero","Torres","Vargas","Ramírez"};

        Reguistro registro = new Reguistro();
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 3; i++) {
                double milimetro=( 0+  (Math.random() * ((1147- 0) + 1)));
                registro.agregarRegistro(new Persona(nombres[(int) (Math.random() * 12)], apellidos[(int) (Math.random() * 12)], milimetro), j, i);
            }
        }
        registro.imprimirPersonas();
        registro.promedioMasAlto();
        registro.promedioPorReguion();
        
        
    }
}
