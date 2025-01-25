package data;
import java.lang.Math; 
/**
 *
 * @author alber
 */

public class Torneo {
    
  
    
    private Ronda rondas[];
  
    public Torneo(Equipo[] equipos, int numEquipos) {
        double numRondas = Math.sqrt(numEquipos);
        
        this.rondas = new Ronda[numRondas(numRondas)];
    }

    
    
}
