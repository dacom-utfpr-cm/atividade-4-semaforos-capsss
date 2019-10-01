/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author a834173
 */
public class SemaforoDeBarreira {
    private int numeroDeThreadsFaltantes;
    
    public SemaforoDeBarreira(int quantidade){
        this.numeroDeThreadsFaltantes = quantidade;
    }
    
    public synchronized void P(){
        numeroDeThreadsFaltantes--;
        while(numeroDeThreadsFaltantes > 0){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
    }
    
    public synchronized void V(){
        this.notify();
    }
   
}
