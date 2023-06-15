/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KATATRAIN;

/**
 *
 * @author Administrador
 */
public class NewClass {
public static int solve(final String s) {
      int cont=0;
      boolean consonateAnterior=false;
      for(int i =0;i<s.toLowerCase().length();i++){
          switch (s.toLowerCase().charAt(i)){
          case 'a':
             consonateAnterior=false;
             break;
          case 'e':
              consonateAnterior=false;
              break;
          case 'i':
              consonateAnterior=false;
              break;
          case 'o':
              consonateAnterior=false;
              break;
          case 'u':
              consonateAnterior=false;
              break;
          default :
              //cont=cont<(s.charAt(i)-96) && consonateAnterior?cont+(s.charAt(i)-96):cont<(s.charAt(i)-96) && !consonateAnterior?(s.charAt(i)-96):cont ;
              
              System.out.println(s.charAt(i) +" : "+(s.charAt(i)-96));
              System.out.println(cont);
              consonateAnterior=true;
              break;
          }
                            
      }
         
      
        return cont;
    }

public static void main(String [] main ){
    System.out.print(solve("chruschtschov"));
}
}
