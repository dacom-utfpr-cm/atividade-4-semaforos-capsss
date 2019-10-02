/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class ThreadQueNaoFazNadaDeUtilDuplamente implements Runnable{
    SemaforoDeBarreiraReutilizavel semaforo;
    
    public ThreadQueNaoFazNadaDeUtilDuplamente(SemaforoDeBarreiraReutilizavel semaforo){
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + ": esperando as outras threads para executar a parte 1");
        semaforo.P();
        System.out.println(Thread.currentThread().getId() + ": conseguiu acesso a parte 1, executando esse print apenas, liberando...");
        semaforo.V();
        
        System.out.println(Thread.currentThread().getId() + ": esperando as outras threads para executar a parte 2");
        
        semaforo.P();
        System.out.println(Thread.currentThread().getId() + ": conseguiu acesso a parte 2, executando esse print apenas, liberando...");
        semaforo.V();
        System.out.println(Thread.currentThread().getId() + ": liberado");
    }
    
}
