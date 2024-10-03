package com.eva.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Convertir en una APIRest
// Devuelve el contenido como un JSON
@RestController
@RequestMapping("/api") // ruta base, primer nombre en la ruta
public class UserRestController 
{
    // Método
    // Petición a través de una ruta navegador
    @GetMapping("/details") // No puede haber más de un método con la misma ruta, tiene que ser única
    public Map<String, Object> details()
    {
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Eva");
        body.put("lastname", "Sánchez");        
        return body; // devuelve un objeto JSON
    }
}
