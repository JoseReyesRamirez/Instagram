package com.mycompany.proyecto;

import java.awt.Color;
import java.awt.Font;
import javax.accessibility.AccessibleState;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends javax.swing.JFrame {
    Diseño_objetos diseño = new Diseño_objetos();
    Imagenes Img = new Imagenes();
    
        public Login() {
            super("Mi Ventana");
            setSize(700, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false); // Evitar que el usuario modifique el tamaño
            setVisible(true);
            //BOTONES REDODNEADOS
            diseño.BordesRedondeados(30, 100);  
            
            initComponents();
            //trasparenciaButton();
     
            //IMAGENES EN JLABELS
            this.setLocationRelativeTo(this);
            Img.SetImageLabel(L_logo_insta, "src/main/java/imagenes/Logo_Login.png");
            Img.SetImageLabel(L_logo_meta, "src/main/java/imagenes/Meta_Logo.png");
            Img.SetImageLabel(L_fondo_Lg, "src/main/java/imagenes/Fondo_Login.png");
            
            //BOTONES TRASPARENTES (1 = quitar fondo, 2 = quitar bordes y 3 = quitar ambos)
            diseño.trasparenciaButton(Btn_cambiar_contraseña,3);
            diseño.trasparenciaButton(Btn_Iniciar_sesion,2);
           
        }


    
 
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_fondo = new javax.swing.JPanel();
        NoAccount = new javax.swing.JLabel();
        Tf_usuario = new javax.swing.JTextField();
        Pw_contraseña = new javax.swing.JPasswordField();
        Btn_Iniciar_sesion = new javax.swing.JButton();
        Btn_cambiar_contraseña = new javax.swing.JButton();
        Btn_crear_cuenta = new javax.swing.JButton();
        L_logo_meta = new javax.swing.JLabel();
        L_logo_insta = new javax.swing.JLabel();
        L_fondo_Lg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BackUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NoAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoAccount.setForeground(new java.awt.Color(255, 255, 255));
        NoAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoAccount.setText("El Usuario o contraseña son incorrectos");
        NoAccount.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                NoAccountComponentHidden(evt);
            }
        });
        Panel_fondo.add(NoAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 380, -1));

        Tf_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tf_usuario.setText("Telefono, Usuario o Correo Electronico");
        Tf_usuario.setToolTipText("");
        Tf_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_usuarioActionPerformed(evt);
            }
        });
        Panel_fondo.add(Tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 370, 60));

        Pw_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pw_contraseña.setText("Contraseña");
        Pw_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pw_contraseñaActionPerformed(evt);
            }
        });
        Panel_fondo.add(Pw_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 370, 60));

        Btn_Iniciar_sesion.setBackground(new java.awt.Color(0, 102, 255));
        Btn_Iniciar_sesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btn_Iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Iniciar_sesion.setText("Iniciar sesion");
        Btn_Iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Iniciar_sesionActionPerformed(evt);
            }
        });
        Panel_fondo.add(Btn_Iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 370, 60));

        Btn_cambiar_contraseña.setBackground(new java.awt.Color(242, 242, 242));
        Btn_cambiar_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_cambiar_contraseña.setText("¿Olvidaste tu contraseña?");
        Btn_cambiar_contraseña.setBorder(null);
        Btn_cambiar_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_cambiar_contraseñaActionPerformed(evt);
            }
        });
        Panel_fondo.add(Btn_cambiar_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        Btn_crear_cuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btn_crear_cuenta.setForeground(new java.awt.Color(0, 102, 255));
        Btn_crear_cuenta.setText("Crear cuenta nueva");
        Btn_crear_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_crear_cuentaActionPerformed(evt);
            }
        });
        Panel_fondo.add(Btn_crear_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 368, 57));
        Panel_fondo.add(L_logo_meta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, 60, 30));
        Panel_fondo.add(L_logo_insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, 60));
        Panel_fondo.add(L_fondo_Lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 700));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        BackUser.setBorder(null);
        BackUser.setBorderPainted(false);
        BackUser.setContentAreaFilled(false);
        BackUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BackUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(BackUser)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        Panel_fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 410, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackUserActionPerformed
        Login abrir=new Login();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackUserActionPerformed

    private void Btn_crear_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_crear_cuentaActionPerformed
        Create_account abrir=new Create_account();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_crear_cuentaActionPerformed

    private void Btn_cambiar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cambiar_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_cambiar_contraseñaActionPerformed

    private void Btn_Iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Iniciar_sesionActionPerformed
        String usuario = Tf_usuario.getText();
        String contraseña = new String(Pw_contraseña.getPassword());
 
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
 
        try {
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://" + ".\\DB_Instagram.accdb"; //Conectamos base de datos;
            conn = DriverManager.getConnection(url);
 
             String query = "SELECT * FROM Usuarios WHERE Username = ? AND Contraseña = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
 
            rs = stmt.executeQuery();
 
            if (rs.next()) {
                NoAccount.setForeground(Color.white);
                //JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                Pagina_Inicio abrir=new Pagina_Inicio();
                abrir.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "ERR");
                NoAccount.setForeground(Color.red);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_Btn_Iniciar_sesionActionPerformed

    private void Pw_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pw_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pw_contraseñaActionPerformed

    private void Tf_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_usuarioActionPerformed

    private void NoAccountComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_NoAccountComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_NoAccountComponentHidden
    


    public static void main(String args[]) {
        /* BORDES REDONDEADOS */
        Login ventanaLogin = new Login();
        java.awt.EventQueue.invokeLater(new Runnable(){ public void run() {ventanaLogin.setVisible(true);} });
         
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackUser;
    private javax.swing.JButton Btn_Iniciar_sesion;
    private javax.swing.JButton Btn_cambiar_contraseña;
    private javax.swing.JButton Btn_crear_cuenta;
    private javax.swing.JLabel L_fondo_Lg;
    private javax.swing.JLabel L_logo_insta;
    private javax.swing.JLabel L_logo_meta;
    private javax.swing.JLabel NoAccount;
    private javax.swing.JPanel Panel_fondo;
    private javax.swing.JPasswordField Pw_contraseña;
    private javax.swing.JTextField Tf_usuario;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
