/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto_Paquete;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class login extends javax.swing.JFrame {
int xmause,ymause;
    /**
     * Creates new form NewJFrame
     */
    public login() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        SALIDABTN = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        contraseñatxt = new javax.swing.JPasswordField();
        ENTRARBTN = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/193318.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 430, 190));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 280, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("INICIAR SESION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 40));

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        SALIDABTN.setBackground(new java.awt.Color(255, 255, 255));
        SALIDABTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALIDABTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SALIDABTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SALIDABTNMouseExited(evt);
            }
        });

        x.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout SALIDABTNLayout = new javax.swing.GroupLayout(SALIDABTN);
        SALIDABTN.setLayout(SALIDABTNLayout);
        SALIDABTNLayout.setHorizontalGroup(
            SALIDABTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SALIDABTNLayout.createSequentialGroup()
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        SALIDABTNLayout.setVerticalGroup(
            SALIDABTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SALIDABTNLayout.createSequentialGroup()
                .addComponent(x)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(SALIDABTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 750, Short.MAX_VALUE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(SALIDABTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );

        jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        usuariotxt.setForeground(new java.awt.Color(204, 204, 204));
        usuariotxt.setText("INGRESE SU USUARIO");
        usuariotxt.setBorder(null);
        usuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariotxtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariotxtMousePressed(evt);
            }
        });
        usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotxtActionPerformed(evt);
            }
        });
        jPanel1.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 280, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 260, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 260, 10));

        contraseñatxt.setForeground(new java.awt.Color(204, 204, 204));
        contraseñatxt.setText("********");
        contraseñatxt.setBorder(null);
        contraseñatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñatxtMousePressed(evt);
            }
        });
        contraseñatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñatxtActionPerformed(evt);
            }
        });
        jPanel1.add(contraseñatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, -1));

        ENTRARBTN.setBackground(new java.awt.Color(102, 102, 255));
        ENTRARBTN.setForeground(new java.awt.Color(102, 102, 255));
        ENTRARBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENTRARBTNMouseClicked(evt);
            }
        });

        jLabel7.setText("ENTRAR");

        javax.swing.GroupLayout ENTRARBTNLayout = new javax.swing.GroupLayout(ENTRARBTN);
        ENTRARBTN.setLayout(ENTRARBTNLayout);
        ENTRARBTNLayout.setHorizontalGroup(
            ENTRARBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(ENTRARBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ENTRARBTNLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ENTRARBTNLayout.setVerticalGroup(
            ENTRARBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(ENTRARBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ENTRARBTNLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(ENTRARBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/city.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariotxtActionPerformed

    private void contraseñatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñatxtActionPerformed

    private void usuariotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariotxtMouseClicked
       
    }//GEN-LAST:event_usuariotxtMouseClicked

    private void usuariotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariotxtMousePressed
         if(usuariotxt.getText().equals("INGRESE SU USUARIO")){
        usuariotxt.setText("");
        usuariotxt.setForeground(Color.black);}
if (String.valueOf(contraseñatxt.getPassword()).isEmpty()){
        contraseñatxt.setText("********");
contraseñatxt.setForeground(Color.gray);}
    }//GEN-LAST:event_usuariotxtMousePressed

    private void contraseñatxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñatxtMousePressed
        if (String.valueOf(contraseñatxt.getPassword()).equals("********")){
contraseñatxt.setText("");
contraseñatxt.setForeground(Color.black);}
if(usuariotxt.getText().isEmpty()){
usuariotxt.setText("INGRESE SU USUARIO");
        usuariotxt.setForeground(Color.gray);}
    }//GEN-LAST:event_contraseñatxtMousePressed

    private void ENTRARBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARBTNMouseClicked
        String Usuario="admin";
        String Contraseña="123";
        String Pass=new String(contraseñatxt.getPassword());
        if(usuariotxt.getText().equals(Usuario)&& Pass.equals(Contraseña)){
            aplicacion ap=new aplicacion();
            ap.setVisible(true);
            dispose();;
        }else {
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña no son validos");
                    
        }
    }//GEN-LAST:event_ENTRARBTNMouseClicked

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        xmause=evt.getX();
        ymause=evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmause,y-ymause);
    }//GEN-LAST:event_headMouseDragged

    private void SALIDABTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALIDABTNMouseExited
        SALIDABTN.setBackground(Color.WHITE);
        x.setForeground(Color.BLACK);
    }//GEN-LAST:event_SALIDABTNMouseExited

    private void SALIDABTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALIDABTNMouseEntered
        SALIDABTN.setBackground(Color.RED);
        x.setForeground(Color.white);
    }//GEN-LAST:event_SALIDABTNMouseEntered

    private void SALIDABTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALIDABTNMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SALIDABTNMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ENTRARBTN;
    private javax.swing.JPanel SALIDABTN;
    private javax.swing.JPasswordField contraseñatxt;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField usuariotxt;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
