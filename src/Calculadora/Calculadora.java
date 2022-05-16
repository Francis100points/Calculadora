/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Francis Castillo
 */
public class Calculadora {
     // Atributos de la clase 
   private double num1;
   private double num2;
   private String marca;
   private String modelo;
     
    
    // Métodos de la clase
    // Constructor por defecto
    
    public Calculadora (double num1, double num2, String marca, String modelo ){
        this.num1=num1;
        this.num2=num2;
        this.marca=marca;
        this.modelo=modelo;
        
    }
     // Constructor sobrecargado
    public Calculadora(String marca, String modelo ){
        this.marca=marca;
        this.modelo=modelo;
    }
    // Constructor sobrecargado
    public Calculadora(){
        
    }
}