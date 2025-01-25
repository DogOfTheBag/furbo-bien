package data;

/**
 *
 * @author alber
 */
public class ResultadoEquipo {

    private Equipo equipo;
    
    private int goles;

    public ResultadoEquipo(Equipo equipo, int goles) {
        this.equipo = equipo;
        this.goles = goles;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
}
