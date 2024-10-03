package com.eva.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eva.curso.springboot.webapp.springboot_web.models.User;

// Procesa el request y devuelve un response
// Anotación, indica que es un controlador de Spring
@Controller
public class UserController 
{
    // Método
    // Petición a través de una ruta navegador
    @GetMapping("/details")
    public String details(Model model)
    {
        // Objeto user del models
        User user = new User("Eva", "Sánchez");

        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);  
        return "details"; // vista
    }
}
