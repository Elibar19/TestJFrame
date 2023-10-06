
package com.login;

import java.awt.Color;

/**
 *
 * @author Elián
 */
public class Login extends javax.swing.JFrame {

    private int xMouse, yMouse;
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        nombre_de_empresaLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        fondoLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        inicioSesionLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginButton = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre_de_empresaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nombre_de_empresaLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombre_de_empresaLabel.setText("NOMBRE DE EMPRESA");
        bg.add(nombre_de_empresaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N
        bg.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 290, -1));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/city.png"))); // NOI18N
        bg.add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 290, 500));

        nombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/favicon.png"))); // NOI18N
        nombreLabel.setText("LOGO");
        bg.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        inicioSesionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inicioSesionLabel.setText("INICIAR SESION");
        bg.add(inicioSesionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        usuarioLabel.setBackground(new java.awt.Color(255, 255, 255));
        usuarioLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuarioLabel.setText("Usuario");
        bg.add(usuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        usuarioField.setForeground(new java.awt.Color(153, 153, 153));
        usuarioField.setText("Ingrese su nombre de usuario");
        usuarioField.setBorder(null);
        usuarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioFieldMousePressed(evt);
            }
        });
        usuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFieldActionPerformed(evt);
            }
        });
        bg.add(usuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 340, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 340, -1));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText("Contraseña");
        bg.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("*********");
        passwordField.setToolTipText("");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        bg.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 340, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 340, -1));

        loginButton.setBackground(new java.awt.Color(102, 204, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Ingresar");
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setText("X");
        exitBtn.setOpaque(true);
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 721, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFieldActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
            System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        exitBtn.setBackground(Color.red);
        exitBtn.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        exitBtn.setBackground(Color.white);
        exitBtn.setForeground(Color.black);
    }//GEN-LAST:event_exitBtnMouseExited

    private void usuarioFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioFieldMousePressed
        if (usuarioField.getText().equals("Ingrese su nombre de usuario")){ 
            usuarioField.setText("");
            usuarioField.setForeground(Color.black);
        }
        if (String.valueOf(passwordField.getPassword()).isEmpty()){
            passwordField.setText("*********");
            passwordField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        if (usuarioField.getText().isEmpty()){ 
            usuarioField.setText("Ingrese su nombre de usuario");
            usuarioField.setForeground(Color.gray);
        }
        if (String.valueOf(passwordField.getPassword()).equals("*********")){
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }
    }//GEN-LAST:event_passwordFieldMousePressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel inicioSesionLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombre_de_empresaLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usuarioField;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
