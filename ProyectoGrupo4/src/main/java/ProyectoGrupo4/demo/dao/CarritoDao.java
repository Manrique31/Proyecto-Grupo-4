package ProyectoGrupo4.demo.dao;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarritoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void agregarAlCarrito(int usuarioId, int productoId, int cantidad) {
        String sql = "INSERT INTO carrito (usuario_id, producto_id, cantidad) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, usuarioId, productoId, cantidad);
    }

    public List<Map<String, Object>> obtenerCarrito(int usuarioId) {
        String sql = "SELECT p.id AS producto_id, p.nombre, p.precio, c.cantidad, (p.precio * c.cantidad) AS total "
                + "FROM carrito c INNER JOIN productos p ON c.producto_id = p.id WHERE c.usuario_id = ?";
        return jdbcTemplate.queryForList(sql, usuarioId);
    }

    public void eliminarDelCarrito(int usuarioId, int productoId) {
        String sql = "DELETE FROM carrito WHERE usuario_id = ? AND producto_id = ?";
        jdbcTemplate.update(sql, usuarioId, productoId);
    }
}
