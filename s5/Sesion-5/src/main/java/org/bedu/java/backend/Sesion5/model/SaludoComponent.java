package org.bedu.java.backend.Sesion5.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Con esto se indica que maneje como un Bean
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SaludoComponent {

    private final String nombre;

    public SaludoComponent() {
        this.nombre = "Beto";
    }

    public String getNombre() {
        return nombre;
    }
}
