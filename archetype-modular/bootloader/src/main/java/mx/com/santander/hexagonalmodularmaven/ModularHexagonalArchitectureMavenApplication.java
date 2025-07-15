package mx.com.santander.hexagonalmodularmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication

@EnableFeignClients

public class ModularHexagonalArchitectureMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModularHexagonalArchitectureMavenApplication.class, args);
	}

}
