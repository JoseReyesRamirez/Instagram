
package com.mycompany.proyecto;

import javax.swing.JFrame;


public class Buscar extends javax.swing.JFrame {
        Imagenes Img = new Imagenes();
        Imagenes Imgn = new Imagenes();
        
        Diseño_objetos diseño = new Diseño_objetos();

    public Buscar() {
        diseño.BordesRedondeados(30, 100);  

        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Evitar que el usuario modifique el tamaño
        setSize(425, 730);
        //IMAGENES EN JLABELS
        this.setLocationRelativeTo(this);
        
            var TextoFondo1 = new TextPrompt("Buscar", jTextField1);

        
        //IMAGENES EN BOTONES
        this.setLocationRelativeTo(this);
                //IMAGENES EN BOTONES
        this.setLocationRelativeTo(this);
        Imgn.SetImageButton(lupabt1, "src/main/java/imagenes/Lupa.png");
        Imgn.SetImageButton(casitabt, "src/main/java/imagenes/Casita_Inicio.png");
        Imgn.SetImageButton(lupabt, "src/main/java/imagenes/Lupa.png");
        Imgn.SetImageButton(crearbt, "src/main/java/imagenes/Crear.png");
        Imgn.SetImageButton(reelsbt, "src/main/java/imagenes/Reel.png");
        Imgn.SetImageButton(perfilbt, "src/main/java/imagenes/Perfil.png");
        Imgn.SetImageButton(insta1, "src/main/java/imagenes/insta1.png");
        Imgn.SetImageButton(insta2, "src/main/java/imagenes/insta2.png");
        Imgn.SetImageButton(insta3, "src/main/java/imagenes/insta3.png");

        
        //BOTONES TRASPARENTES (1 = quitar fondo, 2 = quitar bordes y 3 = quitar ambos)
        TextPrompt TextoFondo = new TextPrompt("Buscar", jTextField1);
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
        jPanel2 = new javax.swing.JPanel();
        lupabt1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        insta1 = new javax.swing.JButton();
        insta2 = new javax.swing.JButton();
        insta3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        casitabt = new javax.swing.JButton();
        lupabt = new javax.swing.JButton();
        crearbt = new javax.swing.JButton();
        reelsbt = new javax.swing.JButton();
        perfilbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lupabt1.setBorder(null);
        lupabt1.setBorderPainted(false);
        lupabt1.setContentAreaFilled(false);
        lupabt1.setDefaultCapable(false);
        lupabt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupabt1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lupabt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(lupabt1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        insta1.setActionCommand("");
        insta1.setBorder(null);
        insta1.setBorderPainted(false);
        insta1.setContentAreaFilled(false);

        insta2.setBorder(null);
        insta2.setBorderPainted(false);
        insta2.setContentAreaFilled(false);

        insta3.setBorder(null);
        insta3.setBorderPainted(false);
        insta3.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insta3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(insta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insta1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(insta1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insta2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(insta3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        casitabt.setBorder(null);
        casitabt.setBorderPainted(false);
        casitabt.setContentAreaFilled(false);
        casitabt.setDefaultCapable(false);
        casitabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casitabtActionPerformed(evt);
            }
        });

        lupabt.setBorder(null);
        lupabt.setBorderPainted(false);
        lupabt.setContentAreaFilled(false);
        lupabt.setDefaultCapable(false);
        lupabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupabtActionPerformed(evt);
            }
        });

        crearbt.setBorder(null);
        crearbt.setBorderPainted(false);
        crearbt.setContentAreaFilled(false);
        crearbt.setDefaultCapable(false);
        crearbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearbtActionPerformed(evt);
            }
        });

        reelsbt.setBorder(null);
        reelsbt.setBorderPainted(false);
        reelsbt.setContentAreaFilled(false);
        reelsbt.setDefaultCapable(false);
        reelsbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reelsbtActionPerformed(evt);
            }
        });

        perfilbt.setBorder(null);
        perfilbt.setBorderPainted(false);
        perfilbt.setContentAreaFilled(false);
        perfilbt.setDefaultCapable(false);
        perfilbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(casitabt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lupabt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(crearbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(reelsbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(perfilbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(perfilbt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(reelsbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(casitabt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lupabt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casitabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casitabtActionPerformed
        // TODO add your handling code here:
        Pagina_Inicio abrir = new Pagina_Inicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_casitabtActionPerformed

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

    private void perfilbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilbtActionPerformed
        // TODO add your handling code here:
        User abrir = new User();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilbtActionPerformed

    private void lupabt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupabt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lupabt1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void insta1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }

    private void insta2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }
    
    private void insta3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton casitabt;
    private javax.swing.JButton crearbt;
    private javax.swing.JButton insta1;
    private javax.swing.JButton insta2;
    private javax.swing.JButton insta3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lupabt;
    private javax.swing.JButton lupabt1;
    private javax.swing.JButton perfilbt;
    private javax.swing.JButton reelsbt;
    // End of variables declaration//GEN-END:variables
}
