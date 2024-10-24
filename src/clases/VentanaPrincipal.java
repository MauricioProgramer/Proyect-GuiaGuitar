package clases;

import javax.swing.ImageIcon;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Programación
 */
public class VentanaPrincipal extends JFrame
        implements ActionListener, ItemListener, KeyListener {

    //--------------------------------------------------------------------------
    //Componentes usados
    //--------------------------------------------------------------------------
    protected JMenu menu1;
    private JLabel label1;
    protected JComboBox combo1;
    protected JMenuBar menuBar1;
    protected JFrame ventanaIdiomas;
    protected ButtonGroup opcionesIdioma;
    protected JMenuItem opcionColorLetra, opcionIdioma;
    protected JRadioButton casillaEspanol, casillaIngles;
    protected JButton boton1, boton2, boton3, boton4, boton5;
    public JTextField textField1, textField2, textField3, textField4,
            textField5, textField6, textField7, textField8;
    public JTextField textFieldDifi1, textFieldDifi2, textFieldDifi3,
            textFieldDifi4, textFieldDifi5, textFieldDifi6, textFieldDifi7;
    protected JMenuBar barraMenu;
    protected JMenu opciones;
    protected JMenuItem opcionCambiarColorLetra;
    //--------------------------------------------------------------------------
    //Variables declaradas
    //--------------------------------------------------------------------------
    public static Color colorSelec = new Color(255, 0, 0);
    public static String nameCanActual;
    public static int y = 0;
    public int actualizarIndice = 0;
    public String cancionBuscada;
    public static boolean _RELLENAR_ = true;
    public static boolean BANDA_MAYOR_7 = false;
    public static boolean validarVentana = true;
    public List<BandasDTO> rellenoCan = new ArrayList<BandasDTO>();
    public List<BandasDTO> bandaMayor7 = new ArrayList<BandasDTO>();
    protected static List<BandasDTO> listaCanciones = new ArrayList<BandasDTO>();
    public static List<BandasDTO> cancionPathSelec = new ArrayList<BandasDTO>();

    //--------------------------------------------------------------------------
    //Constructor de la clase
    //--------------------------------------------------------------------------
    @SuppressWarnings({"unchecked", "unchecked", "unchecked"})
    public VentanaPrincipal() {
        //----------------------------------------------------------------------
        //Importación de la lista de canciones de HojaExel a una List<BandasDTO>
        //----------------------------------------------------------------------
        AgregarCancionesModel agregarCancionesModel = new AgregarCancionesModel();
        try {
            agregarCancionesModel.agregarCancion();
            List<BandasDTO> listaCancion = agregarCancionesModel.mostrarListaCanciones();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!listaCanciones.isEmpty()) {
            listaCanciones.clear();
        }
        //Se guarda la importacion de las canciones
        listaCanciones = agregarCancionesModel.mostrarListaCanciones();
        //----------------------------------------------------------------------
        setTitle("ProyectGuitar");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/images/logo.png"));
        setIconImage(icono);

        barraMenu = new JMenuBar();
        opciones = new JMenu("Opciones");

        opcionCambiarColorLetra = new JMenuItem("cambiar color de letra");
        opcionCambiarColorLetra.addActionListener(this);
        opciones.add(opcionCambiarColorLetra);
        barraMenu.add(opciones);
        setJMenuBar(barraMenu);
        //----------------------------------------------------------------------
        //Espacios donde aparecen los nombres de las canciones 
        //----------------------------------------------------------------------
        textField2 = new JTextField();
        textField2.setEditable(false);
        textField2.setBounds(40, 200, 230, 22);
        textField2.setFont(new Font("Segoe UI", 1, 14));
        textField2.setForeground(colorSelec);
        textField2.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField2.setBorder(null);
        textField2.setOpaque(false);
        add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(40, 225, 230, 22);
        textField3.setFont(new Font("Segoe UI", 1, 14));
        textField3.setForeground(colorSelec);
        textField3.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField3.setEditable(false);
        textField3.setBorder(null);
        textField3.setOpaque(false);
        add(textField3);

        textField4 = new JTextField();
        textField4.setBounds(40, 252, 230, 22);
        textField4.setFont(new Font("Segoe UI", 1, 14));
        textField4.setForeground(colorSelec);
        textField4.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField4.setEditable(false);
        textField4.setBorder(null);
        textField4.setOpaque(false);
        add(textField4);

        textField5 = new JTextField();
        textField5.setBounds(40, 279, 230, 22);
        textField5.setFont(new Font("Segoe UI", 1, 14));
        textField5.setForeground(colorSelec);
        textField5.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField5.setEditable(false);
        textField5.setBorder(null);
        textField5.setOpaque(false);
        add(textField5);

        textField6 = new JTextField();
        textField6.setBounds(40, 306, 230, 22);
        textField6.setFont(new Font("Segoe UI", 1, 14));
        textField6.setForeground(colorSelec);
        textField6.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField6.setEditable(false);
        textField6.setBorder(null);
        textField6.setOpaque(false);
        add(textField6);

        textField7 = new JTextField();
        textField7.setBounds(40, 336, 230, 22);
        textField7.setFont(new Font("Segoe UI", 1, 14));
        textField7.setForeground(colorSelec);
        textField7.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField7.setEditable(false);
        textField7.setBorder(null);
        textField7.setOpaque(false);
        add(textField7);

        textField8 = new JTextField();
        textField8.setBounds(40, 366, 230, 22);
        textField8.setFont(new Font("Segoe UI", 1, 14));
        textField8.setForeground(colorSelec);
        textField8.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField8.setEditable(false);
        textField8.setBorder(null);
        textField8.setOpaque(false);
        add(textField8);
        //----------------------------------------------------------------------
        //Espacios donde se muestra la dificultad de las canciones
        //----------------------------------------------------------------------
        textFieldDifi1 = new JTextField();
        textFieldDifi1.setBounds(270, 200, 22, 19);
        textFieldDifi1.setFont(new Font("Segoe UI", 1, 14));
        textFieldDifi1.setForeground(colorSelec);
        textFieldDifi1.setBackground(new java.awt.Color(0, 0, 0, 1));
        textFieldDifi1.setEditable(false);
        textFieldDifi1.setBorder(null);
        textFieldDifi1.setOpaque(false);
        add(textFieldDifi1);

        textFieldDifi2 = new JTextField();
        textFieldDifi2.setBounds(270, 225, 22, 19);
        textFieldDifi2.setFont(new Font("Segoe UI", 1, 14));
        textFieldDifi2.setForeground(colorSelec);
        textFieldDifi2.setBackground(new java.awt.Color(0, 0, 0, 1));
        textFieldDifi2.setEditable(false);
        textFieldDifi2.setBorder(null);
        textFieldDifi2.setOpaque(false);
        add(textFieldDifi2);

        textFieldDifi3 = new JTextField();
        textFieldDifi3.setBounds(270, 252, 22, 19);
        textFieldDifi3.setFont(new Font("Segoe UI", 1, 14));
        textFieldDifi3.setForeground(colorSelec);
        textFieldDifi3.setBackground(new java.awt.Color(0, 0, 0, 1));
        textFieldDifi3.setEditable(false);
        textFieldDifi3.setBorder(null);
        textFieldDifi3.setOpaque(false);
        add(textFieldDifi3);

        textFieldDifi4 = new JTextField();
        textFieldDifi4.setBounds(270, 279, 22, 19);
        textFieldDifi4.setFont(new Font("Segoe UI", 1, 14));
        textFieldDifi4.setForeground(colorSelec);
        textFieldDifi4.setBackground(new java.awt.Color(0, 0, 0, 1));
        textFieldDifi4.setEditable(false);
        textFieldDifi4.setBorder(null);
        textFieldDifi4.setOpaque(false);
        add(textFieldDifi4);

        textFieldDifi5 = new JTextField();
        textFieldDifi5.setBounds(270, 306, 22, 19);
        textFieldDifi5.setFont(new Font("Segoe UI", 1, 14));
        textFieldDifi5.setForeground(colorSelec);
        textFieldDifi5.setBackground(new java.awt.Color(0, 0, 0, 1));
        textFieldDifi5.setEditable(false);
        textFieldDifi5.setBorder(null);
        textFieldDifi5.setOpaque(false);
        add(textFieldDifi5);

        textFieldDifi6 = new JTextField();
        textFieldDifi6.setBounds(270, 336, 22, 19);
        textFieldDifi6.setFont(new Font("Segoe UI", 1, 14));
        textFieldDifi6.setForeground(colorSelec);
        textFieldDifi6.setBackground(new java.awt.Color(0, 0, 0, 1));
        textFieldDifi6.setEditable(false);
        textFieldDifi6.setBorder(null);
        textFieldDifi6.setOpaque(false);
        add(textFieldDifi6);

        textFieldDifi7 = new JTextField();
        textFieldDifi7.setBounds(270, 366, 22, 19);
        textFieldDifi7.setFont(new Font("Segoe UI", 1, 14));
        textFieldDifi7.setForeground(colorSelec);
        textFieldDifi7.setBackground(new java.awt.Color(0, 0, 0, 1));
        textFieldDifi7.setEditable(false);
        textFieldDifi7.setBorder(null);
        textFieldDifi7.setOpaque(false);
        add(textFieldDifi7);
        //----------------------------------------------------------------------
        // Barra de busqueda
        //----------------------------------------------------------------------
        textField1 = new JTextField();
        textField1.setBounds(75, 173, 158, 25);
        textField1.setFont(new Font("Segoe UI", 1, 14));
        textField1.setForeground(colorSelec);
        // textField1.setBackground(new Color(255, 255, 255));
        textField1.setBackground(new java.awt.Color(0, 0, 0, 1));
        textField1.setBorder(null);
        textField1.setOpaque(false);
        textField1.addKeyListener(this);
        TextPrompt txtField1 = new TextPrompt("Busca una canción", textField1);
        add(textField1);
        //----------------------------------------------------------------------
        //Boton de buscar
        //----------------------------------------------------------------------
        ImageIcon lupaBuscar = new ImageIcon(
                getClass().getResource("/images/lupa.png"));
        boton1 = new JButton(lupaBuscar);
        boton1.setBounds(246, 172, 30, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setBackground(new Color(0, 0, 0, 1));
        boton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton1.setFocusPainted(false);
        boton1.setOpaque(false);
        boton1.setBorder(null);
        boton1.addActionListener(this);
        add(boton1);
        //----------------------------------------------------------------------
        //Boton de Siguiente a la derecha
        //----------------------------------------------------------------------
        ImageIcon lupaSigDere = new ImageIcon(
                getClass().getResource("/images/Siguiente_derecha.png"));
        boton2 = new JButton(lupaSigDere);
        boton2.setBounds(250, 410, 30, 30);
        boton2.setBackground(new Color(246, 206, 154));
        boton2.setBackground(new java.awt.Color(0, 0, 0, 1));
        boton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton2.setFocusPainted(false);
        boton2.setVisible(true);
        boton2.setBorder(null);
        boton2.setOpaque(false);
        boton2.addActionListener(this);
        add(boton2);
        //----------------------------------------------------------------------
        //Boton de retroceder a la izquierda
        //----------------------------------------------------------------------
        ImageIcon lupaSigIzqui = new ImageIcon(
                getClass().getResource("/images/siguiente_izquierda.png"));
        boton3 = new JButton(lupaSigIzqui);
        boton3.setBounds(205, 410, 30, 30);
        boton3.setBackground(new Color(246, 206, 154));
        boton3.setBackground(new java.awt.Color(0, 0, 0, 1));
        boton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton3.setFocusPainted(false);
        boton3.setVisible(false);
        boton3.setBorder(null);
        boton3.setOpaque(false);
        boton3.addActionListener(this);
        add(boton3);
        //----------------------------------------------------------------------
        //boton de recargar la lista de canciones
        //----------------------------------------------------------------------
        ImageIcon botonRecargar = new ImageIcon(
                getClass().getResource("/images/flechaRecargarLista.png"));
        boton4 = new JButton(botonRecargar);
        boton4.setBounds(50, 180, 16, 16);
        boton4.setBackground(new java.awt.Color(0, 0, 0, 1));
        boton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton4.setFocusPainted(false);
        boton4.setBorder(null);
        boton4.setOpaque(false);
        boton4.addActionListener(this);
        add(boton4);
        //----------------------------------------------------------------------
        //Boton, estrella ventanaPath
        //----------------------------------------------------------------------
        ImageIcon botonRegresarPath = new ImageIcon(
                getClass().getResource("/images/botonPath.png"));
        boton5 = new JButton(botonRegresarPath);
        boton5.setBounds(269, 172, 20, 20);
        boton5.setFont(new Font("Segoe", 1, 12));
        boton5.setForeground(Color.RED);
        boton5.setBackground(new java.awt.Color(0, 0, 0, 1));
        boton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton5.setFocusPainted(false);
        boton5.setOpaque(false);
        boton5.setBorder(null);
        boton5.addActionListener(this);
        add(boton5);
        //----------------------------------------------------------------------
        //JcomboBox de las opciones de dificultad
        //----------------------------------------------------------------------
        combo1 = new JComboBox();
        combo1.setBounds(45, 398, 85, 20);
        combo1.setFont(new Font("Segoe UI", 1, 14));
        combo1.setForeground(colorSelec);
        combo1.setBackground(new Color(246, 204, 152));
        add(combo1);

        combo1.addItem("Canción");
        combo1.addItem("Banda");
        combo1.addItem("Nivel 3");
        combo1.addItem("Nivel 4");
        combo1.addItem("Nivel 5");
        combo1.addItem("Nivel 6");
        combo1.addItemListener(this);
        //----------------------------------------------------------------------
        //Esta instancia hace que aparescan los nombres de las canciones al arrancar el programa
        //----------------------------------------------------------------------
        RellenoDeCanciones rellenoCancion = new RellenoDeCanciones(this);
        rellenoCan = rellenoCancion.mezclarCanciones(listaCanciones);
        rellenoCancion.mostrarCanciones(rellenoCan);
        //----------------------------------------------------------------------
        //Label 1: Es el fonde de la interfaz
        //----------------------------------------------------------------------
        label1 = new JLabel();
        label1.setBounds(0, 0, 580, 540);
        add(label1);
        ImageIcon imagen = new ImageIcon(
                getClass().getResource("/images/fontVenPrincipal.png"));
        Icon font = new ImageIcon(imagen.getImage().getScaledInstance(
                label1.getWidth(), label1.getHeight(), Image.SCALE_DEFAULT));
        label1.setIcon(font);
        //----------------------------------------------------------------------
    }

    //Proceso al precionar el Boton1 o Buscar
    private void eventoBoton1() {

        y = 0;

        RellenoDeCanciones mostrarTablaCanciones = new RellenoDeCanciones(this);
        cancionBuscada = Optional.ofNullable(textField1.getText()).orElse("").trim();

        if (textField1.getText().isEmpty()) {
            EstiloMensajeEmergente mensajeEmergente = new EstiloMensajeEmergente(
            new Font("Segoe UI", 1, 14),
                    colorSelec,
                    new Color(246, 204, 152),
                    new Color(236, 194, 142),
                              14);
            mensajeEmergente.mostrarMensaje("Debes escribir algo......", "Capo vacio");
            return;
        }
        List<BandasDTO> cancionObandaBuscada = new ArrayList<BandasDTO>();
        String seleccion = (String) combo1.getSelectedItem();

        if ("Canción".equals(seleccion)) {
            cancionObandaBuscada.clear();
            for (BandasDTO bandas : listaCanciones) {
                if (bandas.getNombreCancion().toLowerCase().contains(
                        cancionBuscada.toLowerCase())) {
                    cancionObandaBuscada.add(bandas);
                }
            }
            if (cancionObandaBuscada.isEmpty()) {
                mensajeCancionNoEncontrada();
            }
            metodoLimpiar();
            mostrarTablaCanciones.mostrarCanciones(cancionObandaBuscada);
        } else if ("Banda".equals(seleccion)) {
            cancionObandaBuscada.clear();
            for (BandasDTO bandas : listaCanciones) {
                if (bandas.getNombreBanda().toLowerCase().contains(
                        cancionBuscada.toLowerCase())) {
                    cancionObandaBuscada.add(bandas);
                }
            }
            if (cancionObandaBuscada.size() > 7) {
                _RELLENAR_ = false;
                bandaMayor7 = cancionObandaBuscada;
                mostrarTablaCanciones.mostrarCanciones(cancionObandaBuscada);
                return;
            }
            if (cancionObandaBuscada.isEmpty()) {
                JOptionPane.showMessageDialog(null, """       
                                       La Banda no fue encontrada
                            Asegurese de que este escribiendo bien el nombre""");
                return;
            }
            metodoLimpiar();
            mostrarTablaCanciones.mostrarCanciones(cancionObandaBuscada);
        }

    }

    //Proceso al seleccionar una dificultad
    //Codigo de error: ISC_E
    private void eventoDificultadSelec() {
        RellenoDeCanciones rellenoCancion = new RellenoDeCanciones(this);
        List<BandasDTO> listaDificultadSelec = new ArrayList<BandasDTO>();
        String seleccion = (String) combo1.getSelectedItem();

        switch (seleccion) {
            case "Nivel 3":
                listaDificultadSelec = filtrarPorDificultad("3");
                break;
            case "Nivel 4":
                listaDificultadSelec = filtrarPorDificultad("4");
                break;
            case "Nivel 5":
                listaDificultadSelec = filtrarPorDificultad("5");
                break;
            case "Nivel 6":
                listaDificultadSelec = filtrarPorDificultad("6");
                break;
            case "Canción":
                rellenoCancion.mostrarCanciones(rellenoCan);
                break;
            case "Banda":
                if (cancionBuscada != null) {

                } else {
                    rellenoCancion.mostrarCanciones(rellenoCan);
                    return;
                }
            default:
                if (_RELLENAR_ == false) {
                    rellenoCancion.mostrarCanciones(bandaMayor7);
                } else if (_RELLENAR_ == true) {
                    rellenoCancion.mostrarCanciones(bandaMayor7);
                } else {
                    mostrarError();
                }
                return;
        }
        rellenoCancion.mostrarCanciones(listaDificultadSelec);
    }

    public List<BandasDTO> filtrarPorDificultad(String dificultad) {
        return listaCanciones.stream()
                .filter(bandas -> bandas.getDificultad().contains(dificultad))
                .collect(Collectors.toList());
    }

    private void mostrarError() {
        JOptionPane.showMessageDialog(null, "Lo sentimos, ha ocurrido un error de nuestro lado. Reinicia el programa y vuelve a intentarlo. :( \nCódigo de error: ISC_E");
    }

    //--------------------------------------------------------------------------
    //Metodo que captura el evento del JButton boton1,2,3,4
    //--------------------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent evet) {
        Object source = evet.getSource();
        //Boton1 controla la busqueda o boton de buscar
        if (source == boton1) {
            eventoBoton1();
        } else if (source == boton2) {//Movimiento a la derecha
            direccionDelBoton(1);
        } else if (source == boton3) {//Movimiento a la izquierda
            direccionDelBoton(-1);
        } else if (source == boton4) {//Recargar lista
            recargarLista();
        } else if (source == boton5) {//Boton buscar Path
            new ventanas.ventanaBusPath().setVisible(true);
        } else if (source == opcionCambiarColorLetra) {
            OpcionColorDeLetra colorLetra = new OpcionColorDeLetra(this);
            colorLetra.mostrarPaletaColores();
        }
    }

    private void direccionDelBoton(int direccion) {
        y += direccion;
        boton3.setVisible(y != 0);
        boton2.setVisible(y == 0 || y == 1);
        metodoLimpiar();
        eventoDificultadSelec();
    }

    private void recargarLista() {
        y = 0;
        _RELLENAR_ = true;
        textField1.setText("");
        boton2.setEnabled(true);
        combo1.setSelectedItem("Todas");

        RellenoDeCanciones recargarLista = new RellenoDeCanciones(this);
        rellenoCan = recargarLista.mezclarCanciones(listaCanciones);
        recargarLista.mostrarCanciones(rellenoCan);
    }

    //--------------------------------------------------------------------------
    //Metodo que captura el evento del JComboBox combo1
    //--------------------------------------------------------------------------
    @Override
    public void itemStateChanged(ItemEvent e) {
        _RELLENAR_ = false;
        BANDA_MAYOR_7 = false;
        eventoDificultadSelec();
    }

    //--------------------------------------------------------------------------
    //Eventos del teclado
    //--------------------------------------------------------------------------
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            eventoBoton1();
        }
    }

    //--------------------------------------------------------------------------
    //Metodo para vaciar los JTextField del 3 al 8
    //--------------------------------------------------------------------------
    public void metodoLimpiar() {
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField7.setText("");
        textField8.setText("");

        textFieldDifi2.setText("");
        textFieldDifi3.setText("");
        textFieldDifi4.setText("");
        textFieldDifi5.setText("");
        textFieldDifi6.setText("");
        textFieldDifi7.setText("");
    }

    public void mensajeCancionNoEncontrada() {
        JOptionPane.showMessageDialog(null, """       
                                       La Canción no fue encontrada
                            Asegurese de que este escribiendo bien el nombre""");
    }

    //--------------------------------------------------------------------------
    //Metodo main
    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setBounds(0, 0, 580, 540);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
    //--------------------------------------------------------------------------
}
