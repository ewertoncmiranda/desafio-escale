package br.com.priscilasanfer.escale.core.ports;

import br.com.priscilasanfer.escale.core.models.User;

import java.util.List;

public interface FeignPort {
    List<User> buscaUsuarios();
}
