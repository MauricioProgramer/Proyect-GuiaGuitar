package clases;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Programación
 */
public class EstiloMensajeEmergente {
    private Font fuente;
    private Color colorTexto;
    private Color colorFondo;
    private Color colorFondoPanel;
    private int grosorTexto;

    public EstiloMensajeEmergente(
            Font fuente, Color colorTexto, Color colorFondo,
            Color colorFondoPanel, int grosorTexto) {
        this.fuente = fuente;
        this.colorTexto = colorTexto;
        this.colorFondo = colorFondo;
        this.grosorTexto = grosorTexto;
        this.colorFondoPanel = colorFondoPanel;
    }

    public void mostrarMensaje(String mensaje, String titulo) {
        UIManager.put("OptionPane.messageFont", fuente);
        UIManager.put("OptionPane.messageForeground", colorTexto);
        UIManager.put("OptionPane.background", colorFondo);
        UIManager.put("Panel.background", colorFondoPanel);
        UIManager.put("OptionPane.border", BorderFactory.createLineBorder(Color.RED, 5));


        
        UIManager.put("Button.foreground", colorTexto);
        

        JTextPane textPane = new JTextPane();
        textPane.setText(mensaje);
        textPane.setForeground(colorTexto);
        textPane.setBackground(colorFondo);
        textPane.setFont(fuente.deriveFont((float) grosorTexto));
        textPane.setEditable(false);
        textPane.setOpaque(true);

        JOptionPane.showMessageDialog(null, textPane, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Métodos setters para actualizar los estilos si es necesario
    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public void setColorFondoPanel(Color colorFondoPanel) {
        this.colorFondoPanel = colorFondoPanel;
    }
    public void setGrosorTexto(int grosorTexto) {
        this.grosorTexto = grosorTexto;
    }
}
