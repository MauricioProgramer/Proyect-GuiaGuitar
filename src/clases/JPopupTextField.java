package clases;

import static clases.VentanaPrincipal.colorSelec;
import static clases.VentanaPrincipal.listaCanciones;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import ventanas.ventanaBusPath;
import ventanas.ventanaMostrarPath;

/**
 *
 * @author Programación
 */
public class JPopupTextField {

    private final BandasDTO bandas;
    private boolean añadirFavorito = false;
    private ImageIcon icon;
    private int siOno = 1;
    private JMenuItem añadirFavoritos;
    private String estado = "Añadir";

    public JPopupTextField(BandasDTO bandas) {
        this.bandas = bandas;
        icon = new ImageIcon(getClass().getResource("/images/quitarFavorito.png"));
    }

    public JPopupMenu añadirMenusDisponibles() {
        JPopupMenu opcioneTextField = new JPopupMenu();

        //Opciones
        añadirFavoritos = new JMenuItem(estado.concat(" a Favoritos"), icon);
        añadirFavoritos.addActionListener(e -> añadirFavoritos());
        estiloDelJPopup(añadirFavoritos);

        JMenuItem detalles = new JMenuItem("Ver información", new ImageIcon(
                getClass().getResource("/images/ojo.png")));
        detalles.addActionListener(e -> verDetalles());
        estiloDelJPopup(detalles);

        JMenuItem verPath = new JMenuItem("Mostrar Path", new ImageIcon(
                getClass().getResource("/images/botonPath.png")));
        verPath.addActionListener(e -> verElPath());
        estiloDelJPopup(verPath);

        opcioneTextField.add(añadirFavoritos);
        opcioneTextField.add(detalles);
        opcioneTextField.add(verPath);

        return opcioneTextField;
    }

    private void estiloDelJPopup(JMenuItem item) {
        item.setFont(new Font("Segoe UI", 1, 14));
        item.setForeground(colorSelec);
        item.setBackground(new Color(246, 204, 152));
    }

    private void añadirFavoritos() {
        siOno++;
        
        switch (siOno) {
            case 1:
                icon = new ImageIcon(
                        getClass().getResource("/images/quitarFavorito.png"));
                estado = "Añadir".concat(" a Favoritos");
                break;
            case 2:
                icon = new ImageIcon(getClass().getResource("/images/ponerFavorito.png"));
                siOno = 0;
                estado = "Añadida".concat(" a Favoritos");
                break;
        }
        añadirFavoritos.setIcon(icon);
        añadirFavoritos.setText(estado);
        añadirFavoritos.repaint();
    }

    private void verDetalles() {
        String pathValidado = "";
        
        EstiloMensajeEmergente detallesDeCancion = new EstiloMensajeEmergente(
                new Font("Segoe UI", 1, 14), colorSelec,
                new Color(246, 204, 152),
                new Color(236, 194, 142),
                          14);
        detallesDeCancion.mostrarMensaje(
                "Detalles de la canción\n".
                        concat("Nombre: " + bandas.getNombreCancion() + "\n").
                        concat("Banda: " + bandas.getNombreBanda() + "\n").
                        concat("Dificultad: " + bandas.getDificultad() + "\n").
                        concat("Estado del Path: ".concat(pathValidado = validarPath()) + "\n").
                        concat("Duración: "),
                               "Informacion de la Canción");
    }

    private void verElPath() {
        List<BandasDTO> listCancione = new ArrayList<>();

        ventanaMostrarPath canActual = new ventanaMostrarPath();
        listCancione = canActual.buscarCancion(listaCanciones);
        ventanaBusPath confirmarPath = new ventanaBusPath();
        confirmarPath.iniciarVentanaPath(listCancione);
    }
    private String validarPath(){
        String siContiene = "Contiene Path";
        String noContiene = "No contiene Path";
        
        boolean contienePath = false;
        for (BandasDTO banda : listaCanciones) {
            if (banda.getDificultad_medio().contains("2")
                    || banda.getDificultad_medio().contains("3")
                    || banda.getDificultad_medio().contains("4")) {
                contienePath = true;
                break;
            }
        }
        if(contienePath == false){
            return noContiene;
        } else {
            return siContiene;
        }
    }
}
