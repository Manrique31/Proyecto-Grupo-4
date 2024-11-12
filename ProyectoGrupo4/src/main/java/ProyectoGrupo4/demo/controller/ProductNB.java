

package ProyectoGrupo4.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductNB {

    @GetMapping("/ProductNB")
    public String showShopSingle() {
        return "ProductNB"; 
    }
}
