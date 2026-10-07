package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:5555/mecanicoDB";
        String user = "root";
        String password = "r00t";

        System.out.println("Conectando a la base de datos...");

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("¡Conexión exitosa a la base de datos!");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}