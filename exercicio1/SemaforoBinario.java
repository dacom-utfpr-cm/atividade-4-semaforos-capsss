/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author a834173
 */
public class SemaforoBinario {
    private boolean semaforo;
    
    public SemaforoBinario(boolean valor_inicial){
        this.semaforo = valor_inicial;
    }
    
    public synchronized void P(){
        while(!semaforo){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
        semaforo = false;
    }
    
    public synchronized void V(){
        semaforo = true;
        this.notify();
    }
    
}
