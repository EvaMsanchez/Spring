package com.eva.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eva.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.eva.curso.springboot.webapp.springboot_web.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/params")
public class RequestParamsController 
{
    // Método que recibe parámetros a través de la URL
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message)
    {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        //param.setMessage(message!=null? message: "Hola"); // con operador ternario
        return param; // Devuelve en formato JSON
    }


    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code)
    {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params; //JSON
    }


    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request)
    {
        Integer code = 0;
        try
        {
            Integer.parseInt(request.getParameter("code"));
        }
        catch(NumberFormatException e)
        {}
        
        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }
    
}
