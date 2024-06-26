
package com.mycompany.proyecto;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Pagina_Reels extends javax.swing.JFrame {
    int gif=1;
    int contador;
    private static Connection conn = null;
    String user2;
        Imagenes Img = new Imagenes();
        Imagenes Imgn = new Imagenes();
        BDconsultas consultas = new BDconsultas();
        
        //CAMBIAR Y MOSTRAR GIFTS
        ImageIcon[] gifs;
        private int indice = 0;
        
        //user
        String[] usernames;
        
        
        //Descripciones
        String[] descripciones;
        
         private int Likeguardado,IDPublicacion;
    public Pagina_Reels(String user) {
        user2=user;
        initComponents();
        actualizarLabel();
        leerLikesDesdeBD();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Evitar que el usuario modifique el tamaño
        setSize(425, 730);
        
        //IMAGENES EN JLABELS
        this.setLocationRelativeTo(this);
       // Img.SetImageLabel(L_Fondo, "src/main/java/imagenes/Fondo_Login.png");
        
       
        //IMAGENES EN BOTONES DE DESPLAZAMIENTO
        this.setLocationRelativeTo(this);
        Imgn.SetImageButton(casitabt, "src/main/java/imagenes/Casita.png");
        Imgn.SetImageButton(lupabt, "src/main/java/imagenes/Lupa.png");
        Imgn.SetImageButton(crearbt, "src/main/java/imagenes/Crear.png");
        Imgn.SetImageButton(reelsbt, "src/main/java/imagenes/Reels_Inicio.png");
        Imgn.SetImageButton(perfilbt, "src/main/java/imagenes/Perfil.png");
        
        //IMAGENES DE BOTONES ACCIONES
        Imgn.SetImageButton(Like, "src/main/java/imagenes/Corazon_Reels.png");
        Imgn.SetImageButton(Comentarios, "src/main/java/imagenes/Comentarios_Reels.png");
        Imgn.SetImageButton(Compartir, "src/main/java/imagenes/Enviar_Reels.png");
        Imgn.SetImageButton(Opciones, "src/main/java/imagenes/3puntos_Reels.png");
        Imgn.SetImageButton(Camara, "src/main/java/imagenes/Agregar_Reels.png");
        
        Img.SetImageLabel(Foto_Perfil, "src/main/java/imagenes/Perfil_reels.png");
        
        //CARGAR, ESCALAR Y CAMBIAR GIFTS
        // Carga y redimensiona los gifs
        String[] urls = {
            "src/main/java/videos/Video_Reels_1.gif",
            "src/main/java/videos/Video_Reels_2.gif",
            "src/main/java/videos/Video_Reels_3.gif",
            "src/main/java/videos/Video_Reels_4.gif",
            "src/main/java/videos/Video_Reels_5.gif",           
            // Agrega más imágenes aquí
        };
        
        //cargarNombresDeUsuario;
        usernames = new String[] {"Usuario1", "user123", "instaFanatico", "user_insta", "photo_lover"};
        
         //cargarDescripciones;
        descripciones = new String[] 
            {"Hermoso paisaje en el campo! #paisaje #vacaciones #relajante",
            "Increibe noche! #noche #rayo #lluvia",
            "Fondo de pantalla animado #fondo #pantalla",
            "Fondo para tu celular animado #fondo #pantalla",
            "Super Mario Bros #videojuego #games"};
        
        
 
        gifs = new ImageIcon[urls.length];
        for (int i = 0; i < urls.length; i++) {
            ImageIcon imageIcon = new ImageIcon(urls[i]);
            Image image = imageIcon.getImage(); // transformalo
            Image newimg = image.getScaledInstance(likelabel.getWidth(), likelabel.getHeight(), Image.SCALE_DEFAULT); // escala esto
            gifs[i] = new ImageIcon(newimg);  // transformalo de nuevo
        }
        
        likelabel.setIcon(gifs[0]); // Establece la imagen inicial del botón
        Nom_usuario.setText(usernames[0]); // Establece el nombre de usuario inicial
        Descripcion_reels.setText(descripciones[0]); // Establece la descripcion inicial
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Like = new javax.swing.JButton();
        Opciones = new javax.swing.JButton();
        Camara = new javax.swing.JButton();
        Comentarios = new javax.swing.JButton();
        Compartir = new javax.swing.JButton();
        Descripcion_reels = new javax.swing.JLabel();
        Nom_usuario = new javax.swing.JLabel();
        Foto_Perfil = new javax.swing.JLabel();
        Logo_Reels = new javax.swing.JLabel();
        likelabel = new javax.swing.JButton();
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
                .addComponent(casitabt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lupabt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(crearbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(reelsbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(perfilbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(perfilbt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(reelsbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(casitabt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(crearbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lupabt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 410, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 20, -1));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        Like.setForeground(new java.awt.Color(242, 242, 242));
        Like.setBorder(null);
        Like.setContentAreaFilled(false);
        Like.setDefaultCapable(false);
        Like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LikeActionPerformed(evt);
            }
        });
        jPanel1.add(Like, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 50, 50));

        Opciones.setForeground(new java.awt.Color(242, 242, 242));
        Opciones.setBorder(null);
        Opciones.setContentAreaFilled(false);
        Opciones.setDefaultCapable(false);
        Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 30, 30));

        Camara.setForeground(new java.awt.Color(242, 242, 242));
        Camara.setBorder(null);
        Camara.setContentAreaFilled(false);
        Camara.setDefaultCapable(false);
        Camara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamaraActionPerformed(evt);
            }
        });
        jPanel1.add(Camara, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 40));

        Comentarios.setForeground(new java.awt.Color(242, 242, 242));
        Comentarios.setBorder(null);
        Comentarios.setContentAreaFilled(false);
        Comentarios.setDefaultCapable(false);
        jPanel1.add(Comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 40, 40));

        Compartir.setForeground(new java.awt.Color(242, 242, 242));
        Compartir.setBorder(null);
        Compartir.setContentAreaFilled(false);
        Compartir.setDefaultCapable(false);
        Compartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompartirActionPerformed(evt);
            }
        });
        jPanel1.add(Compartir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 40, 40));

        Descripcion_reels.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Descripcion_reels.setForeground(new java.awt.Color(255, 255, 255));
        Descripcion_reels.setText("Descripcion del video #####################");
        jPanel1.add(Descripcion_reels, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 280, -1));

        Nom_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nom_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Nom_usuario.setText("Usuario");
        jPanel1.add(Nom_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 90, 30));

        Foto_Perfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Foto_Perfil.setForeground(new java.awt.Color(255, 255, 255));
        Foto_Perfil.setText("Foto");
        jPanel1.add(Foto_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 30, 30));

        Logo_Reels.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Logo_Reels.setForeground(new java.awt.Color(255, 255, 255));
        Logo_Reels.setText("Reels");
        jPanel1.add(Logo_Reels, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        likelabel.setForeground(new java.awt.Color(242, 242, 242));
        likelabel.setBorder(null);
        likelabel.setContentAreaFilled(false);
        likelabel.setDefaultCapable(false);
        likelabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likelabelActionPerformed(evt);
            }
        });
        jPanel1.add(likelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 650));
        jPanel1.add(L_video, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 650));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casitabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casitabtActionPerformed
        // TODO add your handling code here:
        Pagina_Inicio abrir = new Pagina_Inicio(user2);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_casitabtActionPerformed

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

    private void perfilbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilbtActionPerformed
        // TODO add your handling code here:
        Pagina_User abrir = new Pagina_User(user2);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilbtActionPerformed

    private void CompartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompartirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompartirActionPerformed

    private void likelabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likelabelActionPerformed
        indice = (indice + 1) % gifs.length;
        likelabel.setIcon(gifs[indice]);
        Nom_usuario.setText(usernames[indice]); // Cambia el nombre de usuario
        Descripcion_reels.setText(descripciones[indice]); // Cambia la descripcion
        gif=gif+1;
        leerLikesDesdeBD();
        actualizarLabel();
        if (gif>5) {
            gif=1;
        }
        leerLikesDesdeBD();
        actualizarLabel();
    }//GEN-LAST:event_likelabelActionPerformed

    private void leerLikesDesdeBD() {
        // Configuración de la conexión a la base de datos
        String url = "jdbc:ucanaccess://" + ".\\src" + ".\\main" + ".\\java" + ".\\AbsoluteLayout" + ".\\DB_Instagram2.accdb";
        IDPublicacion = gif;
        String consultaSQL = "SELECT ContadorLikes FROM Publicaciones WHERE IDPublicacion = " + IDPublicacion;

        try (Connection conexion = DriverManager.getConnection(url);
             Statement statement = conexion.createStatement();
             ResultSet resultado = statement.executeQuery(consultaSQL)) {

            if (resultado.next()) {
                Likeguardado = resultado.getInt("ContadorLikes");
                  
                
            } else {
                System.out.println("No se encontró ningún registro en la tabla Publicaciones.");
            }
            jLabel2.setText("" + Likeguardado);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.");
        }
    }
    
    private void LikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LikeActionPerformed

         try {
                    
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

                    String url = "jdbc:ucanaccess://" + ".\\src" + ".\\main" + ".\\java" + ".\\AbsoluteLayout" + ".\\DB_Instagram2.accdb";

                    conn = DriverManager.getConnection(url);
                      
                    int IDPublicacion = gif; 
                    String sql = "SELECT ContadorLikes FROM Publicaciones WHERE IDPublicacion = " + IDPublicacion;
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    
                    int contadorLikes = 0;
                    
                    if (rs.next()) {
                        contadorLikes = rs.getInt("ContadorLikes");
                    }

                    if (contadorLikes == 0 || contadorLikes == 1) {
                        // Si el contador es 0 o 1, intercambiar
                        sql = "UPDATE Publicaciones SET ContadorLikes = " + (contadorLikes == 0 ? 1 : 0) + " WHERE IDPublicacion = " + IDPublicacion;
                        contador=contadorLikes;
                        actualizarLabel();
                    } else {
                        // Si el contador es diferente de 0 o 1, = 1
                        sql = "UPDATE Publicaciones SET ContadorLikes = 1 WHERE IDPublicacion = " + IDPublicacion;
                        contador=contadorLikes;
                        actualizarLabel();
                    }
                    stmt.executeUpdate(sql);

                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {

                    if (conn != null) {
                        try {
                            conn.close();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
        actualizarLabel(); // Actualizamos la etiqueta del contador
        
        
        
        
    }//GEN-LAST:event_LikeActionPerformed
       private void variables(){
           
       }
     private void actualizarLabel() {
         leerLikesDesdeBD();
         jLabel1.setText("" + Likeguardado);
         leerLikesDesdeBD();
    }
    
    private void OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionesActionPerformed

    private void CamaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CamaraActionPerformed


    public static void main(String user) {
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
System.out.print(user);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Reels(user).setVisible(true);
            }
        });
    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Camara;
    private javax.swing.JButton Comentarios;
    private javax.swing.JButton Compartir;
    private javax.swing.JLabel Descripcion_reels;
    private javax.swing.JLabel Foto_Perfil;
    private javax.swing.JLabel L_video;
    private javax.swing.JButton Like;
    private javax.swing.JLabel Logo_Reels;
    private javax.swing.JLabel Nom_usuario;
    private javax.swing.JButton Opciones;
    private javax.swing.JButton casitabt;
    private javax.swing.JButton crearbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton likelabel;
    private javax.swing.JButton lupabt;
    private javax.swing.JButton perfilbt;
    private javax.swing.JButton reelsbt;
    // End of variables declaration//GEN-END:variables

   
}
