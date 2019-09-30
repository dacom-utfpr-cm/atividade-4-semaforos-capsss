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
public class ThreadQueNaoFazNadaDeUtil implements Runnable{
    SemaforoBinario semaforo;
    
    public ThreadQueNaoFazNadaDeUtil(SemaforoBinario semaforo){
        this.semaforo = semaforo;
    }
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId() + ": esperando...");
        semaforo.P();
        System.out.println(Thread.currentThread().getId() + ": comecou a executar");
        System.out.println(Thread.currentThread().getId() + ": terminou o que precisava fazer, liberando...");
        semaforo.V();
        System.out.println(Thread.currentThread().getId() + ": liberado");
    }
}
