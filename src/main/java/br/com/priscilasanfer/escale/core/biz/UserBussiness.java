package br.com.priscilasanfer.escale.core.biz;

import br.com.priscilasanfer.escale.core.models.User;
import br.com.priscilasanfer.escale.core.ports.FeignPort;
import br.com.priscilasanfer.escale.core.ports.UserPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class UserBussiness implements UserPort {

    // vai chamar uma porta que pra mandar requisição externa

    private final FeignPort feignPort;

    @Override
    public List<User> buscaMusicasPorUsuario(String nome) {

        // chamar uma porta

        return List.of();
    }


}
