/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfa.Ventanas;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto.Proyecto.*;
import proyecto.Grafo.*;
import proyecto.Adyacente.*;
import proyecto.Arista.*;
import proyecto.Grafo;
import proyecto.Lista.*;
import proyecto.Nodo.*;
import proyecto.Proyecto;
import proyecto.Usuario.*;

/**
 *
 * @author donat
 */
public class Ventana1 extends javax.swing.JFrame {
    public static int pasodialogo;
    public int aparicion;
    private static Grafo miGrafo;
    /**
     * Creates new form Ventana1
     */
    public Ventana1(boolean sino) {
//        this.setLocationRelativeTo(null);
        this.setResizable(false);
        pasodialogo=+1;
        aparicion=+1;
        initComponents();
        nextdialogo.setVisible(true);
        int aparicion=+ 1;
        if (aparicion<2) {
            this.AgregarDoc.setVisible(sino);
            this.agregarAmigo.setVisible(sino);
            this.VerGrafo.setVisible(sino);
            this.eliminarUsuario.setVisible(sino);
            this.agregarUsuario1.setVisible(sino);
            this.ListasPuentes.setVisible(sino);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nextdialogo = new javax.swing.JButton();
        dialogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VerGrafo = new javax.swing.JButton();
        eliminarUsuario = new javax.swing.JButton();
        agregarAmigo = new javax.swing.JButton();
        agregarUsuario1 = new javax.swing.JButton();
        AgregarDoc = new javax.swing.JButton();
        ListasPuentes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        nextdialogo.setBackground(new java.awt.Color(0, 0, 0));
        nextdialogo.setForeground(new java.awt.Color(0, 0, 0));
        nextdialogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/next.png"))); // NOI18N
        nextdialogo.setText(" ");
        nextdialogo.setAlignmentY(0.0F);
        nextdialogo.setBorder(null);
        nextdialogo.setBorderPainted(false);
        nextdialogo.setContentAreaFilled(false);
        nextdialogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextdialogo.setDisplayedMnemonicIndex(0);
        nextdialogo.setFocusable(false);
        nextdialogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextdialogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextdialogoActionPerformed(evt);
            }
        });
        getContentPane().add(nextdialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 120, 50));

        dialogo.setForeground(new java.awt.Color(0, 0, 0));
        dialogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dialogo.setText("Hola Usuario!");
        dialogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(dialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 110, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dialogo bit8.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 20, -1, 90));

        VerGrafo.setBackground(new java.awt.Color(255, 51, 204));
        VerGrafo.setForeground(new java.awt.Color(255, 51, 204));
        VerGrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abrir grafopeq.png"))); // NOI18N
        VerGrafo.setFocusable(false);
        VerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerGrafoActionPerformed(evt);
            }
        });
        getContentPane().add(VerGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 110));

        eliminarUsuario.setBackground(new java.awt.Color(255, 102, 102));
        eliminarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        eliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura1.png"))); // NOI18N
        eliminarUsuario.setToolTipText("");
        eliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarUsuario.setFocusable(false);
        eliminarUsuario.setHideActionText(true);
        eliminarUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                eliminarUsuarioMouseMoved(evt);
            }
        });
        eliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarUsuarioMouseExited(evt);
            }
        });
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 190, 110));

        agregarAmigo.setBackground(new java.awt.Color(0, 255, 204));
        agregarAmigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amigos.png"))); // NOI18N
        agregarAmigo.setFocusable(false);
        agregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAmigoActionPerformed(evt);
            }
        });
        getContentPane().add(agregarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 190, 110));

        agregarUsuario1.setBackground(new java.awt.Color(255, 255, 0));
        agregarUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuariobien.png"))); // NOI18N
        agregarUsuario1.setFocusable(false);
        agregarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(agregarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 190, 110));

        AgregarDoc.setBackground(new java.awt.Color(153, 153, 255));
        AgregarDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carpeta8bit.png"))); // NOI18N
        AgregarDoc.setToolTipText("");
        AgregarDoc.setFocusable(false);
        AgregarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDocActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 110));

        ListasPuentes.setBackground(new java.awt.Color(0, 153, 204));
        ListasPuentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista8bit.png"))); // NOI18N
        ListasPuentes.setFocusable(false);
        ListasPuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListasPuentesActionPerformed(evt);
            }
        });
        getContentPane().add(ListasPuentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona8bit.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextdialogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextdialogoActionPerformed
        pasodialogo += 1;
        if (pasodialogo==2) {
           String parte2 = "Como estas?"; 
           dialogo.setText(parte2);
        } else if (pasodialogo==3) {
            String parte2 = "Escoja el documento";
            dialogo.setText(parte2);
            AgregarDoc.setVisible(true);
        }else{   
            String parte2 = "Sientete libre";
            dialogo.setText(parte2);
            agregarAmigo.setVisible(true);
            VerGrafo.setVisible(true);
            eliminarUsuario.setVisible(true);
            agregarUsuario1.setVisible(true);
            ListasPuentes.setVisible(true); 
            nextdialogo.setVisible(false);
        }
        
        
    }//GEN-LAST:event_nextdialogoActionPerformed

    private void VerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerGrafoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerGrafoActionPerformed

    private void ListasPuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListasPuentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListasPuentesActionPerformed

    private void agregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAmigoActionPerformed
        dispose();
            Ventana3 v3 = new Ventana3();
            v3.setVisible(true);
    }//GEN-LAST:event_agregarAmigoActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        dispose();
        Ventana2_2 v2_2 = new Ventana2_2();
        v2_2.Ventanatext("Eliminar Usuario",1);
        v2_2.setVisible(true);
        
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void agregarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsuario1ActionPerformed
            dispose();
            Ventana2 v2 = new Ventana2();
            v2.setVisible(true);
    }//GEN-LAST:event_agregarUsuario1ActionPerformed

    private void AgregarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDocActionPerformed
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(file);
   
        File abre=file.getSelectedFile();
        try{
          miGrafo = Proyecto.extraerGrafo(abre); 
          JOptionPane.showMessageDialog(null, miGrafo);
          pasodialogo += 1;
            System.out.println("si?");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, vuelve a insertar un archivo compatible");
        }
        
        
    }//GEN-LAST:event_AgregarDocActionPerformed

    private void eliminarUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarUsuarioMouseMoved
        eliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura2.png")));
    }//GEN-LAST:event_eliminarUsuarioMouseMoved

    private void eliminarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarUsuarioMouseExited
        eliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura1.png")));
    }//GEN-LAST:event_eliminarUsuarioMouseExited

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1(true).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarDoc;
    private javax.swing.JButton ListasPuentes;
    private javax.swing.JButton VerGrafo;
    private javax.swing.JButton agregarAmigo;
    private javax.swing.JButton agregarUsuario1;
    private javax.swing.JLabel dialogo;
    private javax.swing.JButton eliminarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextdialogo;
    // End of variables declaration//GEN-END:variables
}
