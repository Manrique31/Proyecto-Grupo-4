package ProyectoGrupo4.demo.service;

import ProyectoGrupo4.demo.dao.CarritoDao;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {
    @Autowired
    private CarritoDao carritoDao;

    public void agregarProducto(int usuarioId, int productoId, int cantidad) {
        carritoDao.agregarAlCarrito(usuarioId, productoId, cantidad);
    }

    public List<Map<String, Object>> obtenerProductos(int usuarioId) {
        return carritoDao.obtenerCarrito(usuarioId);
    }

    public void eliminarProducto(int usuarioId, int productoId) {
        carritoDao.eliminarDelCarrito(usuarioId, productoId);
    }
}
