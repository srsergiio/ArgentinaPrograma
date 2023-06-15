/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA5;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Arreglos {

    public static void sumarLista(int[] arreglo) {
        double promedio = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
        }
        
        System.out.println("Promedio :"+(promedio/arreglo.length)+"\nSUMA : "+promedio);
    }
    //0           ,1

    // {{1,2,3,545},{5,1,54,2,2,2,4,4,56,6,2,2,2}}
    public static int buscarMayor(int[][] bidimensional) {
        int mayor = bidimensional[0][0];
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                if (mayor <bidimensional[i][j]) {
                    mayor = bidimensional[i][j];
                }

            }
        }
        return mayor;
    }

    public static int cuentaVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.toUpperCase().charAt(i)) {
                case 'A' ->contador++;
                case 'E' ->contador++;
                case 'I' ->contador++;
                case 'O' ->contador++;
                case 'U' ->contador++;
            }
        }
        return contador;
    }
    
    public static int cuentaCaracter(String palabra ,char caracter) {
        int contador =0;
        for (int i = 0; i < palabra.length(); i++) {
          if(palabra.charAt(i)==caracter){
              contador++;
          }
        }
        return contador;
    }
    
    
    public static int [] relleneVector(int [] Vector100){
        
        for (int i=0;i<Vector100.length;i++){
            Vector100[i]=i ;
        }
        
        return Vector100;
    }
    
    public static void imprimirDecendente(int [] Vector100){
        for (int i=Vector100.length-1;     i>0           ;i--){
            System.out.print (Vector100[i]+ " , ");
        }
    }
    
    public static void  relleneVectorN(int [] VectorN){
         for (int i=0;i<VectorN.length;i++){
            VectorN[i]=(int)(Math.random()*100+1 );
        }
         Scanner teclado = new Scanner(System.in);
         System.out.println("Escribe un numero : ");
         int numeroSearch= teclado.nextInt();
         teclado.close();
         for (int i=0;i<VectorN.length;i++){
             System.out.print(", "+VectorN[i]);
         }
         System.out.println("");
         int contRepetido=0;
         for (int i=0;i<VectorN.length;i++){
             if (VectorN[i]==numeroSearch){
                 contRepetido++;
                 System.out.println("SE ENCONTRO NUMERO : "+numeroSearch+ " en la posicion " + i +" del vetor");
             }
         }
         System.out.println("NUMERO BUSCADO : "+numeroSearch+ "\nAPARICIONES : " + contRepetido );
         
    }
    
    public static int[][] relleneVector4x4(int[][] Vector4x4) {
     
        for (int i = 0; i < Vector4x4.length; i++) {
            for (int j = 0; j < Vector4x4[i].length; j++) {
                Vector4x4[i][j] = (int) (Math.random()*10+1);
            }
        }
        return Vector4x4;
    }

    public static void transpuesta(int[][] Vector4x4) {
        for (int i = 0; i < Vector4x4.length; i++) {
            System.out.println("");
            for (int j = 0; j < Vector4x4[i].length; j++) {
                if (j == 0) {
                    System.out.print(Vector4x4[j][i]);
                } else {
                    System.out.print(", " + Vector4x4[j][i]);
                }
            }
        }
        System.out.println("");
    }
    public static int [][] vectoMismoTamano(int [][] vectorOriginal){
        int[][] vectorNuevo = new int[vectorOriginal.length][]; ///{{0},{0},{0},{0}}
        for (int i = 0; i < vectorOriginal.length; i++) {
            int[] vSimple = new int[vectorOriginal[i].length];
            vectorNuevo[i] = vSimple;
        }
        return vectorNuevo;
    }
    
    public static int [][] rellenoInvetido(int [][] vectorOriginal){
            int[][] vectorNuevo =vectoMismoTamano( vectorOriginal);
           for (int i2 = 0; i2 < vectorOriginal.length; i2++) {
                for (int j = 0; j < vectorOriginal[i2].length; j++) {
                    vectorNuevo[j][i2] = vectorOriginal[i2][j];
                }
            }
           return vectorNuevo;
    }
    public static boolean esSimetrica(int[][] vectorOriginal) {
        //Creo el  arreglo 2
        
           int[][] vectorNuevo = vectoMismoTamano(vectorOriginal);
           vectorNuevo =rellenoInvetido(vectorOriginal);
           //Imprimir Pantalla
            transpuesta(vectorOriginal);
            transpuesta(vectorNuevo);
            
            for (int a = 0; a < vectorOriginal.length; a++) {
                for (int j = 0; j < vectorOriginal[a].length; j++) {
                     if (vectorOriginal[a][j] <= 0) {
                        if (Math.abs(vectorOriginal[a][j]) != vectorNuevo[a][j]) {
                            System.out.println("Caso 1");
                            return true;
                        }
                    }
                    else if (vectorNuevo[a][j] <= 0) {
                        if (Math.abs(vectorNuevo[a][j]) != vectorOriginal[a][j]) {
                            System.out.println("Caso 2");
                            return true;
                         }
                        } else {return false;}
                }
            }
        

        return false;
    }
    public static boolean cuadradoMagico(int[][] Vector3x3) {
        //recorrido Orizontal 
        int numeroMagico=0;
        for (int y = 0; y < Vector3x3[0].length; y++) {
            numeroMagico+=Vector3x3[0][y];
        }
        
        for (int y = 0; y < Vector3x3.length; y++) {
            int sOrizontal = 0, sVertical = 0;int cruzado1 = 0;
            int cruzado2 = 0;
            for (int x = 0; x < Vector3x3[y].length; x++) {
                sOrizontal += Vector3x3[y][x];
                sVertical += Vector3x3[x][y];
                cruzado1 += Vector3x3[x][x];
                
                cruzado2 += Vector3x3[x][(Vector3x3.length-1) - x];//0,(3-1)-0,        1,(3-1)-1 

            }
            if (sOrizontal != numeroMagico ||sVertical != numeroMagico ||cruzado1 != numeroMagico ||cruzado2 != numeroMagico ) {
                System.out.println("sOrizontal : "+sOrizontal +
                                   "\nsVertical : "+sVertical +
                                   "\ncruzado1 : "+cruzado1 +
                                   "\ncruzado2 : "+cruzado2 );
                return false;
            }
        }
        return true;

    }
    public static boolean comprobarMatris2(int[][] matrisM, int[][] matrisP, int i, int j) {
        boolean check = true;

        for (int i2 = 0; i2 < matrisP.length; i2++) {
            for (int j2 = 0; j2 < matrisP.length; j2++) {

                if (matrisP[i2][j2] != matrisM[i + i2][j + j2]) {

                    return false;
                }
            }
        }
        return check;
    }

    public static boolean estaContenida(int[][] matrisM, int[][] matrisP) {
        for (int i = 0; i < matrisM.length; i++) {
            for (int j = 0; j < matrisM.length; j++) {

                if (matrisM[i][j] == matrisP[0][0] &&/*limito los bordes ->*/ j <= matrisM[i].length - matrisP[0].length && i <= matrisM.length - matrisP.length) {
                    boolean check = comprobarMatris2(matrisM, matrisP, i, j);

                    if (check == true) { 
                        return true;
                    }
                }
            }

        }
        return false;
    }
  
public static void main(String []main){
//        
//        int [] arreglo={1,1,2,4,8,1};
//        sumarLista(arreglo);
//        
////        
//        int [][] bidimensional={{'@',1,1,1},{1,1,1,1}};
//        System.out.println("buscarMayor : "+buscarMayor(bidimensional));
//        
//        
//        String palabra="ASDsdasdwss";
//        System.out.println("cuentaVocales : "+cuentaVocales( palabra));
//        
//        
//        System.out.println("cuentaCaracter : "+cuentaCaracter( palabra ,'s'));
//        
//        
//        int [] Vector100= new int[100];
//       System.out.println("imprimirDecendente + relleneVector : ");
//       imprimirDecendente(relleneVector(Vector100));
        
//        int [] vectorN= new int[33];
//        relleneVectorN(vectorN);


//     int [][]Vector4x4= new int[4][4];
////        relleneVector4x4(Vector4x4);
//   int [][]VectorEJEMPLO= { {0,-2,4},
//                            {2,0,2},
//                            {-4,-2,0}};
//      int [][]VectorEJEMPLO2= { {1,1,1},
//                            {1,1,1},
//                            {1,1,1}};
//       System.out.println (esSimetrica(VectorEJEMPLO));
//       
       
       
//        int[][] Vector3x3 = {{2,7,6},
//                             {9,9,1},
//                             {4,3,8}};
//       System.out.println (cuadradoMagico( Vector3x3));
        
        
         int[][] matrizM = {
            {1, 3, 3, 4, 5, 6, 7, 1, 2, 2},
            {11, 12, 13, 14, 15, 16, 17, 11, 12, 13},
            {21, 22, 23, 24, 25, 26, 21, 21, 22, 23},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 1, 2},
            {3, 52, 53, 54, 55, 56, 57, 58, 11, 12},
            {13, 62, 63, 64, 65, 66, 67, 68, 21, 22},
            {23, 72, 73, 74, 75, 76, 77, 1, 2, 3},
            {81, 82, 83, 84, 85, 86, 87, 11, 5, 13},
            {91, 92, 93, 94, 95, 96, 97, 21, 22, 23}
        };

        int[][] matrizP = {
            {1, 2, 3},
            {11, 12, 13},
            {21, 22, 23}
        };
        
        System.out.println(estaContenida( matrizM,  matrizP));

    }
    
}
    

