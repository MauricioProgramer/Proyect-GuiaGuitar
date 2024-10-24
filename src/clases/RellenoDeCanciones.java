package clases;

import static clases.VentanaPrincipal.colorSelec;
import java.util.List;
import java.util.Collections;
import javax.swing.JTextField;
import static clases.VentanaPrincipal.y;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import static clases.VentanaPrincipal.nameCanActual;

/**
 *
 * @author Programación
 */
public class RellenoDeCanciones {

    private VentanaPrincipal proyect;

    public RellenoDeCanciones(VentanaPrincipal proyectGuitar) {
        proyect = proyectGuitar;
    }

    public void mostrarCanciones(List<BandasDTO> listaBanda) {

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
            actualizarCancionesEnPantalla(bandas, contadorJTextFieldNombre,
                    contadorJTextFieldDificultad);
            contadorJTextFieldNombre++;
            contadorJTextFieldDificultad++;
        }
    }

    public void actualizarCancionesEnPantalla(BandasDTO bandas, int contadorJNombre,
            int contadorJDificultad) {

        String nameCancion = bandas.getNombreCancion();
        String nameBanda = bandas.getNombreBanda();
        String dificultad = bandas.getDificultad();
        String nombreTextFiel = "textField".concat(
                String.valueOf(contadorJNombre));
        String nombreTextFieldDifi = "textFieldDifi".concat(
                String.valueOf(contadorJDificultad));

        try {

            JTextField textField1 = (JTextField) proyect.getClass().getField(
                    nombreTextFiel).get(proyect);
            JTextField textField2 = (JTextField) proyect.getClass().getField(
                    nombreTextFieldDifi).get(proyect);
            textField1.setText(nameCancion.concat(" - ").concat(nameBanda));
            textField2.setText(dificultad);
            
            añadirBarraMenuJTextField(textField1, bandas);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public List<BandasDTO> mezclarCanciones(List<BandasDTO> listaCanciones) {
        Collections.shuffle(listaCanciones);
        return listaCanciones;
    }

    public void añadirBarraMenuJTextField(JTextField textField, BandasDTO bandas) {
        JPopupTextField menuJTextField = new JPopupTextField(bandas);
        JPopupMenu popupMenu = menuJTextField.añadirMenusDisponibles();

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1){
                    popupMenu.show(textField, 0, textField.getHeight());
                    nameCanActual = bandas.getNombreCancion();
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e){
                textField.setForeground(Color.WHITE);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                textField.setForeground(colorSelec);
            }
        });
    }
    }