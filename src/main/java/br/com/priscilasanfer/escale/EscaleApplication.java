package br.com.priscilasanfer.escale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EscaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscaleApplication.class, args);
	}

}
