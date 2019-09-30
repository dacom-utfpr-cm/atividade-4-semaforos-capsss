/* Carlos Alexandre Peron dos Santos
 *
 * Faça um código que uma thread t1 e t2 são inicializadas simultaneamente,
 * mas a t2 pode somente continuar a execução após a sinalização de t1
 */
package exercicio1;

/**
 *
 * @author a834173
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SemaforoBinario semaforo = new SemaforoBinario(true);
        
        Thread t1 = new Thread(new ThreadQueNaoFazNadaDeUtil(semaforo));
        Thread t2 = new Thread(new ThreadQueNaoFazNadaDeUtil(semaforo));
        
        t1.start();
        t2.start();
    }
    
}
