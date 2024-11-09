package ProyectoGrupo4.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String showIndexPage(Model model) {
        // Agrega atributos al modelo si necesitas pasar datos a la página principal
        model.addAttribute("title", "Inicio");
        // Retorna la vista index.html
        return "index";
    }
}