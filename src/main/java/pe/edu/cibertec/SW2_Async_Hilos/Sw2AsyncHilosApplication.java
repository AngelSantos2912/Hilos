package pe.edu.cibertec.SW2_Async_Hilos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class Sw2AsyncHilosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sw2AsyncHilosApplication.class, args);
	}

}
