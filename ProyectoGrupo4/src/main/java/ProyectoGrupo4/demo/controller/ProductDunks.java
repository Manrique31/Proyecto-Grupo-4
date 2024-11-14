package ProyectoGrupo4.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductDunks {
    


    @GetMapping("/ProductDunks")
    public String showClothingPage(Model model) {
        // Puedes agregar atributos al modelo si necesitas pasar datos a la plantilla
        model.addAttribute("title", "ProductDunks");
        // Retorna la vista clothing.html
        return "ProductDunks";
    }
}