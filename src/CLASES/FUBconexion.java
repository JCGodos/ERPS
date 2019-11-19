/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Frank
 */
public class FUBconexion {
    Connection cn=null;
    ResultSet rs;
    Statement st;
    PreparedStatement pst;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }
    
    
    
    public FUBconexion(){
        try {
            //System.out.println("conexion exitosa");
    String url="com.mysql.jdbc.Driver";
        Class.forName(url).newInstance();
        String ruta;
        
            ruta = "jdbc:mysql://localhost:3306/jc?zeroDateTimeBehavior=convertToNull";
        cn=DriverManager.getConnection(ruta,"root","llFRANK2017ll");

        
          
        st=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.FETCH_FORWARD);
        
         } catch (java.lang.NullPointerException | ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
         
//        }catch (ClassNotFoundException e) {
//       e.printStackTrace();
    }
    
    }
    public ResultSet consultar(String sql){
        try {
            rs=st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    public void ejecutar(String sql){
        try {
            pst=cn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
    
    
    public  ImageIcon getFoto(String id)
    {
    String sql="select foto from tabla_cliente where codigo="+id;
    ImageIcon ii=null;
    InputStream is=null;
    try {
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        if (rs.next()) {
           is=rs.getBinaryStream(9);
           BufferedImage bi=ImageIO.read(is);
           ii=new ImageIcon(bi);
        }
        
                
    }catch(SQLException e){
            e.printStackTrace();
}catch(IOException exx){
            exx.printStackTrace();
}
    return ii;
    }





  public ResultSet consultarLogin(String sql){
        try {
            rs=st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
  
public ArrayList<String> consultaLogin(String seleccion) throws SQLException {//Retornamos un ArrayList para tratarlo
//en el JComboBox
PreparedStatement ps = cn.prepareStatement(seleccion);
 
ArrayList<String> ls = new ArrayList<String>();
 
ResultSet rss = ps.executeQuery();
 
while(rss.next()){
 
ls.add(rss.getString("usuario,contraseña"));//nombre es el campo de la base de datos
//Metemos el resultado de la tabla en el ArrayList
}
return ls;
}


public void reporteEmpleado() throws JRException,SQLException{
    try{
JasperReport report=null;
report=JasperCompileManager.compileReport("F:\\Trabajo • Programacion\\Programas\\POLICLINICO\\src\\REPORTE\\registronuevo.jrxml");
JasperPrint im=JasperFillManager.fillReport(report,null,cn);
//JasperPrint im=JasperFillManager.fillReport(report,null,cone);
JasperViewer ver=new JasperViewer(im,false);
ver.setTitle("Clientes");
ver.setVisible(true);
}catch(JRException ex){
    Logger.getLogger(FUBconexion.class.getName()).log(Level.SEVERE,null,ex);
}
}


 
}
