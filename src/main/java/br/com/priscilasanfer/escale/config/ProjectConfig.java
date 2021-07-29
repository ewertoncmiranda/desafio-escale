package br.com.priscilasanfer.escale.config;

import br.com.priscilasanfer.escale.core.biz.UserBussiness;
import br.com.priscilasanfer.escale.core.ports.FeignPort;
import br.com.priscilasanfer.escale.core.ports.UserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ProjectConfig {

    private final UserPort userPort;
    private final FeignPort feignPort;

    @Bean
    public UserBussiness userBussiness(){
        return new UserBussiness(feignPort);
    }


}
