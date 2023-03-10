package org.bedu.java.backend.Sesion5.config;


import org.bedu.java.backend.Sesion5.model.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //indicamos que se va a configurar con un bean
public class SaludoConfig {

    @Bean
    public Saludo saludo(){
        return new Saludo("Beto");
    }
}
