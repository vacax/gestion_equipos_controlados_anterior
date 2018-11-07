package edu.pucmm.ect.gestion_equipos_controlados;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionEquiposControladosApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionEquiposControladosApplication.class, args);
    }

    @Route("")
    static class Demo extends VerticalLayout {
         public Demo(){
             add(new Button("Presiona...", e->{
                 Notification.show("Hola mundo");
             }));
         }
    }
}
