package com.eva.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eva.curso.springboot.webapp.springboot_web.models.User;
import com.eva.curso.springboot.webapp.springboot_web.models.dto.ParamDto;


@RestController
@RequestMapping("/api/var")
public class PathVariableController 
{
    // Método para obtener parámetros de la ruta a través de una variable
    @GetMapping("/baz/{message}")
    public ParamDto baz (@PathVariable String message) // mismo nombre que la variable de la ruta
    {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) // mismo nombre que la variable de la ruta
    {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }


    // Método que realiza una petición POST, en el cuerpo del body no por URL
    @PostMapping("/create")
    public User create(@RequestBody User user)
    {
        user.setName(user.getName().toUpperCase());
        return user; // devuelve el objeto que recibimos JSON pero por POST
    }
}
