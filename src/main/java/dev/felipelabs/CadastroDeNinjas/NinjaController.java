package dev.felipelabs.CadastroDeNinjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    @GetMapping("/hello")
    public String mensagem() {
        return "HELLO WORLD, MOTHER FUCK!!!";
    }
}
