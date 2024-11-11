

package ProyectoGrupo4.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/shop-single")
    public String showShopSingle() {
        return "shop-single"; 
    }
}
