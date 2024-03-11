
package com.mycompany.proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Pagina_Inicio extends javax.swing.JFrame {
        Imagenes Img = new Imagenes();
        Imagenes Imgn = new Imagenes();
        
    public Pagina_Inicio() {
       
        initComponents();
        
        //IMAGENES EN JLABELS
        this.setLocationRelativeTo(this);
        Img.SetImageLabel(fondolbl, "src/main/java/imagenes/Fondo_Login.png");
        Img.SetImageLabel(logolbl, "src/main/java/imagenes/Logo.png");
        
        //IMAGENES EN BOTONES
        this.setLocationRelativeTo(this);
        Imgn.SetImageButton(casitabt, "src/main/java/imagenes/Casita_Inicio.png");
        Imgn.SetImageButton(lupabt, "src/main/java/imagenes/Lupa.png");
        Imgn.SetImageButton(crearbt, "src/main/java/imagenes/Crear.png");
        Imgn.SetImageButton(reelsbt, "src/main/java/imagenes/Reel.png");
        Imgn.SetImageButton(perfilbt, "src/main/java/imagenes/Perfil.png");
        Imgn.SetImageButton(notificacionesbt, "src/main/java/imagenes/Notificaciones.png");
        Imgn.SetImageButton(mensajesbt, "src/main/java/imagenes/Mensajes.png");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logolbl = new javax.swing.JLabel();
        casitabt = new javax.swing.JButton();
        lupabt = new javax.swing.JButton();
        crearbt = new javax.swing.JButton();
        reelsbt = new javax.swing.JButton();
        perfilbt = new javax.swing.JButton();
        notificacionesbt = new javax.swing.JButton();
        mensajesbt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        fondolbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(logolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        casitabt.setBorder(null);
        casitabt.setBorderPainted(false);
        casitabt.setContentAreaFilled(false);
        casitabt.setDefaultCapable(false);
        casitabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casitabtActionPerformed(evt);
            }
        });
        jPanel1.add(casitabt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 40, 30));

        lupabt.setBorder(null);
        lupabt.setBorderPainted(false);
        lupabt.setContentAreaFilled(false);
        lupabt.setDefaultCapable(false);
        lupabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupabtActionPerformed(evt);
            }
        });
        jPanel1.add(lupabt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 40, 30));

        crearbt.setBorder(null);
        crearbt.setBorderPainted(false);
        crearbt.setContentAreaFilled(false);
        crearbt.setDefaultCapable(false);
        crearbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearbtActionPerformed(evt);
            }
        });
        jPanel1.add(crearbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 40, 30));

        reelsbt.setBorder(null);
        reelsbt.setBorderPainted(false);
        reelsbt.setContentAreaFilled(false);
        reelsbt.setDefaultCapable(false);
        reelsbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reelsbtActionPerformed(evt);
            }
        });
        jPanel1.add(reelsbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, 40, 30));

        perfilbt.setBorder(null);
        perfilbt.setBorderPainted(false);
        perfilbt.setContentAreaFilled(false);
        perfilbt.setDefaultCapable(false);
        perfilbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilbtActionPerformed(evt);
            }
        });
        jPanel1.add(perfilbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 40, 30));

        notificacionesbt.setBorder(null);
        notificacionesbt.setBorderPainted(false);
        notificacionesbt.setContentAreaFilled(false);
        notificacionesbt.setDefaultCapable(false);
        notificacionesbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificacionesbtActionPerformed(evt);
            }
        });
        jPanel1.add(notificacionesbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 30));

        mensajesbt.setBorder(null);
        mensajesbt.setContentAreaFilled(false);
        mensajesbt.setDefaultCapable(false);
        jPanel1.add(mensajesbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 410, 50));
        jPanel1.add(fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casitabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casitabtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casitabtActionPerformed

    private void perfilbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilbtActionPerformed
        // TODO add your handling code here:
        User abrir = new User();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilbtActionPerformed

    private void notificacionesbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificacionesbtActionPerformed
        // TODO add your handling code here:
        Notificaciones abrir = new Notificaciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_notificacionesbtActionPerformed

    private void lupabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupabtActionPerformed
        // TODO add your handling code here:
        Buscar abrir = new Buscar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lupabtActionPerformed

    private void crearbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearbtActionPerformed
        // TODO add your handling code here:
        Pagina_Crear abrir = new Pagina_Crear();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearbtActionPerformed

    private void reelsbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reelsbtActionPerformed
        // TODO add your handling code here:
        Pagina_Reels abrir = new Pagina_Reels();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reelsbtActionPerformed

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
            java.util.logging.Logger.getLogger(Pagina_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Inicio().setVisible(true);
            }
        });
    }
  

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton casitabt;
    private javax.swing.JButton crearbt;
    private javax.swing.JLabel fondolbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logolbl;
    private javax.swing.JButton lupabt;
    private javax.swing.JButton mensajesbt;
    private javax.swing.JButton notificacionesbt;
    private javax.swing.JButton perfilbt;
    private javax.swing.JButton reelsbt;
    // End of variables declaration//GEN-END:variables
}
