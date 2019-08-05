package io.spring.niudai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableCircuitBreaker
public class GsNiudaiMicroservicesApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsNiudaiMicroservicesApiGatewayApplication.class, args);
	}

}
