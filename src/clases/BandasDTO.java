package clases;

/**
 *
 * @author Programación
 */
public class BandasDTO {
    private String dificultad;
    private String nombreBanda;
    private String combo_facil;
    private String combo_medio;
    private String nombreCancion;
    private String combo_dificil;
    private String combo_experto;
    private String dificultad_facil;
    private String dificultad_medio;
    private String dificultad_dificil;
    private String dificultad_experto;

    public BandasDTO() {
    }

    public BandasDTO(String nombreBanda, String nombreCancion,
            String dificultad, String dificultad_facil, String dificultad_medio,
            String dificultad_dificil, String dificultad_experto,
            String combo_facil, String combo_medio, String combo_dificil,
            String combo_experto) {
        
        this.dificultad = dificultad;
        this.nombreBanda = nombreBanda;
        this.combo_facil = combo_facil;
        this.combo_medio = combo_medio;
        this.combo_dificil = combo_dificil;
        this.combo_experto = combo_experto;
        this.nombreCancion = nombreCancion;
        this.dificultad_facil = dificultad_facil;
        this.dificultad_medio = dificultad_medio;
        this.dificultad_dificil = dificultad_dificil;
        this.dificultad_experto = dificultad_experto;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }
    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }
    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getDificultad() {
        return dificultad;
    }
    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getDificultad_facil() {
        return dificultad_facil;
    }
    public void setDificultad_facil(String dificultad_facil) {
        this.dificultad_facil = dificultad_facil;
    }
    public String getDificultad_medio() {
        return dificultad_medio;
    }
    public void setDificultad_medio(String dificultad_medio) {
        this.dificultad_medio = dificultad_medio;
    }
    public String getDificultad_dificil() {
        return dificultad_dificil;
    }
    public void setDificultad_dificil(String dificultad_dificil) {
        this.dificultad_dificil = dificultad_dificil;
    }
    public String getDificultad_experto() {
        return dificultad_experto;
    }

    public void setDificultad_experto(String dificultad_experto) {
        this.dificultad_experto = dificultad_experto;
    }

    public String getCombo_facil() {
        return combo_facil;
    }
    public void setCombo_facil(String combo_facil) {
        this.combo_facil = combo_facil;
    }

    public String getCombo_medio() {
        return combo_medio;
    }
    public void setCombo_medio(String combo_medio) {
        this.combo_medio = combo_medio;
    }

    public String getCombo_dificil() {
        return combo_dificil;
    }
    public void setCombo_dificil(String combo_dificil) {
        this.combo_dificil = combo_dificil;
    }
    public String getCombo_experto() {
        return combo_experto;
    }
    public void setCombo_experto(String combo_experto) {
        this.combo_experto = combo_experto;
    }
}
