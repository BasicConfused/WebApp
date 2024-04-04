package Bandar.springframework.spring6webapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Spring6WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring6WebappApplication.class, args);
	}
}
