
package com.mycompany.proyecto;

import java.awt.Color;
import javax.swing.JFrame;

public class Pagina_Crear extends javax.swing.JFrame {
        Imagenes Img = new Imagenes();
        Imagenes Imgn = new Imagenes();
        Diseño_objetos diseño = new Diseño_objetos();
    public Pagina_Crear() {
        initComponents();
        diseño.BordesRedondeados(30, 100);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Evitar que el usuario modifique el tamaño
        setSize(425, 730);

        
        //IMAGENES EN BOTONES
        this.setLocationRelativeTo(this);
        Imgn.SetImageButton(casitabt, "src/main/java/imagenes/Casita.png");
        Imgn.SetImageButton(lupabt, "src/main/java/imagenes/Lupa.png");
        Imgn.SetImageButton(crearbt, "src/main/java/imagenes/Crear_Inicio.png");
        Imgn.SetImageButton(reelsbt, "src/main/java/imagenes/Reel.png");
        Imgn.SetImageButton(perfilbt, "src/main/java/imagenes/Perfil.png");
        
        
        diseño.trasparenciaButton(Btn_Crear_Pub,2);
        diseño.trasparenciaButton(Btn_cancelar,2);
            
        //CREAR UN PLACEHOLDER
        TextPrompt TextoFondo1 = new TextPrompt("Descripcion de la publicacion", Tf_desc);
        TextPrompt TextoFondo2 = new TextPrompt("Direccion de la imagen o video", Tf_path);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Btn_cancelar = new javax.swing.JButton();
        Btn_Crear_Pub = new javax.swing.JButton();
        Tf_desc = new javax.swing.JTextField();
        Tf_path = new javax.swing.JTextField();
        NoPath = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        casitabt = new javax.swing.JButton();
        lupabt = new javax.swing.JButton();
        crearbt = new javax.swing.JButton();
        reelsbt = new javax.swing.JButton();
        perfilbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(425, 700));
        setPreferredSize(new java.awt.Dimension(425, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btn_cancelar.setForeground(new java.awt.Color(0, 102, 255));
        Btn_cancelar.setText("Cancelar");
        Btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cancelarActionPerformed(evt);
            }
        });

        Btn_Crear_Pub.setBackground(new java.awt.Color(0, 102, 255));
        Btn_Crear_Pub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btn_Crear_Pub.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Crear_Pub.setText("Subir Publicación");
        Btn_Crear_Pub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Crear_PubActionPerformed(evt);
            }
        });

        Tf_desc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tf_desc.setToolTipText("");
        Tf_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_descActionPerformed(evt);
            }
        });

        Tf_path.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tf_path.setToolTipText("");
        Tf_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_pathActionPerformed(evt);
            }
        });

        NoPath.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoPath.setForeground(new java.awt.Color(255, 255, 255));
        NoPath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoPath.setText("No has subido ninguna imagen!");
        NoPath.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                NoPathComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setText("Crear publicación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NoPath, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Btn_cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(Btn_Crear_Pub))
                            .addComponent(Tf_path, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tf_desc))
                        .addGap(28, 28, 28))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(Tf_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Tf_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(NoPath)
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Crear_Pub)
                    .addComponent(Btn_cancelar))
                .addGap(105, 105, 105))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(casitabt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lupabt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(crearbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(reelsbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(perfilbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crearbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perfilbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reelsbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lupabt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casitabt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casitabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casitabtActionPerformed
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
        Pagina_User abrir = new Pagina_User();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilbtActionPerformed

    private void Tf_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_descActionPerformed

    private void Tf_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_pathActionPerformed

    private void Btn_Crear_PubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Crear_PubActionPerformed
       String direccion = Tf_path.getText();
       String descripcion = Tf_desc.getText();
       
       if(direccion != ""){
        BDconsultas temp = new BDconsultas();
        temp.crearPub(descripcion, direccion);
        Pagina_User abrir=new Pagina_User();
        abrir.setVisible(true);
        this.setVisible(false);
       } else {
        NoPath.setForeground(Color.yellow);
       }
        
        
        
        
        ///
        Pagina_Inicio abrir=new Pagina_Inicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_Crear_PubActionPerformed

    private void Btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cancelarActionPerformed
        Pagina_Inicio abrir=new Pagina_Inicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_cancelarActionPerformed

    private void NoPathComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_NoPathComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_NoPathComponentHidden

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
            java.util.logging.Logger.getLogger(Pagina_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Crear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Crear_Pub;
    private javax.swing.JButton Btn_cancelar;
    private javax.swing.JLabel NoPath;
    private javax.swing.JTextField Tf_desc;
    private javax.swing.JTextField Tf_path;
    private javax.swing.JButton casitabt;
    private javax.swing.JButton crearbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton lupabt;
    private javax.swing.JButton perfilbt;
    private javax.swing.JButton reelsbt;
    // End of variables declaration//GEN-END:variables
}
