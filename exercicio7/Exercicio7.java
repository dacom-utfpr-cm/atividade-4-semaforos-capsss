/*
 * Carlos Alexandre Peron dos Santos
 * 
 * Faça um código que implemente duas filas (F1 e F2) com semáforos.
 * As threads colocadas na F1 só podem executar se tiver um par na F2.
 * Nesse caso, ambas as threads na primeira fila são executadas.
 */
package exercicio7;

/**
 *
 * @author xandi
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SemaforoBinario semaforo = new SemaforoBinario(true);
        Thread F1[] = new Thread[5];
        Thread F2[] = new Thread[10];
        
        for(int i=0; i<5; i++){
            Thread t = new Thread(new ThreadQuePrecisaDePar(semaforo));
            F1[i] = t;
            F1[i].start();
        }
        
        for(int i=0; i<10; i++){
            if(i % 2 == 0){
                Thread t = new Thread(new ThreadQuePrecisaDePar(semaforo));
                F2[i] = t;
                F2[i].start();
            } else {
                Thread t = new Thread(new ThreadIndependente(semaforo));
                F2[i] = t;
                F2[i].start();
            }
            
        }
        
        
    }
    
}
