package data;

/**
 *
 * @author alber
 */
public class Ronda {
    
    private Partido partidos[];

    public Ronda(Partido[] partidos) {
        this.partidos = partidos;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }
    
    
}
