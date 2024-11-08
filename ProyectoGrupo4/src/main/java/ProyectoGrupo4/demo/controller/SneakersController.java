package ProyectoGrupo4.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SneakersController {

    @GetMapping("/sneakers")
    public String showSneakersPage(Model model) {
        // Agrega los atributos necesarios al modelo para la página de sneakers
        model.addAttribute("title", "Sneakers Collection");
        // Retorna la vista sneakers.html (asegúrate de que esté en el directorio adecuado)
        return "sneakers";
    }
}
