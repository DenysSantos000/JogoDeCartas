 
package CardGame;
/**
 *
 * @author Denys
 */
public class Jogador {   
    private String nome;
    private Carta[] cartas;
    public Jogador(String nome) {
        this.nome = nome;
        cartas = new Carta[7];
    }
    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;     
    }   
    public void mostrarCartas(){       
        System.out.println("CARTAS DE " + nome);   
        for(Carta i: cartas){
            System.out.println(i.toString());
        } 
    }
    public String getNome() {
        return nome;
    }
}