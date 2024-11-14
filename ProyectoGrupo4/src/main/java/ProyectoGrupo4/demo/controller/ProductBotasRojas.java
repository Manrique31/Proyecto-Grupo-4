/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGrupo4.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductBotasRojas {
    


    @GetMapping("/ProductBotasRojas")
    public String showClothingPage(Model model) {
        // Puedes agregar atributos al modelo si necesitas pasar datos a la plantilla
        model.addAttribute("title", "ProductBotasRojas");
        // Retorna la vista clothing.html
        return "ProductBotasRojas";
    }
}