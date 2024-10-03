package com.eva.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eva.curso.springboot.webapp.springboot_web.models.User;
import com.eva.curso.springboot.webapp.springboot_web.models.dto.UserDto;

// Convertir en una APIRest
// Devuelve el contenido como un JSON
@RestController
@RequestMapping("/api") // ruta base, primer nombre en la ruta
public class UserRestController 
{
    // Método
    // Petición a través de una ruta navegador
    @GetMapping("/details") // No puede haber más de un método con la misma ruta, tiene que ser única
    public UserDto details()
    {
        UserDto userDto = new UserDto();
        // Objeto user del models
        User user = new User("Eva", "Sánchez");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        
        return userDto; // devuelve un objeto JSON
    }


    @GetMapping("/list")
    public List<User> list()
    {
        User user = new User("Eva", "Sánchez");
        User user2 = new User("Pepe", "Doe");
        User user3 = new User("John", "Doe");

        List<User> users = Arrays.asList(user, user2, user3); // forma más corta
        //List<User> users = new ArrayList<>();
        //users.add(user);
        //users.add(user2);
        //users.add(user3);
        return users; // muestra un array de objetos
    }

    
    @GetMapping(path = "/details-map") // No puede haber más de un método con la misma ruta, tiene que ser única
    public Map<String, Object> detailsMap()
    {
        // Objeto user del models
        User user = new User("Eva", "Sánchez");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        return body; // devuelve un objeto JSON
    }
}
