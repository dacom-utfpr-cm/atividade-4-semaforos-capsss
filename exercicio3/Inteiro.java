/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author a834173
 */
public class Inteiro {
    int contador;
    
    public Inteiro(int valor){
        this.contador = valor;
    }
    
    public void incrementar(){
        this.contador++;
    }
    
    public int get(){
        return this.contador;
    }
}
