package br.com.priscilasanfer.escale.adapter.http.spring;

import br.com.priscilasanfer.escale.core.models.User;
import br.com.priscilasanfer.escale.core.ports.UserPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/escale/user")
//@CrossOrigin("*")
public class UserController {

    private final UserPort userPort;

    @GetMapping("/{nome}")
    public ResponseEntity<?> consultar(@PathVariable String nome) {

        log.info("Consultando as ultimas músicas ouvidas por: {}", nome);

        List<User> lista = userPort.buscaMusicasPorUsuario(nome);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Oi");

    }


}
