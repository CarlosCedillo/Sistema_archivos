package conexion;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionBD {
    static Connection conexion = null;
    static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    //static String urlBD = "C:\\Users\\CarlosCedillo\\Documents\\NetBeansProjects\\Fichero2.0\\src\\BD\\fichero2.0.accdb";
    static  File urlBD = new File("src/BD/fichero2.0.accdb");
    static String url = "jdbc:ucanaccess://"+urlBD;
    
    public static Connection obtenerConexion() {
        try {
            if(conexion == null){
                Class.forName(driver);
                conexion = DriverManager.getConnection(url);
//                JOptionPane.showMessageDialog(null, "Conexion establecida   ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            conexion = null;
        }
            return conexion;
    }
    
    public static Connection cerrarConexion() throws ClassNotFoundException {
        
        if( conexion != null ){
            conexion = null;
        }
        
        return conexion;
    }
    
//    public static void main(String[] args) {
//        Connection cn = ConexionBD.obtenerConexion();
//    }
}