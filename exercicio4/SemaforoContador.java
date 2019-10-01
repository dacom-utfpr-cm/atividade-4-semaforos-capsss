/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author a834173
 */
public class SemaforoContador {
    private int disponivel;
    
    public SemaforoContador(int capacidade){
        this.disponivel = capacidade;
    }
    
    public synchronized void P(){
        while(disponivel < 1){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
        disponivel--;
    }
    
    public synchronized void V(){
        disponivel++;
        this.notify();
    }
    
}
