package ventanas;

import clases.AgregarCancionesModel;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import clases.BandasDTO;
import static clases.VentanaPrincipal.cancionPathSelec;
import static clases.VentanaPrincipal.validarVentana;
import static clases.VentanaPrincipal.colorSelec;
import static clases.VentanaPrincipal.nameCanActual;
import java.util.ArrayList;

public class ventanaMostrarPath extends javax.swing.JFrame {

    public ventanaMostrarPath() {

        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(390, 390);
        setTitle("Path");
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Imagen de fondo VentanaPath
        ImageIcon fon = new ImageIcon(
                getClass().getResource("/images/fontPathBus2.png"));
        Icon font = new ImageIcon(fon.getImage().getScaledInstance(
                label_fondo.getWidth(), label_fondo.getHeight(), Image.SCALE_DEFAULT));
        label_fondo.setIcon(font);

        ImageIcon flechaRegresar = new ImageIcon(
                getClass().getResource("/images/flechaRegresarPath.png"));
        Icon flechaRegre = new ImageIcon(flechaRegresar.getImage().getScaledInstance(
                boton_regresarPath.getWidth(), boton_regresarPath.getHeight(), Image.SCALE_DEFAULT));
        boton_regresarPath.setIcon(flechaRegre);

        boton_regresarPath.setBackground(new java.awt.Color(0, 0, 0, 1));
        boton_regresarPath.setOpaque(false);

        boton_busPath.setBackground(new java.awt.Color(0, 0, 0, 1));
        boton_busPath.setOpaque(false);
        boton_busPath.setFocusPainted(false);
        boton_regresarPath.setFocusPainted(false);

        nombreCanPathSelec.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));

        label_patCanSelet2.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        //Labels Dificultad
        label_DifiEasy.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_DifiMedium.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_DifiHard.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        Label_DifiExpert.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        //Labels Combo
        label_comboEazy.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_comboMedio.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_comboDificil.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_comboExpert.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        //Labels Path
        label_patEasyMos.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_patMedioMos.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_patHardMos.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        label_patExpertMos.setForeground(new Color(colorSelec.getRed(),
                colorSelec.getGreen(), colorSelec.getBlue()));
        Image icono = Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/images/logo.png"));
        setIconImage(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreCanPathSelec = new javax.swing.JLabel();
        label_patCanSelet2 = new javax.swing.JLabel();
        label_patEasyMos = new javax.swing.JLabel();
        label_patMedioMos = new javax.swing.JLabel();
        label_patHardMos = new javax.swing.JLabel();
        label_patExpertMos = new javax.swing.JLabel();
        boton_regresarPath = new javax.swing.JButton();
        label_DifiEasy = new javax.swing.JLabel();
        label_DifiMedium = new javax.swing.JLabel();
        label_DifiHard = new javax.swing.JLabel();
        Label_DifiExpert = new javax.swing.JLabel();
        boton_busPath = new javax.swing.JButton();
        label_comboEazy = new javax.swing.JLabel();
        label_comboMedio = new javax.swing.JLabel();
        label_comboDificil = new javax.swing.JLabel();
        label_comboExpert = new javax.swing.JLabel();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreCanPathSelec.setForeground(new java.awt.Color(255, 0, 0));
        nombreCanPathSelec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nombreCanPathSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, 20));

        label_patCanSelet2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_patCanSelet2.setForeground(new java.awt.Color(255, 0, 0));
        label_patCanSelet2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label_patCanSelet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, 20));

        label_patEasyMos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_patEasyMos.setForeground(new java.awt.Color(0, 153, 255));
        label_patEasyMos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_patEasyMos.setText("asdljaksdjklasjdklasldkd");
        getContentPane().add(label_patEasyMos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 113, 130, 20));

        label_patMedioMos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_patMedioMos.setForeground(new java.awt.Color(0, 153, 255));
        label_patMedioMos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_patMedioMos.setText("dkjskdjskdjksdjksjdkskd");
        getContentPane().add(label_patMedioMos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 175, 130, 20));

        label_patHardMos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_patHardMos.setForeground(new java.awt.Color(0, 153, 255));
        label_patHardMos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_patHardMos.setText("jskdjskdjskdjskdjskdjskdj");
        getContentPane().add(label_patHardMos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 130, 20));

        label_patExpertMos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_patExpertMos.setForeground(new java.awt.Color(0, 153, 255));
        label_patExpertMos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_patExpertMos.setText("skdjksjdksjdksjdksdjksdj");
        getContentPane().add(label_patExpertMos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 301, 130, 20));

        boton_regresarPath.setBorder(null);
        boton_regresarPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_regresarPathActionPerformed(evt);
            }
        });
        getContentPane().add(boton_regresarPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 5, 24, 24));

        label_DifiEasy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_DifiEasy.setForeground(new java.awt.Color(255, 0, 0));
        label_DifiEasy.setText("FACIL");
        getContentPane().add(label_DifiEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 97, -1, -1));

        label_DifiMedium.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_DifiMedium.setForeground(new java.awt.Color(255, 0, 0));
        label_DifiMedium.setText("MEDIO");
        getContentPane().add(label_DifiMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 159, -1, -1));

        label_DifiHard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_DifiHard.setForeground(new java.awt.Color(255, 0, 0));
        label_DifiHard.setText("DIFICIL");
        getContentPane().add(label_DifiHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 224, -1, -1));

        Label_DifiExpert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label_DifiExpert.setForeground(new java.awt.Color(255, 0, 0));
        Label_DifiExpert.setText("EXPERTO");
        getContentPane().add(Label_DifiExpert, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 287, -1, -1));

        boton_busPath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        boton_busPath.setBorder(null);
        boton_busPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_busPathActionPerformed(evt);
            }
        });
        getContentPane().add(boton_busPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 25, 25));

        label_comboEazy.setForeground(new java.awt.Color(255, 0, 0));
        label_comboEazy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_comboEazy.setText("skdjhasjkdhjkasdasjdhjkasasd");
        label_comboEazy.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(label_comboEazy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 126, 340, 20));

        label_comboMedio.setForeground(new java.awt.Color(255, 0, 0));
        label_comboMedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_comboMedio.setText("dkshdkshdkhsdhsdhsdhshds");
        getContentPane().add(label_comboMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, 20));

        label_comboDificil.setForeground(new java.awt.Color(255, 0, 0));
        label_comboDificil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_comboDificil.setText("dkjskdjskdjskdjskdjskdjskdjksdj");
        getContentPane().add(label_comboDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, 340, 20));

        label_comboExpert.setForeground(new java.awt.Color(255, 0, 0));
        label_comboExpert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_comboExpert.setText("skjdksjdksjdksjdksjdksjdksjdksjd");
        getContentPane().add(label_comboExpert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 316, 340, 20));
        getContentPane().add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para regresarVentanaPath
    private void boton_regresarPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_regresarPathActionPerformed
        this.dispose();
    }//GEN-LAST:event_boton_regresarPathActionPerformed

    //Boton para buscar un path dentro de la ventanaPath
    private void boton_busPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_busPathActionPerformed
        this.setVisible(false);
        new ventanaBusPath().setVisible(true);
        validarVentana = false;
    }//GEN-LAST:event_boton_busPathActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaMostrarPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMostrarPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMostrarPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMostrarPath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaMostrarPath().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_DifiExpert;
    private javax.swing.JButton boton_busPath;
    private javax.swing.JButton boton_regresarPath;
    private javax.swing.JLabel label_DifiEasy;
    private javax.swing.JLabel label_DifiHard;
    private javax.swing.JLabel label_DifiMedium;
    private javax.swing.JLabel label_comboDificil;
    private javax.swing.JLabel label_comboEazy;
    private javax.swing.JLabel label_comboExpert;
    private javax.swing.JLabel label_comboMedio;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel label_patCanSelet2;
    private javax.swing.JLabel label_patEasyMos;
    private javax.swing.JLabel label_patExpertMos;
    private javax.swing.JLabel label_patHardMos;
    private javax.swing.JLabel label_patMedioMos;
    private javax.swing.JLabel nombreCanPathSelec;
    // End of variables declaration//GEN-END:variables

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);
        g.drawLine(50, 175, 340, 175);

        g.drawLine(50, 240, 340, 240);

        g.drawLine(50, 305, 340, 305);

        g.drawLine(50, 365, 340, 365);
    }

    public void mostrarPath(List<BandasDTO> listCancione) {
        for (BandasDTO bandas : listCancione) {
            nombreCanPathSelec.setText(bandas.getNombreCancion());
            label_patCanSelet2.setText(bandas.getNombreBanda());//Pantalla: Nombre de la Banda
            label_patEasyMos.setText(bandas.getDificultad_facil());
            label_patMedioMos.setText(bandas.getDificultad_medio());
            label_patHardMos.setText(bandas.getDificultad_dificil());
            label_patExpertMos.setText(bandas.getDificultad_experto());
            label_comboEazy.setText(bandas.getCombo_facil());//Pantalla: Nombre de la cancion
            label_comboMedio.setText(bandas.getCombo_medio());//Dificultad en medio
            label_comboDificil.setText(bandas.getCombo_dificil());//Dificultad en dificil
            label_comboExpert.setText(bandas.getCombo_experto());//Dificultad en experto

        }
    }

    public List<BandasDTO> buscarCancion(List<BandasDTO> lista) {
        List<BandasDTO> listCancione = new ArrayList<>();

        for (BandasDTO bandas : lista) {
            if (bandas.getNombreCancion().toLowerCase().contains(
                    nameCanActual.toLowerCase())) {
                cancionPathSelec.clear();
                listCancione.add(bandas);
                cancionPathSelec.add(bandas);
                break;
            }
        }
        if (listCancione.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, """
                                         Lo sentimos.
                          A ocurrido un error de nuestro lado intenta
                                   reiniciar el programa.
                                                    """);
        }
        return listCancione;
    }
}
