/*
 * Carlos Alexandre Peron dos Santos
 * 
 * Faça um código que possibilite barrar N threads em um ponto específico de execução e,
 * após todas alcançarem o ponto, todas devem executar o trecho de código após esse ponto.
 */
package exercicio5;

public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroDeThreadsParaOBloqueio = 5;
        SemaforoDeBarreira semaforo = new SemaforoDeBarreira(numeroDeThreadsParaOBloqueio);
        
        for(int i=0; i<numeroDeThreadsParaOBloqueio; i++){
            Thread t = new Thread(new ThreadQueNaoFazNadaDeUtil(semaforo));
            t.start();
        }
    }
    
}
