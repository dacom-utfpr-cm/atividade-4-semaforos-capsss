/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class ThreadQueNaoFazNadaDeUtil implements Runnable{
    SemaforoDeBarreira semaforo;
    
    public ThreadQueNaoFazNadaDeUtil(SemaforoDeBarreira semaforo){
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + ": esperando as outras threads para executar");
        semaforo.P();
        System.out.println(Thread.currentThread().getId() + ": conseguiu acesso, executando esse print apenas, liberando...");
        semaforo.V();
        System.out.println(Thread.currentThread().getId() + ": liberado");
    }
    
}
