package mx.unam.aragon.ico.is.websimple11.controladores;

import mx.unam.aragon.ico.is.websimple11.modelo.Perro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControladorPrincipal {
    @GetMapping
    public String index(Model model) {
        Perro perro = new Perro("Max", "Boxer");
        model.addAttribute("can", perro);
        return "index";
    }
}
