package ProyectoGrupo4.demo.controller;

import ProyectoGrupo4.demo.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public String mostrarCarrito(@RequestParam("usuarioId") int usuarioId, Model model) {
        model.addAttribute("productos", carritoService.obtenerProductos(usuarioId));
        return "carrito";
    }

    @PostMapping("/agregar")
    public String agregarProducto(@RequestParam int usuarioId, @RequestParam int productoId, @RequestParam int cantidad) {
        carritoService.agregarProducto(usuarioId, productoId, cantidad);
        return "redirect:/carrito?usuarioId=" + usuarioId;
    }

    @PostMapping("/eliminar")
    public String eliminarProducto(@RequestParam int usuarioId, @RequestParam int productoId) {
        carritoService.eliminarProducto(usuarioId, productoId);
        return "redirect:/carrito?usuarioId=" + usuarioId;
    }
}
