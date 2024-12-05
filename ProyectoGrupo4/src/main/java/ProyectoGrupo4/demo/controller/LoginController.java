/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGrupo4.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Página principal (índice) con el formulario de inicio de sesión
    @GetMapping("/")
    public String homePage() {
        return "index"; // Muestra el formulario de login
    }

    // Maneja el inicio de sesión
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Validar las credenciales (esto puede ser mejorado con un servicio de autenticación real)
        if ("admin".equals(username) && "1234".equals(password)) {
            model.addAttribute("message", "¡Gracias por iniciar sesión, " + username + "!");
            return "index"; // Redirige al index con el mensaje de bienvenida
        } else {
            model.addAttribute("message", "Credenciales incorrectas, intenta de nuevo.");
            return "index"; // Vuelve al formulario de login
        }
    }
}
