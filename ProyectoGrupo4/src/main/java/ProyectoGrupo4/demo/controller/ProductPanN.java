package ProyectoGrupo4.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author mtorr
 */
@Controller
public class ProductPanN {

    @GetMapping("/ProductPanN")
    public String showClothingPage(Model model) {
        // Puedes agregar atributos al modelo si necesitas pasar datos a la plantilla
        model.addAttribute("title", "ProductPanN");
        // Retorna la vista de ProductHooded
        return "ProductPanN";
    }
}
