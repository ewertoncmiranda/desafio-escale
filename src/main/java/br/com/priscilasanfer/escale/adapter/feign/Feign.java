package br.com.priscilasanfer.escale.adapter.feign;

import br.com.priscilasanfer.escale.core.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://recruitment.staging.escale.com.br", name = "user")
public interface Feign {

    @GetMapping("/users")
    List<User> buscarMusicasPorUsuario();

}
