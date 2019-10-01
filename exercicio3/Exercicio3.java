/*
 * Carlos Alexandre Peron dos Santos
 * 
 * Faça um código que possibilite que 2 ou mais threads realizem o incremento de um contador.
 * Faça a exclusão mútua com semáforo.
 */
package exercicio3;

/**
 *
 * @author a834173
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quantasThreads = 1000;
        Inteiro contador = new Inteiro(0);
        SemaforoBinario mutex = new SemaforoBinario(true);
        
        for(int i=0; i<quantasThreads; i++){
            Thread t = new Thread(new ThreadIncrementadora(contador, mutex));
            t.start();
        }
        
    }
    
}
