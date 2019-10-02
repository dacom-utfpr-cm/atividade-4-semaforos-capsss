/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author a834173
 */
public class SemaforoBinario {
    private boolean semaforo_ind;
    private boolean semaforo_par_1;
    private boolean semaforo_par_2;
    
    public SemaforoBinario(boolean valor_inicial){
        this.semaforo_ind = valor_inicial;
        this.semaforo_par_1 = valor_inicial;
        this.semaforo_par_2 = valor_inicial;
    }
    
    public synchronized void P_par(){
        if(!semaforo_par_2){
            semaforo_par_2 = !semaforo_par_2;
        }
        while(!semaforo_par_1){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
        semaforo_par_1 = false;
        semaforo_par_2 = false;
    }
    
    public synchronized void V_par(){
        semaforo_par_1 = true;
        this.notify();
    }
    
    
    
    public synchronized void P_ind(){
        while(!semaforo_ind){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
        semaforo_ind = false;
    }
    
    public synchronized void V_ind(){
        semaforo_ind = true;
        this.notify();
    }
    
}
