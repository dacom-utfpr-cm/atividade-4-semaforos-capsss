/*
 * Carlos Alexandre Peron dos Santos
 * 
 * Faça um código que possibilite que N threads estejam na seção crítica simultaneamente.
 */
package exercicio4;


public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int quantasThreads = 10;
        int capacidadeSemaforo = 3;
        SemaforoContador semaforo = new SemaforoContador(capacidadeSemaforo);
        
        for(int i=0; i<quantasThreads; i++){
            Thread t = new Thread(new ThreadIncrementadora(semaforo));
            t.start();
        }
        
        
    }
    
}
