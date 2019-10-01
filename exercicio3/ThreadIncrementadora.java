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
public class ThreadIncrementadora implements Runnable{
    Inteiro contador;
    SemaforoBinario mutex;
    
    public ThreadIncrementadora(Inteiro contador, SemaforoBinario mutex){
        this.contador = contador;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + ": esperando para executar");
        mutex.P();
        System.out.println(Thread.currentThread().getId() + ": conseguiu acesso, preparando para incrementar");
        contador.incrementar();
        System.out.println(Thread.currentThread().getId() + ": incrementado, contador: " + contador.get() + ", liberando...");
        mutex.V();
        System.out.println(Thread.currentThread().getId() + ": liberado");
    }
    
}
