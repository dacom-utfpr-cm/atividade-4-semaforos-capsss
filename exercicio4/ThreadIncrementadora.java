/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a834173
 */
public class ThreadIncrementadora implements Runnable{
    SemaforoContador semaforo;
    
    public ThreadIncrementadora(SemaforoContador semaforo){
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + ": esperando para executar");
        semaforo.P();
        System.out.println(Thread.currentThread().getId() + ": conseguiu acesso, preparando para dormir inutilmente");
        
        Random valorAleatorio = new Random();
        try {
            Thread.sleep((valorAleatorio.nextInt(5) +1) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadIncrementadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(Thread.currentThread().getId() + ": acordado, liberando...");
        semaforo.V();
        System.out.println(Thread.currentThread().getId() + ": liberado");
    }
    
}
