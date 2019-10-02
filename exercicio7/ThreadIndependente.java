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
public class ThreadIndependente implements Runnable{
    SemaforoBinario semaforo;
    
    public ThreadIndependente(SemaforoBinario semaforo){
        this.semaforo = semaforo;
    }
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId() + ": thread independente esperando...");
        semaforo.P_ind();
        System.out.println(Thread.currentThread().getId() + ": thread independente comecou a executar");
        System.out.println(Thread.currentThread().getId() + ": thread independente terminou o que precisava fazer, liberando...");
        semaforo.V_ind();
        System.out.println(Thread.currentThread().getId() + ": thread independente liberada");
    }
}
