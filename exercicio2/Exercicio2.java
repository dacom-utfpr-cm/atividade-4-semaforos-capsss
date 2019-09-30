/* Carlos Alexandre Peron dos Santos
 *
 * Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa
 *
 * t1:
 *  trecho1.1
 *  trecho1.2
 * t2:
 *  trecho2.1
 *  trecho2.2
 *
 * thecho1.1 ocorre antes trecho2.2 e threcho2.1 ocorre antes de trecho1.2.
 */
package exercicio2;

/**
 *
 * @author a834173
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean valor_inicial = true;
        SemaforoBinarioDuplo semaforo = new SemaforoBinarioDuplo(valor_inicial, valor_inicial);
        
        Thread t1 = new Thread(new ThreadQueNaoFazNadaDeUtil1(semaforo));
        Thread t2 = new Thread(new ThreadQueNaoFazNadaDeUtil2(semaforo));
        
        t1.start();
        t2.start();
    }
    
}
