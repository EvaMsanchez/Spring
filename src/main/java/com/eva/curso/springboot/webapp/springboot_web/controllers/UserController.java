package com.eva.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

        user.setEmail("eva_crm20@hotmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);  
        return "details"; // vista
    }


    // Crear una lista pero pasándolo a la vista, renderizarlo
    @GetMapping("/list")
    public String list(ModelMap model) 
    {
        //model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }


    // Método que va a devolver una lista de usuarios y con la anotación se va a guardar en el nombre que pongamos
    @ModelAttribute("users") 
    public List<User> usersModel()
    {
        List<User> users = Arrays.asList(
            new User("Pepa", "González"),
            new User("Lalo", "Pérez", "lalo@gmail.com"),
            new User("Juanita", "Roe", "juana@gmail.com"),
            new User("Eva", "Sánchez"));

        return users;
    }
    
}
