package com.mycompany.proyecto;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Create_account extends javax.swing.JFrame {

    Diseño_objetos diseño = new Diseño_objetos();
    Imagenes Img = new Imagenes();
    
        public Create_account() {
            //BOTONES REDODNEADOS
            diseño.BordesRedondeados(30, 100);  
            
            initComponents();
            
            //IMAGENES EN JLABELS
            this.setLocationRelativeTo(this);
            Img.SetImageLabel(L_fondo_CA, "src/main/java/imagenes/Fondo_Login.png");
            Img.SetImageLabel(L_Logo_insta, "src/main/java/imagenes/Logo.png");

            //BOTONES TRASPARENTES (1 = quitar fondo, 2 = quitar bordes y 3 = quitar ambos)
            diseño.trasparenciaButton(Btn_ventana_Iniciar,3);
            diseño.trasparenciaButton(Btn_Crear_Cuenta,2);
           
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Tf_nom_usuario = new javax.swing.JTextField();
        Tf_Correo = new javax.swing.JTextField();
        Pw_Crear_contraseña = new javax.swing.JPasswordField();
        CB_Terminos_Condiciones = new javax.swing.JCheckBox();
        Btn_Crear_Cuenta = new javax.swing.JButton();
        Btn_ventana_Iniciar = new javax.swing.JButton();
        Tf_Date = new javax.swing.JFormattedTextField();
        L_tienes_cuenta = new javax.swing.JLabel();
        L_Logo_insta = new javax.swing.JLabel();
        NoCheckBox = new javax.swing.JLabel();
        Tf_Nombre2 = new javax.swing.JTextField();
        L_fondo_CA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tf_nom_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tf_nom_usuario.setText("Nombre de Usuario");
        Tf_nom_usuario.setToolTipText("");
        Tf_nom_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_nom_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Tf_nom_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 370, 60));

        Tf_Correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tf_Correo.setText("Correo Electronico");
        Tf_Correo.setToolTipText("");
        Tf_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_CorreoActionPerformed(evt);
            }
        });
        jPanel1.add(Tf_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 370, 60));

        Pw_Crear_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pw_Crear_contraseña.setText("Contraseña");
        Pw_Crear_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pw_Crear_contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(Pw_Crear_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 370, 60));

        CB_Terminos_Condiciones.setText("He leído y acepto los términos y condiciones de uso");
        CB_Terminos_Condiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Terminos_CondicionesActionPerformed(evt);
            }
        });
        jPanel1.add(CB_Terminos_Condiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        Btn_Crear_Cuenta.setBackground(new java.awt.Color(0, 102, 255));
        Btn_Crear_Cuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btn_Crear_Cuenta.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Crear_Cuenta.setText("Crear Cuenta");
        Btn_Crear_Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Crear_CuentaActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Crear_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 370, 60));

        Btn_ventana_Iniciar.setBackground(new java.awt.Color(242, 242, 242));
        Btn_ventana_Iniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Btn_ventana_Iniciar.setForeground(new java.awt.Color(0, 102, 255));
        Btn_ventana_Iniciar.setText("Inicia sesión");
        Btn_ventana_Iniciar.setBorder(null);
        Btn_ventana_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ventana_IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_ventana_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        try {
            Tf_Date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Tf_Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Tf_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, 60));

        L_tienes_cuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        L_tienes_cuenta.setText("¿Tienes una cuenta?");
        jPanel1.add(L_tienes_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, -1, -1));
        jPanel1.add(L_Logo_insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 210, 70));

        NoCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        NoCheckBox.setText("No has aceptado los terminos y condiciones!");
        NoCheckBox.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                NoCheckBoxComponentHidden(evt);
            }
        });
        jPanel1.add(NoCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 380, -1));

        Tf_Nombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tf_Nombre2.setText("Nombre");
        Tf_Nombre2.setToolTipText("");
        Tf_Nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Nombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(Tf_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 60));
        jPanel1.add(L_fondo_CA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 700));

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

    private void Tf_nom_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_nom_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_nom_usuarioActionPerformed

    private void Tf_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_CorreoActionPerformed

    private void Pw_Crear_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pw_Crear_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pw_Crear_contraseñaActionPerformed

    private void Btn_Crear_CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Crear_CuentaActionPerformed
        
        //int edad=54;
       String nombre = Tf_Nombre2.getText();
       String fechaStr = Tf_Date.getText();
      
       String correo = Tf_Correo.getText();
       String user = Tf_nom_usuario.getText();
       String pass = Pw_Crear_contraseña.getText();
       
       if(CB_Terminos_Condiciones.isSelected() == true ){
        BDconsultas temp = new BDconsultas();
        temp.insertarDato(nombre, fechaStr, correo, user, pass);
        User abrir=new User();
        abrir.setVisible(true);
        this.setVisible(false);
       } else {
        NoCheckBox.setForeground(Color.red);
       }
       
        //no se hace el fucking commit ahhh!!!!!!!
    }//GEN-LAST:event_Btn_Crear_CuentaActionPerformed

    private void Btn_ventana_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ventana_IniciarActionPerformed
        Login abrir=new Login();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_ventana_IniciarActionPerformed

    private void NoCheckBoxComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_NoCheckBoxComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_NoCheckBoxComponentHidden

    private void CB_Terminos_CondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Terminos_CondicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Terminos_CondicionesActionPerformed

    private void Tf_Nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Nombre2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        /* BORDES REDONDEADOS */
        Create_account ventanaCrear = new Create_account();
        
        java.awt.EventQueue.invokeLater(new Runnable(){ public void run() {ventanaCrear.setVisible(true);} });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Crear_Cuenta;
    private javax.swing.JButton Btn_ventana_Iniciar;
    private javax.swing.JCheckBox CB_Terminos_Condiciones;
    private javax.swing.JLabel L_Logo_insta;
    private javax.swing.JLabel L_fondo_CA;
    private javax.swing.JLabel L_tienes_cuenta;
    private javax.swing.JLabel NoCheckBox;
    private javax.swing.JPasswordField Pw_Crear_contraseña;
    private javax.swing.JTextField Tf_Correo;
    private javax.swing.JFormattedTextField Tf_Date;
    private javax.swing.JTextField Tf_Nombre2;
    private javax.swing.JTextField Tf_nom_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
