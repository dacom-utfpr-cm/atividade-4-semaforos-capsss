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
public class ThreadQueNaoFazNadaDeUtil2 implements Runnable{
    SemaforoBinarioDuplo semaforo;
    
    public ThreadQueNaoFazNadaDeUtil2(SemaforoBinarioDuplo semaforo){
        this.semaforo = semaforo;
    }
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId() + ": t2 esperando para executar a parte 1...");
        semaforo.P2();
        System.out.println(Thread.currentThread().getId() + ": t2 comecou a executar a parte 1");
        System.out.println(Thread.currentThread().getId() + ": t2 terminou a parte 1, liberando...");
        semaforo.V2();
        System.out.println(Thread.currentThread().getId() + ": t2 liberado");
        
        System.out.println(Thread.currentThread().getId() + ": t2 esperando para executar a parte 2...");
        semaforo.P2();
        System.out.println(Thread.currentThread().getId() + ": t2 comecou a executar a parte 2");
        System.out.println(Thread.currentThread().getId() + ": t2 terminou a parte 2, liberando...");
        semaforo.V2();
        System.out.println(Thread.currentThread().getId() + ": t2 liberado");
    }
}
