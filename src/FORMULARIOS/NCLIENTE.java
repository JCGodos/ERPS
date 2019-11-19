/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORMULARIOS;

import CLASES.FUBconexion;

import com.sun.awt.AWTUtilities;
import java.awt.HeadlessException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author FRANK
 */
public class NCLIENTE extends javax.swing.JFrame {

    /**
     * Creates new form NCLIENTE
     */int xx,yy;
    
//    MENSAJEEXITO mensa=new MENSAJEEXITO();
    
     
     int limite= 8;
  int limite2=9;
    public NCLIENTE() {
        
        initComponents();
        
        
        this.tabladatos7();
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES/nueeeee.png")).getImage());
        Shape forma=new RoundRectangle2D.Double(0,0, this.getBounds().width, this.getBounds().height,30,30);
        AWTUtilities.setWindowShape(this,forma);
        
        this.setLocationRelativeTo(null);
        
        this.btnactualizar.setEnabled(false);
    }

     public void tabnumm2(){
      DefaultTableModel modeloo2 = (DefaultTableModel) tablaregistro.getModel();    
    int filass2 = modeloo2.getRowCount();
    hora3.setText(""+(filass2));
        
        }
    
    public void tabladatos7(){
   
                        this.x1.setEnabled(false);
                        this.x2.setEnabled(false);
                        this.x3.setEnabled(false);
                        this.x4.setEnabled(false);
                        this.x5.setEnabled(false);
                        this.x6.setEnabled(false);
                        
                        this.jXDatePicker2.setEnabled(false);

                        this.btnregistrar.setEnabled(false);

//            JTableHeader th;
//            th=jTable1.getTableHeader();
////           
////            th.setBackground(Color.red);
//            Font fuente= new Font("BLUE",Font.BOLD,12);
//            th.setFont(fuente);
            
    Connection FUBconectar=null;
    try {
           Class.forName("com.mysql.jdbc.Driver");
            FUBconectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/policlinico?zeroDateTimeBehavior=convertToNull","root", "llFRANK2017ll");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    try{
    DefaultTableModel mode=new DefaultTableModel();
    
    
            
    mode.addColumn("N°");
    mode.addColumn("Edad");
    mode.addColumn("Nombre");
    mode.addColumn("Apellido");
    mode.addColumn("Dni");
    mode.addColumn("Direccion");
    mode.addColumn("Telef-(Celular)");
    mode.addColumn("Fecha");
    tablaregistro.setModel(mode);
    
////////////     jTable1.setAutoResizeMode(JTable.ALLBITS);
   
//    JLabel cell=(JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    String []datos=new String[8];
    
        Statement st=FUBconectar.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM registronuevo");
        
//        jTable1.setDefaultRenderer(Object.class, new Imagenes_JTble());
//      FormatoTabla ft = new FormatoTabla(0);
//        jTable1.setDefaultRenderer (Object.class, (TableCellRenderer) ft);
//        jTable1.getColumnModel().getColumn(7).setMaxWidth(7);
        
        while (rs.next()) {
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
            datos[5]=rs.getString(6);
            datos[6]=rs.getString(7);
            datos[7]=rs.getString(8);
            
            mode.addRow(datos);
            
        }
    tablaregistro.setModel(mode);
        tabnumm2();
     TableColumnModel columnModel = tablaregistro.getColumnModel();
    columnModel.getColumn(0).setPreferredWidth(8);
    columnModel.getColumn(1).setPreferredWidth(25);
    columnModel.getColumn(2).setPreferredWidth(54);
    columnModel.getColumn(3).setPreferredWidth(54);
    columnModel.getColumn(4).setPreferredWidth(54);
    columnModel.getColumn(5).setPreferredWidth(100);
    columnModel.getColumn(6).setPreferredWidth(55);
    columnModel.getColumn(7).setPreferredWidth(55);
    
    
    }catch(SQLException ex){
        Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE,null, ex);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaregistro = new org.jdesktop.swingx.JXTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PALO = new javax.swing.JLabel();
        PALO1 = new javax.swing.JLabel();
        TRIANGULO = new javax.swing.JLabel();
        buscador = new org.edisoncor.gui.textField.TextField();
        jButton3 = new javax.swing.JButton();
        filtro = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        x1 = new org.edisoncor.gui.textField.TextField();
        x2 = new org.edisoncor.gui.textField.TextField();
        x3 = new javax.swing.JTextField();
        x4 = new org.edisoncor.gui.textField.TextField();
        x5 = new org.edisoncor.gui.textField.TextField();
        x6 = new org.edisoncor.gui.textField.TextField();
        panelNice16 = new org.edisoncor.gui.panel.PanelNice();
        btnactualizar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        panelNice18 = new org.edisoncor.gui.panel.PanelNice();
        btnregistrar = new javax.swing.JButton();
        panelNice19 = new org.edisoncor.gui.panel.PanelNice();
        nue = new javax.swing.JButton();
        panelNice6 = new org.edisoncor.gui.panel.PanelNice();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hora3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        den = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 173, 45));
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

        panelNice1.setBorderColor(new java.awt.Color(30, 30, 30));
        panelNice1.setLayout(null);

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Forte", 0, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        panelNice1.add(jLabel3);
        jLabel3.setBounds(460, 180, 280, 120);

        jLabel1.setFont(new java.awt.Font("DS-Digital", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO REGISTRO");
        panelNice1.add(jLabel1);
        jLabel1.setBounds(370, 40, 240, 25);

        tablaregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaregistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaregistro);

        panelNice1.add(jScrollPane1);
        jScrollPane1.setBounds(330, 330, 650, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelNice1.add(jButton1);
        jButton1.setBounds(900, 0, 40, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_Delete_32px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelNice1.add(jButton2);
        jButton2.setBounds(950, 0, 40, 40);

        PALO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/paloPublic.png"))); // NOI18N
        panelNice1.add(PALO);
        PALO.setBounds(1, 400, 1000, 10);

        PALO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/paloPublic.png"))); // NOI18N
        panelNice1.add(PALO1);
        PALO1.setBounds(1, 94, 1000, 10);

        TRIANGULO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/paloPublicTRUANGULO.png"))); // NOI18N
        panelNice1.add(TRIANGULO);
        TRIANGULO.setBounds(-190, 0, 1280, 100);

        buscador.setBackground(new java.awt.Color(255, 102, 0));
        buscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelNice1.add(buscador);
        buscador.setBounds(480, 250, 170, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar_2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelNice1.add(jButton3);
        jButton3.setBounds(670, 240, 40, 40);

        filtro.setBackground(new java.awt.Color(0, 0, 0));
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO", "NOMBRE", "APELLIDO", "DNI", "TELEFONO" }));
        panelNice1.add(filtro);
        filtro.setBounds(480, 220, 120, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText(" Fecha:");
        panelNice1.add(jLabel15);
        jLabel15.setBounds(80, 120, 60, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Edad:");
        panelNice1.add(jLabel10);
        jLabel10.setBounds(90, 180, 50, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Apellido:");
        panelNice1.add(jLabel12);
        jLabel12.setBounds(90, 240, 50, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("DNI:");
        panelNice1.add(jLabel11);
        jLabel11.setBounds(110, 270, 30, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Dirección:");
        panelNice1.add(jLabel13);
        jLabel13.setBounds(80, 300, 60, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText(" Tel-(Celular):");
        panelNice1.add(jLabel14);
        jLabel14.setBounds(60, 330, 80, 30);

        jXDatePicker2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jXDatePicker2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jXDatePicker2KeyTyped(evt);
            }
        });
        panelNice1.add(jXDatePicker2);
        jXDatePicker2.setBounds(160, 130, 110, 24);

        x1.setBackground(new java.awt.Color(30, 30, 30));
        x1.setForeground(new java.awt.Color(0, 153, 255));
        x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x1MouseClicked(evt);
            }
        });
        x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x1KeyTyped(evt);
            }
        });
        panelNice1.add(x1);
        x1.setBounds(160, 180, 150, 30);

        x2.setBackground(new java.awt.Color(30, 30, 30));
        x2.setForeground(new java.awt.Color(0, 153, 255));
        x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x2MouseClicked(evt);
            }
        });
        x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x2KeyTyped(evt);
            }
        });
        panelNice1.add(x2);
        x2.setBounds(160, 210, 150, 30);

        x3.setBackground(new java.awt.Color(30, 30, 30));
        x3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        x3.setForeground(new java.awt.Color(153, 153, 153));
        x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        x3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x3MouseClicked(evt);
            }
        });
        x3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x3KeyTyped(evt);
            }
        });
        panelNice1.add(x3);
        x3.setBounds(160, 240, 150, 30);

        x4.setBackground(new java.awt.Color(30, 30, 30));
        x4.setForeground(new java.awt.Color(0, 153, 255));
        x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x4MouseClicked(evt);
            }
        });
        x4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x4KeyTyped(evt);
            }
        });
        panelNice1.add(x4);
        x4.setBounds(160, 270, 150, 30);

        x5.setBackground(new java.awt.Color(30, 30, 30));
        x5.setForeground(new java.awt.Color(0, 153, 255));
        x5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x5MouseClicked(evt);
            }
        });
        x5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x5KeyTyped(evt);
            }
        });
        panelNice1.add(x5);
        x5.setBounds(160, 300, 150, 30);

        x6.setBackground(new java.awt.Color(30, 30, 30));
        x6.setForeground(new java.awt.Color(0, 153, 255));
        x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x6MouseClicked(evt);
            }
        });
        x6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x6KeyTyped(evt);
            }
        });
        panelNice1.add(x6);
        x6.setBounds(160, 330, 150, 30);

        panelNice16.setBackground(new java.awt.Color(30, 30, 30));
        panelNice16.setBorderColor(new java.awt.Color(30, 30, 30));
        panelNice16.setLayout(null);

        btnactualizar.setBackground(new java.awt.Color(0, 51, 204));
        btnactualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 102, 0));
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/modi_1.png"))); // NOI18N
        btnactualizar.setText("Guardar");
        btnactualizar.setBorder(null);
        btnactualizar.setBorderPainted(false);
        btnactualizar.setContentAreaFilled(false);
        btnactualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/modi_2.png"))); // NOI18N
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        panelNice16.add(btnactualizar);
        btnactualizar.setBounds(0, 0, 90, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("    Modificado");
        panelNice16.add(jLabel22);
        jLabel22.setBounds(20, 20, 90, 20);

        panelNice1.add(panelNice16);
        panelNice16.setBounds(321, 263, 110, 40);

        panelNice18.setBackground(new java.awt.Color(30, 30, 30));
        panelNice18.setBorderColor(new java.awt.Color(30, 30, 30));
        panelNice18.setLayout(null);

        btnregistrar.setBackground(new java.awt.Color(0, 51, 204));
        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(255, 102, 0));
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/GuardarTodo.png"))); // NOI18N
        btnregistrar.setText("Guardar");
        btnregistrar.setBorder(null);
        btnregistrar.setBorderPainted(false);
        btnregistrar.setContentAreaFilled(false);
        btnregistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/guardar_2_1.png"))); // NOI18N
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        btnregistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnregistrarKeyTyped(evt);
            }
        });
        panelNice18.add(btnregistrar);
        btnregistrar.setBounds(0, 0, 90, 40);

        panelNice1.add(panelNice18);
        panelNice18.setBounds(321, 181, 110, 40);

        panelNice19.setBackground(new java.awt.Color(30, 30, 30));
        panelNice19.setBorderColor(new java.awt.Color(30, 30, 30));
        panelNice19.setLayout(null);

        nue.setBackground(new java.awt.Color(0, 51, 204));
        nue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nue.setForeground(new java.awt.Color(255, 102, 0));
        nue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar_1.png"))); // NOI18N
        nue.setText("Nuevo");
        nue.setBorder(null);
        nue.setBorderPainted(false);
        nue.setContentAreaFilled(false);
        nue.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar_2.png"))); // NOI18N
        nue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueActionPerformed(evt);
            }
        });
        panelNice19.add(nue);
        nue.setBounds(0, 0, 90, 40);

        panelNice1.add(panelNice19);
        panelNice19.setBounds(321, 222, 110, 40);

        panelNice6.setBackground(new java.awt.Color(0, 153, 255));
        panelNice6.setBorderColor(new java.awt.Color(0, 153, 255));
        panelNice6.setLayout(null);
        panelNice1.add(panelNice6);
        panelNice6.setBounds(320, 180, 112, 124);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Nombre:");
        panelNice1.add(jLabel16);
        jLabel16.setBounds(90, 210, 50, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");
        panelNice1.add(jLabel2);
        jLabel2.setBounds(270, 130, 40, 30);

        hora3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hora3.setForeground(new java.awt.Color(0, 255, 0));
        hora3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora3.setText("0");
        panelNice1.add(hora3);
        hora3.setBounds(840, 280, 40, 40);

        jButton4.setFont(new java.awt.Font("DS-Digital", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/imprimir_1.png"))); // NOI18N
        jButton4.setText("IMPRIMIR");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelNice1.add(jButton4);
        jButton4.setBounds(793, 183, 150, 60);
        panelNice1.add(den);
        den.setBounds(520, 120, 110, 20);

        jPanel1.add(panelNice1);
        panelNice1.setBounds(2, 2, 996, 496);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int result=JOptionPane.showConfirmDialog(this, "Desea Cerrar El Registro??","CERRAR REGISTRO",dialogButton);

            if (result==0) {
                this.dispose();
            }
        }catch(Exception o){
            JOptionPane.showMessageDialog(null,"error");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //██████████
        Connection cone=null;

        ImageIcon ii = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone=DriverManager.getConnection("jdbc:mysql://localhost:3306/policlinico?zeroDateTimeBehavior=convertToNull","root", "llFRANK2017ll");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception ex){}

        if (!buscador.getText().equals("")) {

            int columnaABuscar = 0;
            if (filtro.getSelectedItem() == "CODIGO") {
                String codigo=this.buscador.getText();
                try{

                    DefaultTableModel moj=new DefaultTableModel();
                    moj.addColumn("N°");
                    moj.addColumn("Edad");
                    moj.addColumn("Nombre");
                    moj.addColumn("Apellido");
                    moj.addColumn("Dni");
                    moj.addColumn("Direccion");
                    moj.addColumn("Telef-(Celular)");
                    moj.addColumn("Fecha");
                    tablaregistro.setModel(moj);
                    String []datee=new String[8];

                    Statement s=cone.createStatement();
                    ResultSet rs=s.executeQuery(" SELECT codigo, edad, nombre, apellido, dni, direccion, telef, fecha FROM registronuevo WHERE codigo='"+codigo+"'");

                    while (rs.next()) {
                        datee[0]=rs.getString(1);
                        datee[1]=rs.getString(2);
                        datee[2]=rs.getString(3);
                        datee[3]=rs.getString(4);
                        datee[4]=rs.getString(5);
                        datee[5]=rs.getString(6);
                        datee[6]=rs.getString(7);
                        datee[7]=rs.getString(8);
                        moj.addRow(datee);

                    }

                    tablaregistro.setModel(moj);

                    TableColumnModel columnModel = tablaregistro.getColumnModel();
                    columnModel.getColumn(0).setPreferredWidth(8);
                    columnModel.getColumn(1).setPreferredWidth(25);
                    columnModel.getColumn(2).setPreferredWidth(54);
                    columnModel.getColumn(3).setPreferredWidth(54);
                    columnModel.getColumn(4).setPreferredWidth(54);
                    columnModel.getColumn(5).setPreferredWidth(100);
                    columnModel.getColumn(6).setPreferredWidth(55);
                    columnModel.getColumn(7).setPreferredWidth(55);

                }catch(SQLException ex){
                    Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception ex){}

            }

            if (filtro.getSelectedItem().toString() == "NOMBRE") {
                String nombre=this.buscador.getText();
                try{

                    DefaultTableModel moj2=new DefaultTableModel();
                    moj2.addColumn("N°");
                    moj2.addColumn("Edad");
                    moj2.addColumn("Nombre");
                    moj2.addColumn("Apellido");
                    moj2.addColumn("Dni");
                    moj2.addColumn("Direccion");
                    moj2.addColumn("Telef-(Celular)");
                    moj2.addColumn("Fecha");
                    tablaregistro.setModel(moj2);
                    String []datee2=new String[8];

                    Statement s=cone.createStatement();
                    ResultSet rs=s.executeQuery("SELECT codigo, edad, nombre, apellido, dni, direccion, telef, fecha FROM registronuevo WHERE nombre='"+nombre+"'");

                    while (rs.next()) {
                        datee2[0]=rs.getString(1);
                        datee2[1]=rs.getString(2);
                        datee2[2]=rs.getString(3);
                        datee2[3]=rs.getString(4);
                        datee2[4]=rs.getString(5);
                        datee2[5]=rs.getString(6);
                        datee2[6]=rs.getString(7);
                        datee2[7]=rs.getString(8);
                        moj2.addRow(datee2);

                    }
                    tablaregistro.setModel(moj2);

                    TableColumnModel columnModel = tablaregistro.getColumnModel();
                    columnModel.getColumn(0).setPreferredWidth(8);
                    columnModel.getColumn(1).setPreferredWidth(25);
                    columnModel.getColumn(2).setPreferredWidth(54);
                    columnModel.getColumn(3).setPreferredWidth(54);
                    columnModel.getColumn(4).setPreferredWidth(54);
                    columnModel.getColumn(5).setPreferredWidth(100);
                    columnModel.getColumn(6).setPreferredWidth(55);
                    columnModel.getColumn(7).setPreferredWidth(55);

                }catch(SQLException ex){
                    Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception ex){}
            }

            if (filtro.getSelectedItem() == "APELLIDO") {
                String apellido=this.buscador.getText();
                try{

                    DefaultTableModel moj3=new DefaultTableModel();
                    moj3.addColumn("N°");
                    moj3.addColumn("Edad");
                    moj3.addColumn("Nombre");
                    moj3.addColumn("Apellido");
                    moj3.addColumn("Dni");
                    moj3.addColumn("Direccion");
                    moj3.addColumn("Telef-(Celular)");
                    moj3.addColumn("Fecha");
                    tablaregistro.setModel(moj3);
                    String []datee3=new String[10];

                    Statement s=cone.createStatement();
                    ResultSet rs=s.executeQuery("SELECT codigo, edad, nombre, apellido, dni, direccion, telef, fecha FROM registronuevo WHERE apellido='"+apellido+"'");

                    while (rs.next()) {

                        datee3[0]=rs.getString(1);
                        datee3[1]=rs.getString(2);
                        datee3[2]=rs.getString(3);
                        datee3[3]=rs.getString(4);
                        datee3[4]=rs.getString(5);
                        datee3[5]=rs.getString(6);
                        datee3[6]=rs.getString(7);
                        datee3[7]=rs.getString(8);
                        moj3.addRow(datee3);

                    }
                    tablaregistro.setModel(moj3);

                    TableColumnModel columnModel = tablaregistro.getColumnModel();
                    columnModel.getColumn(0).setPreferredWidth(8);
                    columnModel.getColumn(1).setPreferredWidth(25);
                    columnModel.getColumn(2).setPreferredWidth(54);
                    columnModel.getColumn(3).setPreferredWidth(54);
                    columnModel.getColumn(4).setPreferredWidth(54);
                    columnModel.getColumn(5).setPreferredWidth(100);
                    columnModel.getColumn(6).setPreferredWidth(55);
                    columnModel.getColumn(7).setPreferredWidth(55);

                }catch(SQLException ex){
                    Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception ex){}
            }
            if (filtro.getSelectedItem() == "DNI") {
                String dni=this.buscador.getText();
                try{

                    DefaultTableModel moj4=new DefaultTableModel();
                    moj4.addColumn("N°");
                    moj4.addColumn("Edad");
                    moj4.addColumn("Nombre");
                    moj4.addColumn("Apellido");
                    moj4.addColumn("Dni");
                    moj4.addColumn("Direccion");
                    moj4.addColumn("Telef-(Celular)");
                    moj4.addColumn("Fecha");
                    tablaregistro.setModel(moj4);
                    String []datee4=new String[8];

                    Statement s=cone.createStatement();
                    ResultSet rs=s.executeQuery("SELECT codigo, edad, nombre, apellido, dni, direccion, telef, fecha FROM registronuevo WHERE dni='"+dni+"'");

                    while (rs.next()) {

                        datee4[0]=rs.getString(1);
                        datee4[0]=rs.getString(1);
                        datee4[1]=rs.getString(2);
                        datee4[2]=rs.getString(3);
                        datee4[3]=rs.getString(4);
                        datee4[4]=rs.getString(5);
                        datee4[5]=rs.getString(6);
                        datee4[6]=rs.getString(7);
                        datee4[7]=rs.getString(8);
                        moj4.addRow(datee4);

                    }
                    tablaregistro.setModel(moj4);

                    TableColumnModel columnModel = tablaregistro.getColumnModel();
                    columnModel.getColumn(0).setPreferredWidth(8);
                    columnModel.getColumn(1).setPreferredWidth(25);
                    columnModel.getColumn(2).setPreferredWidth(54);
                    columnModel.getColumn(3).setPreferredWidth(54);
                    columnModel.getColumn(4).setPreferredWidth(54);
                    columnModel.getColumn(5).setPreferredWidth(100);
                    columnModel.getColumn(6).setPreferredWidth(55);
                    columnModel.getColumn(7).setPreferredWidth(55);

                }catch(SQLException ex){
                    Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception ex){}
            }

            if (filtro.getSelectedItem() == "TELEFONO") {
                String telefono=this.buscador.getText();
                try{

                    DefaultTableModel moj5=new DefaultTableModel();
                    moj5.addColumn("N°");
                    moj5.addColumn("Edad");
                    moj5.addColumn("Nombre");
                    moj5.addColumn("Apellido");
                    moj5.addColumn("Dni");
                    moj5.addColumn("Direccion");
                    moj5.addColumn("Telef-(Celular)");
                    moj5.addColumn("Fecha");

                    tablaregistro.setModel(moj5);
                    String []datee5=new String[8];

                    Statement s=cone.createStatement();
                    ResultSet rs=s.executeQuery("SELECT codigo, edad, nombre, apellido, dni, direccion, telef, fecha FROM registronuevo WHERE telef='"+telefono+"'");

                    while (rs.next()) {

                        datee5[0]=rs.getString(1);
                        datee5[1]=rs.getString(2);
                        datee5[2]=rs.getString(3);
                        datee5[3]=rs.getString(4);
                        datee5[4]=rs.getString(5);
                        datee5[5]=rs.getString(6);
                        datee5[6]=rs.getString(7);
                        datee5[7]=rs.getString(8);

                        moj5.addRow(datee5);

                    }

                    tablaregistro.setModel(moj5);

                    TableColumnModel columnModel = tablaregistro.getColumnModel();
                    columnModel.getColumn(0).setPreferredWidth(8);
                    columnModel.getColumn(1).setPreferredWidth(25);
                    columnModel.getColumn(2).setPreferredWidth(54);
                    columnModel.getColumn(3).setPreferredWidth(54);
                    columnModel.getColumn(4).setPreferredWidth(54);
                    columnModel.getColumn(5).setPreferredWidth(100);
                    columnModel.getColumn(6).setPreferredWidth(55);
                    columnModel.getColumn(7).setPreferredWidth(55);

                }catch(SQLException ex){
                    Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception ex){}
            }

        }else{

            tabladatos7();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jXDatePicker2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXDatePicker2KeyTyped

    }//GEN-LAST:event_jXDatePicker2KeyTyped

    private void x1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseClicked
//        mensa.dispose();
    }//GEN-LAST:event_x1MouseClicked

    private void x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyTyped

        if (x1.getText().length()== limite2) evt.consume();
        char chipi = evt.getKeyChar();
        if (((chipi < '0') || (chipi > '9')) && (chipi != '-')) {
            evt.consume();

        }

        int c = evt.getKeyChar();
        if ( c == 10 )
        {
            x2.requestFocus();
        }
    }//GEN-LAST:event_x1KeyTyped

    private void x2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x2MouseClicked
//        mensa.dispose();
    }//GEN-LAST:event_x2MouseClicked

    private void x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2KeyTyped

        if (x2.getText().length()== limite2) evt.consume();
        char chipi = evt.getKeyChar();
        if (((chipi < 'a') || (chipi > 'z'))&&((chipi < 'A') || (chipi > 'Z'))) {
            evt.consume();

        }

        int c = evt.getKeyChar();
        if ( c == 10 )
        {
            x3.requestFocus();
        }
    }//GEN-LAST:event_x2KeyTyped

    private void x3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x3MouseClicked
//        mensa.dispose();
    }//GEN-LAST:event_x3MouseClicked

    private void x3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x3KeyTyped
        if (x3.getText().length()== limite2) evt.consume();
        char chipi = evt.getKeyChar();
        if (((chipi < 'a') || (chipi > 'z'))&&((chipi < 'A') || (chipi > 'Z'))) {
            evt.consume();

        }

        int c = evt.getKeyChar();
        if ( c == 10 )
        {
            x4.requestFocus();
        }
    }//GEN-LAST:event_x3KeyTyped

    private void x4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x4MouseClicked
//        mensa.dispose();
    }//GEN-LAST:event_x4MouseClicked

    private void x4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x4KeyTyped

        if (x4.getText().length()== limite2) evt.consume();
        char chipi = evt.getKeyChar();
        if (((chipi < '0') || (chipi > '9')) && (chipi != '-')) {
            evt.consume();

        }

        int c = evt.getKeyChar();
        if ( c == 10 )
        {
            x5.requestFocus();
        }
    }//GEN-LAST:event_x4KeyTyped

    private void x5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x5MouseClicked
//        mensa.dispose();
    }//GEN-LAST:event_x5MouseClicked

    private void x5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x5KeyTyped
        char chipi = evt.getKeyChar();
        if ( ((chipi < '0') || (chipi > '9'))&&((chipi < 'a') || (chipi > 'z')) && (chipi != '.')&& (chipi != ' ')&&(chipi !='#')&&(chipi !='_')&&(chipi !='@')&&((chipi < 'A') || (chipi > 'Z'))) {
            evt.consume();

        }

        int c = evt.getKeyChar();
        if ( c == 10 )
        {
            x6.requestFocus();
        }
    }//GEN-LAST:event_x5KeyTyped

    private void x6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_x6MouseClicked

    private void x6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x6KeyTyped
        if (x5.getText().length()== limite2) evt.consume();
        char chipi = evt.getKeyChar();
        if (((chipi < '0') || (chipi > '9')) && (chipi != '-')) {
            evt.consume();

        }

        int c = evt.getKeyChar();
        if ( c == 10 )
        {
            btnregistrar.requestFocus();
        }
    }//GEN-LAST:event_x6KeyTyped

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed

        //int mod = JOptionPane.showConfirmDialog(null,"¿Estas Seguro de Modificar el registro"+jLabel16.getText()+"??");

        //if (mod==JOptionPane.YES_OPTION) {

            //buscador.setEnabled(false);

            Connection cone=null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cone=DriverManager.getConnection("jdbc:mysql://localhost:3306/policlinico?zeroDateTimeBehavior=convertToNull","root", "llFRANK2017ll");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex){
                Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{

                DefaultTableModel rata= (DefaultTableModel) tablaregistro.getModel();
                int mod = JOptionPane.showConfirmDialog(null,"¿Estas Seguro de Modificar el registro ► "+(jLabel2.getText()));

                if (mod==JOptionPane.YES_OPTION) {
                    String sql="UPDATE registronuevo SET codigo=?,"
                    +"edad=?,"
                    +"nombre=?,"
                    +"apellido=?,"
                    +"dni=?,"
                    +"direccion=?,"
                    +"telef=?,"
                    +"fecha=?"

                    +"WHERE codigo='"+jLabel2.getText()+"'";
                    PreparedStatement pst=cone.prepareStatement(sql);

                    pst.setString(1,jLabel2.getText());
                    //pst.setString(1,jtxt1.getText());
                    pst.setString(2,x1.getText());
                    pst.setString(3,x2.getText());
                    pst.setString(4,x3.getText());
                    pst.setString(5,x4.getText());
                    pst.setString(6,x5.getText());
                    pst.setString(7,x6.getText());
                    //pst.setString(8,jTextField7.getText());

                    String fechaString=null;
                    Date fecha=jXDatePicker2.getDate();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                    fechaString=sdf.format(fecha);
                    pst.setString(8, fechaString);

                    int ins=350;
                    int monto=0;
                    int result=0;
                    int mont=0;
                    int menos=0;
                    int nu=0;
                    int ca;

                    int n=pst.executeUpdate();
                    if(n>0){
                        buscador.setText("");
//                        mensa.setVisible(true);
//                        mensa.te.setText("MODIFICACION EXITOSA");

                        this.btnregistrar.setEnabled(false);
                        this.btnactualizar.setEnabled(false);

                        this.filtro.setEnabled(false);
                        this.x1.setEnabled(false);
                        this.x2.setEnabled(false);
                        this.x3.setEnabled(false);
                        this.x4.setEnabled(false);
                        this.x5.setEnabled(false);
                        this.x6.setEnabled(false);
                        this.jXDatePicker2.setEnabled(false);

                        tabladatos7();
                    }else{

//                        mensa.setVisible(true);
//                        mensa.te.setText("DATOS INCORRECTOS");

                    }
                }
            }catch (SQLException ex) {
                Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
            }
            // }
        // }
        // }
        // }

        // }
        // }
        // }
        // }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

        try {
            try{

                Connection FUBconectar=null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    FUBconectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/policlinico?zeroDateTimeBehavior=convertToNull","root", "llFRANK2017ll");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex){
                    Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (x1.getText().equals("")||
                    x2.getText().equals("")||
                    x3.getText().equals("")||
                    x4.getText().equals("")||
                    x5.getText().equals("")||
                    x6.getText().equals("")||

                    jXDatePicker2.getDate().equals("")) {
//                    mensa.setVisible(true);
//                    mensa.te.setText("DATOS INCOMPLETOS");
                    //                JOptionPane.showMessageDialog(null,"DATOS INCOMPLETOS");

                }

                else{
                    String insertar="INSERT INTO registronuevo(codigo, edad, nombre, apellido, dni, direccion, telef, fecha) VALUES(?,?,?,?,?,?,?,?)";
                    PreparedStatement pst=FUBconectar.prepareStatement(insertar);

                    pst.setString(1, jLabel2.getText());
                    // pst.setString(1, jtxt1.getText());
                    pst.setString(2, x1.getText());
                    pst.setString(3, x2.getText());
                    pst.setString(4, x3.getText());
                    pst.setString(5, x4.getText());
                    pst.setString(6, x5.getText());
                    pst.setString(7, x6.getText());
                    String fechaString=null;
                    Date fecha=jXDatePicker2.getDate();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                    fechaString=sdf.format(fecha);
                    pst.setString(8, fechaString);

                    //
                    //        FileInputStream conver = new FileInputStream(archivofoto);
                    //        pst.setBlob(9, conver, archivofoto.length());

                    //     FileInputStream fis = null;
                    //

                    int canpen;
                    int ins;
                    int monto=0;
                    int result;

                    int i=pst.executeUpdate();
                    if(i>0){
//                        mensa.setVisible(true);
//                        mensa.te.setText("GUARDADO CORRECTAMENTE");
                        tabladatos7();

                        this.x1.setEnabled(false);
                        this.x2.setEnabled(false);
                        this.x3.setEnabled(false);
                        this.x4.setEnabled(false);
                        this.x5.setEnabled(false);
                        this.x6.setEnabled(false);

                        this.jXDatePicker2.setEnabled(false);

                        this.btnregistrar.setEnabled(false);

                        this.jLabel2.setText("");
                        this.x1.setText("");
                        this.x2.setText("");
                        this.x3.setText("");
                        this.x4.setText("");
                        this.x5.setText("");
                        this.x6.setText("");

                    }
                }
            } catch(SQLException ex){

//                mensa.setVisible(true);
//                mensa.te.setText("REGISTRO YA EXISTE");
            }

        } catch (Exception eRT) {

//            mensa.setVisible(true);
//            mensa.te.setText("SELECCIONE FECHA");

        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnregistrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnregistrarKeyTyped
        int c = evt.getKeyChar();
        if ( c == 10 )
        {
            btnregistrar.doClick();
            // Entrar.requestFocus();
        }
    }//GEN-LAST:event_btnregistrarKeyTyped

    private void nueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueActionPerformed

        //inicializar_combo()
        //                Object aux=registro_nuevo;
        //
        //        jComboBox1.insertElement(0,aux);
        filtro.setSelectedIndex(0);
        //        tabnumm3();
        try{

            ResultSet topal;

            int j=0;
            FUBconexion cone=new FUBconexion();
            String cad1="select * from registronuevo order by codigo";
            topal=cone.consultar(cad1);
            if(topal.next()==true){
                topal.last();
                int codito;
                int valor;
                String resultado;
                codito=(Integer.parseInt(topal.getString(1))+1);
                //                valor=Integer.parseInt(codito)+1;
                //                //String ceros = "";

                //
                //                int cantidad = codito.length();

                if (codito >= 1)
                {
                    //                    j=(codito)+1;

                    //Image icono =(getToolkit().getImage(jTextField6.getText())).getScaledInstance(
                        //                                              jLabel7.getWidth(),
                        //                                              jLabel7.getHeight(),
                        //                                              Image.SCALE_DEFAULT);
                    //
                    //                    jLabel3.setEnabled(true);
                    //                    jLabel7.setEnabled(true);

                    //       jLabel7.setIcon(new ImageIcon(getClass().getResource("/IMA_MALO/oscu.jpg")));

                    jLabel2.setText(""+codito);
                    //jtxt1.setVisible(false);

                    //                    jLabel19.setText("Pagó:");
                    //
                    //                    buscador.setText("");
                    jXDatePicker2.setEditable(true);
                    x3.setEditable(true);
                    x6.setText("");
                    x1.setText("");
                    x2.setText("");
                    x3.setText("");
                    //                    x3.setForeground(Color.CYAN);
                    x4.setText("");
                    x5.setText("");

                    //                    this.filtro.setEnabled(true);
                    this.x1.setEnabled(true);
                    this.x2.setEnabled(true);
                    this.x3.setEnabled(true);
                    this.x4.setEnabled(true);
                    this.x5.setEnabled(true);
                    this.x6.setEnabled(true);

                    this.jXDatePicker2.setEnabled(true);

                    this.btnactualizar.setEnabled(false);
                    this.btnregistrar.setEnabled(true);

                    //this.ventanaeditar.setVisible(true);

                }

            }else{
                jLabel2.setText("1");
                //jtxt1.setVisible(false);
                //this.ventanaeditar.setVisible(true);
                //                this.buttonCircle1.setEnabled(true);
                //                this.filtro.setEnabled(true);
                this.x1.setEnabled(true);
                this.x2.setEnabled(true);
                this.x3.setEnabled(true);
                this.x4.setEnabled(true);
                this.x5.setEnabled(true);
                this.x6.setEnabled(true);
                this.jXDatePicker2.setEnabled(true);
                //                this.x7.setEnabled(true);
                //                can.setVisible(false);

                this.btnregistrar.setEnabled(true);

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_nueActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
     Point point = MouseInfo.getPointerInfo().getLocation() ;
        setLocation(point.x - xx, point.y - yy)  ;  
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//███████ CON  PARAMETROS

//int a= JOptionPane.showConfirmDialog(null, "desea imprimir??","IMPRIMIR",JOptionPane.YES_NO_OPTION);
//        if (a==JOptionPane.YES_OPTION) {
//            try {
//                int den2;
//               den2=Integer.parseInt(den.getText());
//            Connection cn=null;    
//            ResultSet rs;   
//                String url="com.mysql.jdbc.Driver";
//            Class.forName(url).newInstance();
//            String ruta;
//            ruta = "jdbc:mysql://localhost:3306/policlinico?zeroDateTimeBehavior=convertToNull";
//            cn=DriverManager.getConnection(ruta,"root","llFRANK2017ll");
//            
//                String rutainforme="F:\\Trabajo • Programacion\\Programas\\POLICLINICO\\src\\REPORTE\\registronuevo2.jasper";
//           Map parametros= new HashMap();
//            parametros.put("dnipara",den2);
//            
//            JasperPrint informe=JasperFillManager.fillReport(rutainforme, parametros, cn);
//            JasperViewer ventanavisor = new JasperViewer(informe, false);
//            ventanavisor.setTitle("Imprecion");
//            ventanavisor.setVisible(true);
//            
//            } catch (Exception e) {
//            }
//        
        
//        }


//███████ SIN PARAMETROS

            try {
//                int den2;
//               den2=Integer.parseInt(den.getText());
String logotipo="/REPORTE/po.png";
            Connection cn=null;    
            ResultSet rs;   
                String url="com.mysql.jdbc.Driver";
            Class.forName(url).newInstance();
            String ruta;
            ruta = "jdbc:mysql://localhost:3306/policlinico?zeroDateTimeBehavior=convertToNull";
            cn=DriverManager.getConnection(ruta,"root","llFRANK2017ll");
            
                String rutainforme="F:\\Trabajo • Programacion\\Programas\\POLICLINICO\\src\\REPORTE\\registronuevo2.jasper";
           Map parametros= new HashMap();
            parametros.put("logo",logotipo);
            
            JasperPrint informe=JasperFillManager.fillReport(rutainforme, null, cn);
            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setTitle("Imprecion");
            ventanavisor.setVisible(true);
            
            } catch (Exception e) {
            }

//███████
        
        
        
        
//       Connection cn=null;
//        ResultSet rs;
//        Statement st;
//        String dni;
//        PreparedStatement pst;
//        JasperReport jr = null;
//        try{
//            String url="com.mysql.jdbc.Driver";
//            Class.forName(url).newInstance();
//            String ruta;
//
//            ruta = "jdbc:mysql://localhost:3306/policlinico?zeroDateTimeBehavior=convertToNull";
//            cn=DriverManager.getConnection(ruta,"root","llFRANK2017ll");
//
//            
//    
//            st=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.FETCH_FORWARD);
//            //String rutaInforme = "C:\\Users\\ASSI\\Documents\\NetBeansProjects\\encuesta\\src\\reportes\\r_pruebapot.jasper";
//            //String rutaInforme = "src\\reportes\\r_pruebapot.jasper";
//            URL in = this.getClass().getResource("/REPORTE/registronuevo.jasper");
//            jr= (JasperReport) JRLoader.loadObject(in);
//            Map parametros = new HashMap();
//////            parametros.clear();
//            parametros.put("dnipara",den.getText());
//            
////            parametros.put(("dni2"), (2342));
//            JasperPrint informe = JasperFillManager.fillReport(jr, null, cn);
//            JasperViewer ventanavisor = new JasperViewer(informe, false);
//            
//            
//            ventanavisor.setTitle("reporte");
//            ventanavisor.setVisible(true);
//        } catch (HeadlessException | JRException e){
//            JOptionPane.showMessageDialog(null,e.getMessage());
//
//        } catch (SQLException e) {
//            Logger.getLogger(FUBconexion.class.getName()).log(Level.SEVERE,null,e);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(NCLIENTE.class.getName()).log(Level.SEVERE, null, ex);
//        }

      
        
        
////                    try {
////                        conexion cone=new conexion();
////                        cone.reporteEmpleado();
////                    } catch (JRException e) {
////                        Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,e);
////                    }catch (SQLException e) {
////                        Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,e);
////                    }
//        //Crea y devuelve un printerjob que se asocia con la impresora predeterminada
//        //del sistema, si no hay, retorna NULL
//        PrinterJob printerJob = PrinterJob.getPrinterJob();
//        //Se pasa la instancia del JFrame al PrinterJob
//        //        printerJob.setPrintable(this);
//        //muestra ventana de dialogo para imprimir
//        if ( printerJob.printDialog())
//        {
//            try {
//                printerJob.print();
//            } catch (PrinterException ex) {
//                System.out.println("Error:" + ex);
//            }
//        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaregistroMouseClicked
     DefaultTableModel productos= (DefaultTableModel) tablaregistro.getModel();
    den.setText(productos.getValueAt(tablaregistro.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tablaregistroMouseClicked

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
            java.util.logging.Logger.getLogger(NCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NCLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NCLIENTE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel PALO;
    public static javax.swing.JLabel PALO1;
    public static javax.swing.JLabel TRIANGULO;
    public static javax.swing.JButton btnactualizar;
    public static javax.swing.JButton btnregistrar;
    public static org.edisoncor.gui.textField.TextField buscador;
    public static javax.swing.JTextField den;
    public static javax.swing.JComboBox<String> filtro;
    public static javax.swing.JLabel hora3;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    public static javax.swing.JButton nue;
    public static org.edisoncor.gui.panel.PanelNice panelNice1;
    public static org.edisoncor.gui.panel.PanelNice panelNice16;
    public static org.edisoncor.gui.panel.PanelNice panelNice18;
    public static org.edisoncor.gui.panel.PanelNice panelNice19;
    public static org.edisoncor.gui.panel.PanelNice panelNice6;
    public static org.jdesktop.swingx.JXTable tablaregistro;
    public static org.edisoncor.gui.textField.TextField x1;
    public static org.edisoncor.gui.textField.TextField x2;
    public static javax.swing.JTextField x3;
    public static org.edisoncor.gui.textField.TextField x4;
    public static org.edisoncor.gui.textField.TextField x5;
    public static org.edisoncor.gui.textField.TextField x6;
    // End of variables declaration//GEN-END:variables
}
