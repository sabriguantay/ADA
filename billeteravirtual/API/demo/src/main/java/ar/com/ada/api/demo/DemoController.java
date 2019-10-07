package ar.com.ada.api.demo;

import org.springframework.web.bind.annotation.*;
/**
 * DemoController
 */
@RestController
public class DemoController {
    @GetMapping(value = "/demo")
    public String getDemoTexto() {
        return "Desde springboot";
    }

    @GetMapping(value="/temperatura")
    
    public Temperatura getTemperatura() {
        Temperatura t = new Temperatura();
        t.pais = "Argentina";
        t.temperatura = 30.0;
        return t;
}

@GetMapping(value="/temperaturas/{id}")
public Temperatura getTemperatura (@PathVariable int id){
    
}
}
