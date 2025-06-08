/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagoDAO {
    private Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/parqueadero";
        String usuario = "root";
        String clave = ""; // Cambia por tu contraseña
        return DriverManager.getConnection(url, usuario, clave);
    }

    public boolean registrarPago(Pago pago) {
        String sql = "INSERT INTO pagos (id_usuario, monto, fecha_pago) VALUES (?, ?, ?)";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, pago.getIdUsuario());
            stmt.setDouble(2, pago.getMonto());
            stmt.setString(3, pago.getFechaPago());
            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            System.out.println("Error al registrar el pago: " + e.getMessage());
            return false;
        }
    }
}

