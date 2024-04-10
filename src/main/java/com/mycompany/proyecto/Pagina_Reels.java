
package com.mycompany.proyecto;


public class Pagina_Reels extends javax.swing.JFrame {
        Imagenes Img = new Imagenes();
        Imagenes Imgn = new Imagenes();
    public Pagina_Reels() {
        initComponents();
        
        
        //IMAGENES EN JLABELS
        this.setLocationRelativeTo(this);
       // Img.SetImageLabel(L_Fondo, "src/main/java/imagenes/Fondo_Login.png");
        
        //IMAGENES EN BOTONES
        this.setLocationRelativeTo(this);
        Imgn.SetImageButton(casitabt, "src/main/java/imagenes/Casita_Inicio.png");
        Imgn.SetImageButton(lupabt, "src/main/java/imagenes/Lupa.png");
        Imgn.SetImageButton(crearbt, "src/main/java/imagenes/Crear.png");
        Imgn.SetImageButton(reelsbt, "src/main/java/imagenes/Reel.png");
        Imgn.SetImageButton(perfilbt, "src/main/java/imagenes/Perfil.png");
        
        
        Imgn.SetImageButton(Like, "src/main/java/imagenes/Like_Reels.png");
        Imgn.SetImageButton(Comentarios, "src/main/java/imagenes/Comentario_Reels.png");
        Imgn.SetImageButton(Compartir, "src/main/java/imagenes/Enviar_Reels.png");
        Imgn.SetImageButton(Opciones, "src/main/java/imagenes/3puntos_Reels.png");
        Imgn.SetImageButton(Camara, "src/main/java/imagenes/Camara_Reels.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        casitabt = new javax.swing.JButton();
        lupabt = new javax.swing.JButton();
        crearbt = new javax.swing.JButton();
        reelsbt = new javax.swing.JButton();
        perfilbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Opciones = new javax.swing.JButton();
        Camara = new javax.swing.JButton();
        Comentarios = new javax.swing.JButton();
        Compartir = new javax.swing.JButton();
        Descripcion = new javax.swing.JLabel();
        Nom_usuario = new javax.swing.JLabel();
        Foto_Perfil = new javax.swing.JLabel();
        Like = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        L_video = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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
                    .addComponent(casitabt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(crearbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lupabt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 410, 50));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Opciones.setForeground(new java.awt.Color(242, 242, 242));
        Opciones.setBorder(null);
        Opciones.setContentAreaFilled(false);
        Opciones.setDefaultCapable(false);
        Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesActionPerformed(evt);
            }
        });
        jPanel2.add(Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 60, 60));

        Camara.setForeground(new java.awt.Color(242, 242, 242));
        Camara.setBorder(null);
        Camara.setContentAreaFilled(false);
        Camara.setDefaultCapable(false);
        Camara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamaraActionPerformed(evt);
            }
        });
        jPanel2.add(Camara, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 40, 40));

        Comentarios.setForeground(new java.awt.Color(242, 242, 242));
        Comentarios.setBorder(null);
        Comentarios.setContentAreaFilled(false);
        Comentarios.setDefaultCapable(false);
        Comentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentariosActionPerformed(evt);
            }
        });
        jPanel2.add(Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 60, 50));

        Compartir.setForeground(new java.awt.Color(242, 242, 242));
        Compartir.setBorder(null);
        Compartir.setContentAreaFilled(false);
        Compartir.setDefaultCapable(false);
        Compartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompartirActionPerformed(evt);
            }
        });
        jPanel2.add(Compartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 40, 40));

        Descripcion.setText("Descripcion del video #####################");
        jPanel2.add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 280, -1));

        Nom_usuario.setText("Usuario");
        jPanel2.add(Nom_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 90, -1));

        Foto_Perfil.setText("Foto");
        jPanel2.add(Foto_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 30, 30));

        Like.setForeground(new java.awt.Color(242, 242, 242));
        Like.setBorder(null);
        Like.setContentAreaFilled(false);
        Like.setDefaultCapable(false);
        Like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LikeActionPerformed(evt);
            }
        });
        jPanel2.add(Like, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 40, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Reels");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));
        jPanel2.add(L_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 650));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionesActionPerformed

    private void CamaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CamaraActionPerformed

    private void ComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComentariosActionPerformed

    private void CompartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompartirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompartirActionPerformed

    private void LikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LikeActionPerformed

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
            java.util.logging.Logger.getLogger(Pagina_Reels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_Reels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_Reels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_Reels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Reels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Camara;
    private javax.swing.JButton Comentarios;
    private javax.swing.JButton Compartir;
    private javax.swing.JLabel Descripcion;
    private javax.swing.JLabel Foto_Perfil;
    private javax.swing.JLabel L_video;
    private javax.swing.JButton Like;
    private javax.swing.JLabel Nom_usuario;
    private javax.swing.JButton Opciones;
    private javax.swing.JButton casitabt;
    private javax.swing.JButton crearbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lupabt;
    private javax.swing.JButton perfilbt;
    private javax.swing.JButton reelsbt;
    // End of variables declaration//GEN-END:variables
}
