/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIA5.Colecciones.Ejerc4;
import java.util.LinkedList;
/**
 *
 * @author Administrador
 */
public class Cuenta {
Long num;
    Double saldo;
    Double InteresesAnuales;
    Cliente titular;
    LinkedList<Movimiento> movimientos = new LinkedList<>();
    
    public Cuenta(Long num, Double saldo, Double InteresesAnuales, Cliente titular) {
        this.num = num;
        this.saldo = saldo;
        this.InteresesAnuales = InteresesAnuales;
        this.titular = titular;
    }

    public Cuenta(Long num, Cliente titular) {
        this.num = num;
        this.titular = titular;
    }
    
    
    public void depositar(Double Cantidad){
        
    }
    public void Extraer(Double Cantidad){
        
    }
    
}
