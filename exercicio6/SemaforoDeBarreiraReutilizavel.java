/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author a834173
 */
public class SemaforoDeBarreiraReutilizavel {
    private int numeroDeThreadsFaltantes;
    int quantasThreadsJaLiberaram;
    int quantidadeMaxima;
    
    public SemaforoDeBarreiraReutilizavel(int quantidade){
        this.numeroDeThreadsFaltantes = quantidade;
        this.quantasThreadsJaLiberaram = 0;
        this.quantidadeMaxima = quantidade;
    }
    
    public synchronized void P(){
        numeroDeThreadsFaltantes--;
        while(numeroDeThreadsFaltantes > 0 && quantasThreadsJaLiberaram <= 0){
            try{
                this.wait();
            } catch (InterruptedException e) {
                
            }
        }
    }
    
    public synchronized void V(){
        quantasThreadsJaLiberaram++;
        if(quantasThreadsJaLiberaram == numeroDeThreadsFaltantes){
            numeroDeThreadsFaltantes = quantidadeMaxima;
        }
        this.notify();
    }
   
}
