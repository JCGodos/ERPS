/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASES;

/**
 *
 * @author Frank
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class FUBconectar {
    private static Connection conn ;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user= "FUB";
    private static final String password= "";
    private static final String url="jdbc:mysql://localhost:3306/erperp?zeroDateTimeBehavior=convertToNull";

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public FUBconectar(){
conn= null;
    try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            if(conn !=null){
                System.out.println("Conexion Establecida..");
            }
    }
    catch(ClassNotFoundException | SQLException e){
    
        System.out.println("Error al conectar" +e);
        }

    }
    
        public Connection getConnection(){
    
        return conn;
    }
    
    public void desconectar(){
        conn=null;
        if (conn==null){
            System.out.println("Conexion terminada..");
        }
        
        
    }
    
    
}
