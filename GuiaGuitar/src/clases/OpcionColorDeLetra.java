package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Programación
 */
public class OpcionColorDeLetra {

    Color colorElegido;
    VentanaPrincipal proyect;

    public OpcionColorDeLetra(VentanaPrincipal proyect) {
        this.proyect = proyect;
    }

    public void mostrarPaletaColores() {
        JFrame paletaColores = new JFrame();
        JPanel panelColores = new JPanel();
        panelColores.setLayout(new GridLayout(0, 5));

        paletaColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paletaColores.setTitle("Elige un color de letra");
        paletaColores.setLayout(new BorderLayout());

        JButton botonAplicarColor = new JButton("Aplicar Color");
        botonAplicarColor.setBounds(0, 260, 50, 100);
        botonAplicarColor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (colorElegido == null) {
                    paletaColores.dispose();
                } else {
                    //Coponentes de la clase ProyectGuitar
                    //JTextFields donde aparece el nombre de la cancion
                    //----------------------------------------------------------
                    proyect.textField1.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textField2.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textField3.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textField4.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textField5.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textField6.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textField7.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textField8.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    //----------------------------------------------------------
                    //JTextFields donde aparece la dificultad
                    proyect.textFieldDifi1.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textFieldDifi2.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textFieldDifi3.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textFieldDifi4.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textFieldDifi5.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textFieldDifi6.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    proyect.textFieldDifi7.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    //----------------------------------------------------------
                    //JComboBox
                    proyect.combo1.setForeground(new Color(colorElegido.getRed(),
                            colorElegido.getGreen(), colorElegido.getBlue()));
                    //Componentes de la clase ventanaBusPath
                    VentanaPrincipal.colorSelec = colorElegido;

                    paletaColores.dispose();
                }
            }
        });

        paletaColores.add(botonAplicarColor, BorderLayout.SOUTH);
        Color colores[] = {
            new Color(255, 0, 0), // Rojo
            new Color(0, 255, 0), // Verde
            new Color(0, 0, 255), // Azul
            new Color(255, 255, 0), // Amarillo
            new Color(255, 165, 0), // Naranja
            new Color(128, 0, 128), // Púrpura
            new Color(0, 255, 255), // Cian
            new Color(255, 192, 203),// Rosa
            new Color(139, 69, 19), // Marrón
            new Color(0, 128, 128), // Turquesa
            new Color(0, 128, 0), // Verde oscuro
            new Color(255, 105, 180),// Hot Pink
            new Color(0, 0, 128), // Azul Marino
            new Color(75, 0, 130), // Índigo
            new Color(192, 192, 192),// Plata
            new Color(128, 128, 128),// Gris
            new Color(255, 20, 147), // Deep Pink
            new Color(255, 223, 0), // Dorado
            new Color(60, 179, 113), // Verde claro
            new Color(255, 69, 0) // Rojo Anaranjado
        };

        for (Color color : colores) {
            JButton button = new JButton();
            button.setBackground(color);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    colorElegido = color;
                }
            });
            panelColores.add(button);
        }
        panelColores.setSize(50, 50);
        paletaColores.add(panelColores, BorderLayout.CENTER);
        paletaColores.setVisible(true);
        paletaColores.setSize(300, 250);
        paletaColores.setResizable(false);
        paletaColores.setLocationRelativeTo(null);
    }
}
