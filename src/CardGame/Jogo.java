
package CardGame;
 
import java.util.Scanner;
/**
 *
 * @author Denys
 */
public class Jogo {   
    private Scanner entrada;
    private Baralho baralho;
    private Jogador[] jogadores;   
    public Jogo(){       
        baralho = new Baralho();
        baralho.mostrarBaralho();
        baralho.embaralhar();
        baralho.mostrarBaralho();        
        entrada = new Scanner(System.in);     
    }
    public void iniciarJogo(){       
        System.out.println("Quantos jogadores irao participar? (maximo de 7 jogadores)");
        int qtdJogadores = entrada.nextInt();
        jogadores = new Jogador[qtdJogadores];      
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("Digite o nome do jogador " + (i+1));   
            jogadores[i] = new Jogador(entrada.next());
        }      
    }  
    public void distribuirCartas(int qtd){
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].setCartas(baralho.distibruirCartas(qtd));         
        }   
    } 
    public void mostrarCartas(){       
        for (Jogador j : jogadores) {
            j.mostrarCartas();
        } 
    }     
    public static void main(String[] args) {       
       Jogo jogo1 = new Jogo();
       jogo1.iniciarJogo();
       jogo1.distribuirCartas(7);
       jogo1.mostrarCartas();      
    }    
}