/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGrupo4.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccesoriosController {

    @GetMapping("/accesorios")
    public String showAccesoriosPage(Model model) {
        // Agrega atributos al modelo si necesitas datos específicos para esta página
        model.addAttribute("title", "Accesorios");
        // Retorna la vista accesorios.html
        return "accesorios";
    }
}