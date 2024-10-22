package clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JTextField;
import static clases.VentanaPrincipal.y;
/**
 *
 * @author Programación
 */
public class RellenoDeCanciones {
    private VentanaPrincipal proyect;
    public List<BandasDTO> listaCanciones = new ArrayList<BandasDTO>();
    public List<BandasDTO> rellenoCanciones = new ArrayList<BandasDTO>();

    public RellenoDeCanciones(VentanaPrincipal proyectGuitar) {
        proyect = proyectGuitar;
    }
    public void mostrarCanciones(List<BandasDTO> listaBanda){
            int contadorJTextFieldNombre = 2;
            int contadorJTextFieldDificultad = 1;
            int cantidadCanciones = listaBanda.size() - 1;
            for (int i = y * 7, j = 0; i < listaBanda.size() && j < 7; i++, j++) {
                if (i == cantidadCanciones || cantidadCanciones == 0) {
                    System.out.println(i + ", " + cantidadCanciones);
                    proyect.boton2.setVisible(false);
                } else {
                    proyect.boton2.setVisible(true);
                }
                BandasDTO bandas = listaBanda.get(i);
                String nameCancion = bandas.getNombreCancion();
                String nameBanda = bandas.getNombreBanda();
                String dificultad = bandas.getDificultad();

                String nombreTextFiel = "textField".concat(
                        String.valueOf(contadorJTextFieldNombre));
                String nombreTextFieldDifi = "textFieldDifi".concat(
                        String.valueOf(contadorJTextFieldDificultad));

                JTextField textField;
                try {
                    textField = (JTextField) proyect.getClass().getField(
                            nombreTextFiel).get(proyect);
                    JTextField textField2 = (JTextField) proyect.getClass().
                            getField(nombreTextFieldDifi).get(proyect);

                    textField.setText(nameCancion.concat(" - ").concat(
                            nameBanda));
                    textField2.setText(dificultad);
                } catch (Exception e) {
                    System.err.println(e);
                }
                contadorJTextFieldNombre++;
                contadorJTextFieldDificultad++;
            }
    }

    public List<BandasDTO> mezclarCanciones(List<BandasDTO> listaCanciones) {
        Collections.shuffle(listaCanciones);
        return listaCanciones;
    }
}
