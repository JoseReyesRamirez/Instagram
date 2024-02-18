package com.mycompany.proyecto;

public class Login extends javax.swing.JFrame {
    Diseño_objetos diseño = new Diseño_objetos();
    Imagenes Img = new Imagenes();
    
        public Login() {
            //BOTONES REDODNEADOS
            diseño.BordesRedondeados(30, 100);  
            
            initComponents();
            //trasparenciaButton();
     
            //IMAGENES EN JLABELS
            this.setLocationRelativeTo(this);
            Img.SetImageLabel(L_logo_insta, "src/main/java/com/mycompany/proyecto/Imagenes/Logo_Login.png");
            Img.SetImageLabel(L_logo_meta, "src/main/java/com/mycompany/proyecto/Imagenes/Meta_Logo.png");
        
            //BOTONES TRASPARENTES (1 = quitar fondo, 2 = quitar bordes y 3 = quitar ambos)
            diseño.trasparenciaButton(Btn_cambiar_contraseña,3);
            diseño.trasparenciaButton(Btn_Iniciar_sesion,2);
           
        }


    
 
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_fondo = new javax.swing.JPanel();
        Tf_usuario = new javax.swing.JTextField();
        Pw_contraseña = new javax.swing.JPasswordField();
        Btn_Iniciar_sesion = new javax.swing.JButton();
        Btn_cambiar_contraseña = new javax.swing.JButton();
        Btn_crear_cuenta = new javax.swing.JButton();
        L_logo_insta = new javax.swing.JLabel();
        L_logo_meta = new javax.swing.JLabel();
        L_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel_fondo.add(Btn_crear_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 368, 57));

        L_logo_insta.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Apps Netbeans\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\Imagenes\\Logo_Login.png")); // NOI18N
        Panel_fondo.add(L_logo_insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, 60));

        L_logo_meta.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Apps Netbeans\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\Imagenes\\Meta_Logo.png")); // NOI18N
        Panel_fondo.add(L_logo_meta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 60, 30));

        L_fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Apps Netbeans\\proyecto\\src\\main\\java\\com\\mycompany\\proyecto\\Imagenes\\Fondo_Login.png")); // NOI18N
        Panel_fondo.add(L_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_crear_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_crear_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_crear_cuentaActionPerformed

    private void Btn_Iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Iniciar_sesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Iniciar_sesionActionPerformed

    private void Tf_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_usuarioActionPerformed

    private void Pw_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pw_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pw_contraseñaActionPerformed

    private void Btn_cambiar_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_cambiar_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_cambiar_contraseñaActionPerformed
    


    public static void main(String args[]) {
        /* BORDES REDONDEADOS */
        Login ventanaLogin = new Login();
        java.awt.EventQueue.invokeLater(new Runnable(){ public void run() {ventanaLogin.setVisible(true);} });
         
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Iniciar_sesion;
    private javax.swing.JButton Btn_cambiar_contraseña;
    private javax.swing.JButton Btn_crear_cuenta;
    private javax.swing.JLabel L_fondo;
    private javax.swing.JLabel L_logo_insta;
    private javax.swing.JLabel L_logo_meta;
    private javax.swing.JPanel Panel_fondo;
    private javax.swing.JPasswordField Pw_contraseña;
    private javax.swing.JTextField Tf_usuario;
    // End of variables declaration//GEN-END:variables
}
