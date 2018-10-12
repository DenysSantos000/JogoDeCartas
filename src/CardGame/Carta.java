
package CardGame;
/**
 *
 * @author Denys
 */
public class Carta {    
    private String face;
    private String naipe;
    public Carta(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    } 
    public String toString(){
        return face + " de " + naipe;
    }  
}
