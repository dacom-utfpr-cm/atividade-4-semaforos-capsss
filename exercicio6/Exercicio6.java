/*
 * Carlos Alexandre Peron dos Santos
 * 
 * Faça um código que implemente uma barreira reusável que feche a si própria após todas as threads passarem.
 */
package exercicio6;


public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroDeThreadsParaOBloqueio = 5;
        SemaforoDeBarreiraReutilizavel semaforo = new SemaforoDeBarreiraReutilizavel(numeroDeThreadsParaOBloqueio);
        
        for(int i=0; i<numeroDeThreadsParaOBloqueio; i++){
            Thread t = new Thread(new ThreadQueNaoFazNadaDeUtilDuplamente(semaforo));
            t.start();
        }
    }
    
}
