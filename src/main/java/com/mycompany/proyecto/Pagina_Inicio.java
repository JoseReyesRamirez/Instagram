
package com.mycompany.proyecto;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Pagina_Inicio extends javax.swing.JFrame {
        Imagenes Img = new Imagenes();
        Imagenes Imgn = new Imagenes();
        private int indice = 0;
        String user2;
        ImageIcon[] imgs;
        String[] pub_users;
        String[] descripciones;
        String[] likes;
    public Pagina_Inicio(String user) {  
        user2=user;
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Evitar que el usuario modifique el tamaño
        setSize(425, 730);
        //IMAGENES EN JLABELS
        this.setLocationRelativeTo(this);
        Img.SetImageLabel(fondolbl, "src/main/java/imagenes/Fondo_Login.png");
        Img.SetImageLabel(logolbl, "src/main/java/imagenes/Logo.png");
        
        //IMAGENES EN BOTONES
        this.setLocationRelativeTo(this);
        Imgn.SetImageButton(likebt, "src/main/java/imagenes/Like_Reels.png");
        Imgn.SetImageButton(commentbt, "src/main/java/imagenes/Comment.png");
        Imgn.SetImageButton(casitabt, "src/main/java/imagenes/Casita_Inicio.png");
        Imgn.SetImageButton(lupabt, "src/main/java/imagenes/Lupa.png");
        Imgn.SetImageButton(crearbt, "src/main/java/imagenes/Crear.png");
        Imgn.SetImageButton(reelsbt, "src/main/java/imagenes/Reel.png");
        Imgn.SetImageButton(perfilbt, "src/main/java/imagenes/Perfil.png");
        Imgn.SetImageButton(notificacionesbt, "src/main/java/imagenes/Notificaciones.png");
        Imgn.SetImageButton(mensajesbt, "src/main/java/imagenes/Mensajes.png");
        
        String[] urls = {
            "src/main/java/Media/1.jpg",
            "src/main/java/Media/2.jpg",
            "src/main/java/Media/3.jpg",
            "src/main/java/Media/4.jpg",
            "src/main/java/Media/5.jpg",
            // Agrega más imágenes aquí
        };
        descripciones = new String[] 
            {"Explorando el silencioso y vasto paisaje lunar 🌕🚀 #Astronauta ",
            "Disfrutando del sol y la naturaleza con mi compañero peludo 🐾☀️ #PerroFeliz #AmorCanino",
            "La dulzura hecha peluche 😻✨ #Gatito #AmorFelino",
            "La ventana del alma capturada en lienzo 👁️🎨 #Arte #Ojo ",
            "Reunión épica con los mejores amigos 👫👬👭 #Amistad #Friends"};
         //cargarNombresDeUsuario;
        pub_users = new String[] {"Usuario1", "user123", "instaFanatico", "user_insta", "photo_lover"};
        
        likes = new String[] {
            "a 20,105 personas les gusta esto", 
            "a 156,546 personas les gusta esto", 
            "a 12,489 personas les gusta esto", 
            "a 1,151 personas les gusta esto", 
            "a 97,456 personas les gusta esto"};
      
 
        imgs = new ImageIcon[urls.length];
        for (int i = 0; i < urls.length; i++) {
            ImageIcon imageIcon = new ImageIcon(urls[i]);
            Image image = imageIcon.getImage(); // transformalo
            Image newimg = image.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT); // escala esto
            imgs[i] = new ImageIcon(newimg);  // transformalo de nuevo
        }
        
        img.setIcon(imgs[0]); // Establece la imagen inicial del botón
        pub_user.setText(pub_users[0]); // Establece el nombre de usuario inicial
         jLabel1.setText(descripciones[0]); // Establece la descripcion inicial
        likeslb.setText(likes[0]); // Establece la descripcion inicial
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        likeslb = new javax.swing.JLabel();
        img = new javax.swing.JButton();
        likebt = new javax.swing.JButton();
        commentbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logolbl = new javax.swing.JLabel();
        pub_user = new javax.swing.JLabel();
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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        likeslb.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        likeslb.setText("likes");
        jPanel7.add(likeslb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 280, -1));

        img.setAlignmentY(0.0F);
        img.setBorder(null);
        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });
        jPanel7.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 9, 370, 460));

        likebt.setToolTipText("");
        likebt.setBorder(null);
        jPanel7.add(likebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 35, 35));

        commentbt.setBorder(null);
        commentbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pub_com1ActionPerformed(evt);
            }
        });
        jPanel7.add(commentbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 35, 35));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("desc");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 370, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ver comentarios...");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 121, 23));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 390, 560));
        jPanel1.add(logolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        pub_user.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        pub_user.setForeground(new java.awt.Color(102, 102, 102));
        pub_user.setText("Usuario");
        jPanel1.add(pub_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

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
        mensajesbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajesbtActionPerformed(evt);
            }
        });
        jPanel1.add(mensajesbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 410, 50));

        fondolbl.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casitabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casitabtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casitabtActionPerformed

    private void perfilbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilbtActionPerformed
        // TODO add your handling code here:
        Pagina_User abrir = new Pagina_User(user2);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilbtActionPerformed

    private void notificacionesbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificacionesbtActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_notificacionesbtActionPerformed

    private void lupabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupabtActionPerformed
        // TODO add your handling code here:
        Buscar abrir = new Buscar(user2);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lupabtActionPerformed

    private void crearbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearbtActionPerformed
        // TODO add your handling code here:
        Pagina_Crear abrir = new Pagina_Crear(user2);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_crearbtActionPerformed

    private void reelsbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reelsbtActionPerformed
        // TODO add your handling code here:
        Pagina_Reels abrir = new Pagina_Reels(user2);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reelsbtActionPerformed

    private void mensajesbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajesbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajesbtActionPerformed

    private void pub_com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pub_com1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pub_com1ActionPerformed

    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
        // TODO add your handling code here:
        indice = (indice + 1) % imgs.length;
        img.setIcon(imgs[indice]);
        pub_user.setText(pub_users[indice]); // Cambia el nombre de usuario
        jLabel1.setText(descripciones[indice]);
        likeslb.setText(likes[indice]);
    }//GEN-LAST:event_imgActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String user) {
        System.out.print(user);
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
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Inicio(user).setVisible(true);
            }
        });
    }
  

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton casitabt;
    private javax.swing.JButton commentbt;
    private javax.swing.JButton crearbt;
    private javax.swing.JLabel fondolbl;
    private javax.swing.JButton img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton likebt;
    private javax.swing.JLabel likeslb;
    private javax.swing.JLabel logolbl;
    private javax.swing.JButton lupabt;
    private javax.swing.JButton mensajesbt;
    private javax.swing.JButton notificacionesbt;
    private javax.swing.JButton perfilbt;
    private javax.swing.JLabel pub_user;
    private javax.swing.JButton reelsbt;
    // End of variables declaration//GEN-END:variables
}
