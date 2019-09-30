/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author a834173
 */
public class SemaforoBinarioDuplo {
    private boolean semaforo1;
    private boolean semaforo2;
    
    public SemaforoBinarioDuplo(boolean valor_inicial1, boolean valor_inicial2){
        this.semaforo1 = valor_inicial1;
        this.semaforo2 = valor_inicial2;
    }
    
    public synchronized void P1(){
        while(!(semaforo1 == semaforo2)){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
    }
    
    public synchronized void P2(){
        while(!(semaforo1 != semaforo2)){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
    }
    
    public synchronized void V1(){
        semaforo1 = !semaforo1;
        this.notify();
    }
    
    public synchronized void V2(){
        if(semaforo2){
            semaforo2 = !semaforo2;
            semaforo1 = !semaforo1;
        } else {
            semaforo2 = !semaforo2;
        }
        this.notify();
    }
    
}
