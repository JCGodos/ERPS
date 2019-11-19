/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORMULARIOS;

import Animacion.Animacion;
import AppPackage.AnimationClass;
import CLASES.FUBconectar;
import com.sun.awt.AWTUtilities;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author FRANK
 */
public class LOGIN extends javax.swing.JFrame {

    int xx,yy;
    
    Animacion an;
    
    String cap="";
        String cont="1";
        String cap2="1";
        String fo;
        String secre;
        
//    FUBconectar con;
//    RECUPERARUSUARIO USUARIO=new RECUPERARUSUARIO();
//    RECUPERARCONTRASEÑA CONTRASEÑA=new RECUPERARCONTRASEÑA();
//MENSAJEEXITO EXITO = new MENSAJEEXITO();
//MENSAJEINCORRECTO INCO = new MENSAJEINCORRECTO();
        MEN M = new MEN();
        
    public LOGIN() {
        this.setUndecorated(true);
        initComponents();
        
        
        
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/nueeeee.png")).getImage());
        Shape forma=new RoundRectangle2D.Double(0,0, this.getBounds().width, this.getBounds().height,30,30);
        AWTUtilities.setWindowShape(this,forma);
        this.setLocationRelativeTo(null);
        an =new Animacion();
        
        
        click2.setVisible(false);
        
        
        this.recuperar.setVisible(true);

        this.b_usuario.setVisible(false);
        this.b_contraseña.setVisible(false);
        
    }

       public void acceder(String usuario,String contraseña){
  
           if (CUADRO1.getText().equals("ERP") && (CUADRO2.getText().equals("ERP"))) {
                          M.setVisible(true);

            this.dispose(); 
           }
//        int valor=0;
//        String dat="";
//     con=new FUBconectar();
//        Connection reg= con.getConnection();
//        String sql="select * from login where usuario='"+usuario+"' &&  contraseña='"+contraseña+"'";
//       
//        try{ 
//            
//        Statement st = reg.createStatement();
//        ResultSet rs=st.executeQuery(sql);
//        
//        while(rs.next()){
//            secre=rs.getString("nsecreto");
//            cap=rs.getString("usuario");
//            cont=rs.getString("contraseña");
//            cap2=rs.getString("estado");
////            fo=rs.getString("ruta");
//            
//        }
//  
//
//        
//        if (cap2.equals("Administrador")&&(cap.equals(usuario)&&(cont.equals(contraseña)))){
//            
////                     
////        EXITO.dispose();
////     INCO.dispose();
//            //JOptionPane.showMessageDialog(null,"BIENVENIDO ADMINISTRADOR");
//            //BIEN B= new BIEN();
//            
//            M.setVisible(true);
//            
////            M.textField8.setText(secre);
//            M.jLabel1.setText(cap);
////            M.textField9.setText(cont);
////            M.textField10.setText(cap2);
////            M.fotomenu.setText(fo);
//            this.dispose();
////        M.rata();
//            
////            if (M.hora2.getText()!="") {
////            M.mensa.setVisible(true);
////            M.mensa.te.setText("TIENES "+M.hora2.getText()+" "+" CLIENTE HOY");
////        }
//        }else{
//            if (cap2.equals("Asistente")&&(cap.equals(usuario)&&(cont.equals(contraseña)))) {
//                
////            //JOptionPane.showMessageDialog(null,"BIENVENIDO EMPLEADO");
////
////        EXITO.dispose();
////        INCO.dispose();
//        
//            M.setVisible(true);
////            M.jButton3.setEnabled(false);
////            M.jButton4.setEnabled(false);
//            
////            M.textField8.setText(secre);
//            M.jLabel1.setText(cap);
////            M.textField9.setText(cont);
////            M.textField10.setText(cap2);
////            M.fotomenu.setText(fo);
//            this.dispose();
//            
// }else{
////            MENERROR men=new MENERROR();         
////            this.INCO.setVisible(true);
//            }
//            
//
//        }
//            
//                //JOptionPane.showMessageDialog(null,"No existen sus datos");
//        
//        }    catch (SQLException ex) {
//            Logger.getLogger(LOGIN.class.getName()).log(Level.SEVERE, null, ex);
//        }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        click = new javax.swing.JButton();
        click2 = new javax.swing.JButton();
        login = new javax.swing.JPanel();
        lOGIN11 = new BOTON.LOGIN1();
        jButton1 = new javax.swing.JButton();
        CUADRO1 = new org.edisoncor.gui.textField.TextField();
        CUADRO2 = new org.edisoncor.gui.passwordField.PasswordField();
        jLabel4 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bOTON1 = new BOTON.BOTON();
        bOTON_MINIMIZAR1 = new BOTON.BOTON_MINIMIZAR();
        recuperar = new BOTON.BOTON_RECUPERAR();
        b_contraseña = new BOTON.BOTON_CONTRASENA();
        b_usuario = new BOTON.BOTON_USUARIO();
        jLabel5 = new javax.swing.JLabel();
        atras1 = new BOTON.atras();
        ATRAS = new javax.swing.JButton();
        adelante1 = new BOTON.adelante();
        ADELANTE = new javax.swing.JButton();
        PUBLICIDAD1 = new javax.swing.JLabel();
        PUBLICIDAD = new javax.swing.JLabel();
        PALO1 = new javax.swing.JLabel();
        PALO = new javax.swing.JLabel();
        PRIMERFONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click.setBorder(null);
        click.setBorderPainted(false);
        click.setContentAreaFilled(false);
        click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickActionPerformed(evt);
            }
        });
        getContentPane().add(click, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 0, 250, 30));

        click2.setBorder(null);
        click2.setBorderPainted(false);
        click2.setContentAreaFilled(false);
        click2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                click2ActionPerformed(evt);
            }
        });
        getContentPane().add(click2, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 240, 250, 30));

        login.setOpaque(false);
        login.setLayout(null);

        lOGIN11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lOGIN11ActionPerformed(evt);
            }
        });
        login.add(lOGIN11);
        lOGIN11.setBounds(84, 190, 85, 37);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GO_LOG_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GO_LOG_ON.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        login.add(jButton1);
        jButton1.setBounds(90, 193, 73, 30);

        CUADRO1.setBackground(new java.awt.Color(20, 91, 125));
        CUADRO1.setForeground(new java.awt.Color(40, 40, 40));
        CUADRO1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CUADRO1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CUADRO1KeyTyped(evt);
            }
        });
        login.add(CUADRO1);
        CUADRO1.setBounds(60, 60, 130, 30);

        CUADRO2.setBackground(new java.awt.Color(20, 91, 125));
        CUADRO2.setForeground(new java.awt.Color(40, 40, 40));
        CUADRO2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login.add(CUADRO2);
        CUADRO2.setBounds(60, 150, 130, 30);

        jLabel4.setFont(new java.awt.Font("White On Black", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PASSWORD:");
        login.add(jLabel4);
        jLabel4.setBounds(70, 120, 110, 20);

        usuario.setFont(new java.awt.Font("White On Black", 0, 16)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 102, 102));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("USUARIO:");
        login.add(usuario);
        usuario.setBounds(70, 30, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGIN_NUEEE.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        login.add(jLabel1);
        jLabel1.setBounds(0, 0, 250, 270);

        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, -240, 250, 270));

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        bOTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOTON1ActionPerformed(evt);
            }
        });
        jPanel1.add(bOTON1);
        bOTON1.setBounds(940, 10, 50, 50);

        bOTON_MINIMIZAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOTON_MINIMIZAR1ActionPerformed(evt);
            }
        });
        jPanel1.add(bOTON_MINIMIZAR1);
        bOTON_MINIMIZAR1.setBounds(880, 10, 50, 50);

        recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarActionPerformed(evt);
            }
        });
        jPanel1.add(recuperar);
        recuperar.setBounds(450, 450, 85, 30);

        b_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_contraseñaMouseEntered(evt);
            }
        });
        b_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(b_contraseña);
        b_contraseña.setBounds(390, 450, 85, 30);

        b_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_usuarioMouseEntered(evt);
            }
        });
        b_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(b_usuario);
        b_usuario.setBounds(510, 450, 85, 30);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(372, 435, 240, 60);

        atras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atras1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atras1MouseExited(evt);
            }
        });
        atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras1ActionPerformed(evt);
            }
        });
        jPanel1.add(atras1);
        atras1.setBounds(43, 437, 46, 46);

        ATRAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ATRASSOBRA.gif"))); // NOI18N
        ATRAS.setBorder(null);
        ATRAS.setBorderPainted(false);
        ATRAS.setContentAreaFilled(false);
        ATRAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ATRASMouseClicked(evt);
            }
        });
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });
        jPanel1.add(ATRAS);
        ATRAS.setBounds(2, 426, 130, 71);

        adelante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adelante1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adelante1MouseExited(evt);
            }
        });
        adelante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelante1ActionPerformed(evt);
            }
        });
        jPanel1.add(adelante1);
        adelante1.setBounds(905, 437, 46, 46);

        ADELANTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ATRASSOBRA.gif"))); // NOI18N
        ADELANTE.setBorder(null);
        ADELANTE.setBorderPainted(false);
        ADELANTE.setContentAreaFilled(false);
        ADELANTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADELANTEMouseClicked(evt);
            }
        });
        ADELANTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADELANTEActionPerformed(evt);
            }
        });
        jPanel1.add(ADELANTE);
        ADELANTE.setBounds(857, 426, 140, 71);

        PUBLICIDAD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/KEVIN1.png"))); // NOI18N
        PUBLICIDAD1.setText("jLabel1");
        jPanel1.add(PUBLICIDAD1);
        PUBLICIDAD1.setBounds(1000, 100, 1000, 320);

        PUBLICIDAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/KEVIN2.png"))); // NOI18N
        PUBLICIDAD.setText("jLabel1");
        jPanel1.add(PUBLICIDAD);
        PUBLICIDAD.setBounds(0, 100, 1000, 320);

        PALO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/paloPublic.png"))); // NOI18N
        jPanel1.add(PALO1);
        PALO1.setBounds(0, 418, 1000, 10);

        PALO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/paloPublic.png"))); // NOI18N
        jPanel1.add(PALO);
        PALO.setBounds(2, 94, 1000, 10);

        PRIMERFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LoginBACKGROU.png"))); // NOI18N
        jPanel1.add(PRIMERFONDO);
        PRIMERFONDO.setBounds(0, 0, 1000, 500);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ATRASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ATRASMouseClicked
     AnimationClass ac= new AnimationClass();
     ac.jLabelXRight(-1000, 0, 5, 5, PUBLICIDAD);
     
     AnimationClass ac2= new AnimationClass();
     ac2.jLabelXRight(0, 1000, 5, 5, PUBLICIDAD1);
    }//GEN-LAST:event_ATRASMouseClicked

    private void ADELANTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADELANTEMouseClicked
     AnimationClass ac= new AnimationClass();
     ac.jLabelXLeft(0, -1000, 5, 5, PUBLICIDAD);
     
     AnimationClass ac2= new AnimationClass();
     ac2.jLabelXLeft(1000, 0, 5, 5, PUBLICIDAD1);
    }//GEN-LAST:event_ADELANTEMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    AnimationClass ac= new AnimationClass();
     ac.jLabelXLeft(0, -1000, 5, 5, PUBLICIDAD);
     
     AnimationClass ac2= new AnimationClass();
     ac2.jLabelXLeft(1000, 0, 5, 5, PUBLICIDAD1);
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
//          int posicion = click.getX();
//        if (posicion > 5) {
//        Animacion.bajar(-240, 0, 2, 2, login);
//    
//    }else{
////            if (posicion == 0) {
////    Animacion.subir(0, -240, 2, 2, login);
////    }
//        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickActionPerformed
        int posicion = click.getX();

        if (posicion > 5) {
 
            //                Animacion.Animacion.bajar(posicion, xx, ERROR, WIDTH, this);
//            Animacion.bajar(40, 250, 2, 2, click);
            //            Animacion.Animacion.mover_derecha(-160, -50, 2, 2, jLabel74);
            Animacion.bajar(-240, 0, 2, 2, login);
        }
        else{
        
        
//           Animacion.subir(250, 40, 2, 2, click);
            //            Animacion.Animacion.mover_izquierda(-50, -210, 2, 2, jLabel74);
//           Animacion.subir(0, -240, 2, 2, login);
            //        Animacion.Animacion.subir(posicion, xx, ERROR, WIDTH, rootPane);
        
        }
        click2.setVisible(true);
        click.setVisible(false);
//Animacion.Animacion.bajar(-240, 0, 25, 2, login);
//Animacion.Animacion.subir(0, -240, 25, 2, login);
    }//GEN-LAST:event_clickActionPerformed

    private void click2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_click2ActionPerformed
          
        
        int posicion = click2.getX();

        if (posicion > 5) {
 
            //                Animacion.Animacion.bajar(posicion, xx, ERROR, WIDTH, this);
//            Animacion.bajar(40, 250, 2, 2, click);
            //            Animacion.Animacion.mover_derecha(-160, -50, 2, 2, jLabel74);
//            Animacion.bajar(-240, 0, 2, 2, login);
Animacion.subir(0, -240, 2, 2, login);
        }
        else{
        
        
//           Animacion.subir(250, 40, 2, 2, click);
            //            Animacion.Animacion.mover_izquierda(-50, -210, 2, 2, jLabel74);
           
            //        Animacion.Animacion.subir(posicion, xx, ERROR, WIDTH, rootPane);
        
        }
        click2.setVisible(false);
        click.setVisible(true);
//Animacion.Animacion.bajar(-240, 0, 25, 2, login);
//Animacion.Animacion.subir(0, -240, 25, 2, login);
    }//GEN-LAST:event_click2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String usuario= CUADRO1.getText();
           String contraseña= String.valueOf(CUADRO2.getPassword());
            acceder(usuario, contraseña);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CUADRO1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CUADRO1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_CUADRO1KeyTyped

    private void bOTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOTON1ActionPerformed
    try{
        int dialogButton=JOptionPane.YES_NO_OPTION;
     int result=JOptionPane.showConfirmDialog(this, "Desea Cerrar El Sistema??","EXIT",dialogButton);
     
        if (result==0) {
            System.exit(0);
        }
    }catch(Exception o){
    JOptionPane.showMessageDialog(null,"error");
    }
    }//GEN-LAST:event_bOTON1ActionPerformed

    private void bOTON_MINIMIZAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOTON_MINIMIZAR1ActionPerformed
      this.setState(FORMULARIOS.LOGIN.ICONIFIED);
    }//GEN-LAST:event_bOTON_MINIMIZAR1ActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ATRASActionPerformed

    private void atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras1ActionPerformed
      AnimationClass ac= new AnimationClass();
     ac.jLabelXRight(-1000, 0, 5, 5, PUBLICIDAD);
     
     AnimationClass ac2= new AnimationClass();
     ac2.jLabelXRight(0, 1000, 5, 5, PUBLICIDAD1);
    }//GEN-LAST:event_atras1ActionPerformed

    private void atras1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseEntered
    ATRAS.setIcon(new ImageIcon(getClass().getResource("/IMAGENES/ATRASSOBRA2.gif")));
    }//GEN-LAST:event_atras1MouseEntered

    private void atras1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras1MouseExited
      ATRAS.setIcon(new ImageIcon(getClass().getResource("/IMAGENES/ATRASSOBRA.gif")));
    }//GEN-LAST:event_atras1MouseExited

    private void ADELANTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADELANTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADELANTEActionPerformed

    private void adelante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelante1ActionPerformed
     AnimationClass ac= new AnimationClass();
     ac.jLabelXLeft(0, -1000, 5, 5, PUBLICIDAD);
     
     AnimationClass ac2= new AnimationClass();
     ac2.jLabelXLeft(1000, 0, 5, 5, PUBLICIDAD1);
    }//GEN-LAST:event_adelante1ActionPerformed

    private void adelante1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adelante1MouseEntered
     ADELANTE.setIcon(new ImageIcon(getClass().getResource("/IMAGENES/ATRASSOBRA2.gif")));
    }//GEN-LAST:event_adelante1MouseEntered

    private void adelante1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adelante1MouseExited
      ADELANTE.setIcon(new ImageIcon(getClass().getResource("/IMAGENES/ATRASSOBRA.gif")));
    }//GEN-LAST:event_adelante1MouseExited

    private void lOGIN11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lOGIN11ActionPerformed
       String usuario= CUADRO1.getText();
           String contraseña= String.valueOf(CUADRO2.getPassword());
            acceder(usuario, contraseña);
    }//GEN-LAST:event_lOGIN11ActionPerformed

    private void recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarActionPerformed
        this.recuperar.setVisible(false);

        this.b_usuario.setVisible(true);
        this.b_contraseña.setVisible(true);
    }//GEN-LAST:event_recuperarActionPerformed

    private void b_contraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_contraseñaMouseEntered
        this.recuperar.setVisible(false);

        this.b_usuario.setVisible(true);
        this.b_contraseña.setVisible(true);
    }//GEN-LAST:event_b_contraseñaMouseEntered

    private void b_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_contraseñaActionPerformed
//        this.contra.setVisible(true);
    }//GEN-LAST:event_b_contraseñaActionPerformed

    private void b_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_usuarioMouseEntered
        this.recuperar.setVisible(false);

        this.b_usuario.setVisible(true);
        this.b_contraseña.setVisible(true);
    }//GEN-LAST:event_b_usuarioMouseEntered

    private void b_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_usuarioActionPerformed
//        this.usuari.setVisible(true);
    }//GEN-LAST:event_b_usuarioActionPerformed

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        this.recuperar.setVisible(true);

        this.b_usuario.setVisible(false);
        this.b_contraseña.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
     xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
     Point point = MouseInfo.getPointerInfo().getLocation() ;
        setLocation(point.x - xx, point.y - yy)  ;  
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADELANTE;
    private javax.swing.JButton ATRAS;
    private org.edisoncor.gui.textField.TextField CUADRO1;
    private org.edisoncor.gui.passwordField.PasswordField CUADRO2;
    private javax.swing.JLabel PALO;
    private javax.swing.JLabel PALO1;
    private javax.swing.JLabel PRIMERFONDO;
    private javax.swing.JLabel PUBLICIDAD;
    private javax.swing.JLabel PUBLICIDAD1;
    private BOTON.adelante adelante1;
    private BOTON.atras atras1;
    private BOTON.BOTON bOTON1;
    private BOTON.BOTON_MINIMIZAR bOTON_MINIMIZAR1;
    public static BOTON.BOTON_CONTRASENA b_contraseña;
    public static BOTON.BOTON_USUARIO b_usuario;
    private javax.swing.JButton click;
    private javax.swing.JButton click2;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private BOTON.LOGIN1 lOGIN11;
    public static javax.swing.JPanel login;
    public static BOTON.BOTON_RECUPERAR recuperar;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
