package com.eva.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
// Para agregar archivos personalizados
@PropertySources
({
	@PropertySource(value="classpath:values.properties", encoding = "UTF-8"),
})
public class ValuesConfig 
{

}
