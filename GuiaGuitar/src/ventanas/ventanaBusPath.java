package ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.Icon;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import clases.BandasDTO;
import clases.TextPrompt;
import clases.AgregarCancionesModel;
import static clases.VentanaPrincipal.validarVentana;
import static clases.VentanaPrincipal.cancionPathSelec;
import static clases.VentanaPrincipal.colorSelec;

/**
 *
 * @author Programación
 */
public class ventanaBusPath extends javax.swing.JFrame {

    public ventanaBusPath() {
        initComponents();
        setSize(460, 250);
        setTitle("Path a busca");
        setResizable(false);
        setLocationRelativeTo(null);
        TextPrompt txtFieldPrompt
                = new TextPrompt("Busca la canción aquí.....", txtField_BusCanPat);

        ImageIcon font = new ImageIcon(
                getClass().getResource("/images/fontPathBus1.png"));
        Icon fontIcon = new ImageIcon(font.getImage().getScaledInstance(
                label_Fondo.getWidth(), label_Fondo.getHeight(), Image.SCALE_DEFAULT));
        label_Fondo.setIcon(fontIcon);

        boton_BuscarPat.setForeground(new Color(
                colorSelec.getRed(), colorSelec.getGreen(), colorSelec.getBlue()));
        boton_cerrarVenPat.setForeground(new Color(
                colorSelec.getRed(), colorSelec.getGreen(), colorSelec.getBlue()));
        txtField_BusCanPat.setForeground(new Color(
                colorSelec.getRed(), colorSelec.getGreen(), colorSelec.getBlue()));
        Image icono = Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/images/logo.png"));
        setIconImage(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtField_BusCanPat = new javax.swing.JTextField();
        boton_BuscarPat = new javax.swing.JButton();
        boton_cerrarVenPat = new javax.swing.JButton();
        label_IngresaElNombre = new javax.swing.JLabel();
        label_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtField_BusCanPat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtField_BusCanPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 95, 200, 40));

        boton_BuscarPat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_BuscarPat.setForeground(new java.awt.Color(255, 51, 0));
        boton_BuscarPat.setText("Buscar");
        boton_BuscarPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscarPatActionPerformed(evt);
            }
        });
        getContentPane().add(boton_BuscarPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 30));

        boton_cerrarVenPat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_cerrarVenPat.setForeground(new java.awt.Color(255, 51, 0));
        boton_cerrarVenPat.setText("Cancelar");
        boton_cerrarVenPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cerrarVenPatActionPerformed(evt);
            }
        });
        getContentPane().add(boton_cerrarVenPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 160, 100, 30));

        label_IngresaElNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_IngresaElNombre.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(label_IngresaElNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 50));
        getContentPane().add(label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Cancelar
    private void boton_cerrarVenPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarVenPatActionPerformed

        if (!validarVentana) {
            ventanaMostrarPath v = new ventanaMostrarPath();
            v.mostrarPath(cancionPathSelec);
            v.setVisible(true);
        }
        validarVentana = true;
        this.dispose();
    }//GEN-LAST:event_boton_cerrarVenPatActionPerformed

    //Boton BuscarPath
    private void boton_BuscarPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscarPatActionPerformed
        String canBus = txtField_BusCanPat.getText().trim();
        List<BandasDTO> listaCanciones = new ArrayList<>();
        List<BandasDTO> listCancione = new ArrayList<>();
        boolean vacio = canBus.isEmpty();
        AgregarCancionesModel buscarPath = new AgregarCancionesModel();
        listaCanciones = buscarPath.mostrarListaCanciones();

        if (vacio == false) {
            listCancione.clear();
            for (BandasDTO bandas : listaCanciones) {
                if (bandas.getNombreCancion().toLowerCase().contains(
                        canBus.toLowerCase())) {
                    cancionPathSelec.clear();
                    listCancione.add(bandas);
                    cancionPathSelec.add(bandas);
                    iniciarVentanaPath(listCancione);
                    break;
                }
            }
            if (listCancione.isEmpty()) {
                JOptionPane.showMessageDialog(
                        null, """
                                         La canción no fue encontrada.
                               Asegurate de que estes escribiendo el nombre bien
                                                    """);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes escribir algo.....");
        }
    }//GEN-LAST:event_boton_BuscarPatActionPerformed

    private void iniciarVentanaPath(List<BandasDTO> listaCancio) {
        boolean contienePath = false;
        for (BandasDTO banda : listaCancio) {
            if (banda.getDificultad_medio().contains("2")
                    || banda.getDificultad_medio().contains("3")
                    || banda.getDificultad_medio().contains("4")) {
                contienePath = true;
                break;
            }
        }
        if (contienePath != true) {
            JOptionPane.showMessageDialog(null, """
                                                    La canción no tiene un path añadido aun
                                                    """);
        } else {
            ventanaMostrarPath ventanaPat = new ventanaMostrarPath();
            ventanaPat.mostrarPath(listaCancio);
            ventanaPat.setVisible(true);
            this.dispose();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaBusPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaBusPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaBusPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaBusPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaBusPath().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_BuscarPat;
    private javax.swing.JButton boton_cerrarVenPat;
    private javax.swing.JLabel label_Fondo;
    private javax.swing.JLabel label_IngresaElNombre;
    private javax.swing.JTextField txtField_BusCanPat;
    // End of variables declaration//GEN-END:variables

}
