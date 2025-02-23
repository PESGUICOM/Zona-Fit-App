package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        //Creando un objeto
        Connection conexion = null;
        //para la conexión a MySql
        var baseDatos = "zona_fit_db";
        var url = " "  + baseDatos;  //tu url
        var usuario = " "; //tu usuario
        var password = " "; //tu contraseña

        try {
             Class.forName("com.mysql.cj.jdbc.Driver"); //Clase conexión a BD
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e){
            System.out.println("Error al conectarnos a la BD: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if (conexion != null)
            System.out.println("Conexión exitosa: " + conexion);
        else
            System.out.println("Error al conectarse");
    }
}
