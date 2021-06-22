
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class db {
    public static Connection connet_db(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SystemBilgisayar\\Downloads\\rent_a_car\\rent_a_car\\rentacardb.sqlite");
            return conn;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            return null; }
        
    }
    
}
