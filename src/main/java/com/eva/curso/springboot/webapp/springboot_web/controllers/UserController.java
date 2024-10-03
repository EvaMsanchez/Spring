package com.eva.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Procesa el request y devuelve un response
// Anotación, indica que es un controlador de Spring
@Controller
public class UserController 
{
    // Método
    // Petición a través de una ruta navegador
    @GetMapping("/details")
    public String details(Map<String, Object> model)
    {
        model.put("title", "Hola Mundo Spring Boot");
        model.put("name", "Eva");
        model.put("lastname", "Sánchez");        
        return "details"; // vista
    }
}
