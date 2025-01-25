package data;

/**
 *
 * @author alber
 */
public class Partido {
 
    private ResultadoEquipo equipo1;
    
    private ResultadoEquipo equipo2;

    public Partido(ResultadoEquipo equipo1, ResultadoEquipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public ResultadoEquipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(ResultadoEquipo equipo1) {
        this.equipo1 = equipo1;
    }

    public ResultadoEquipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(ResultadoEquipo equipo2) {
        this.equipo2 = equipo2;
    }
   
   
    
    
}
