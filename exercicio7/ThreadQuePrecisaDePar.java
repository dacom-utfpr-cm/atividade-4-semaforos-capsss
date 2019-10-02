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
public class ThreadQuePrecisaDePar implements Runnable{
    SemaforoBinario semaforo;
    
    public ThreadQuePrecisaDePar(SemaforoBinario semaforo){
        this.semaforo = semaforo;
    }
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId() + ": thread pareada esperando par...");
        semaforo.P_par();
        System.out.println(Thread.currentThread().getId() + ": thread pareada comecou a executar");
        System.out.println(Thread.currentThread().getId() + ": thread pareada terminou o que precisava fazer, liberando...");
        semaforo.V_par();
        System.out.println(Thread.currentThread().getId() + ": thread pareada liberada");
    }
}
