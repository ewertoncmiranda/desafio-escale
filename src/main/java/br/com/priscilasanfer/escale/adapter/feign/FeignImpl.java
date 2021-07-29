package br.com.priscilasanfer.escale.adapter.feign;

import br.com.priscilasanfer.escale.core.models.User;
import br.com.priscilasanfer.escale.core.ports.FeignPort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FeignImpl implements FeignPort {

    private final Feign feign;

    @Override
    public List<User> buscaUsuarios() {
        return feign.buscarMusicasPorUsuario();
    }
}
