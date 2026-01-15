package HTwoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(
		info = @Info(
				title ="Employee Managment",
				description = "This testing for employee"
				
				
				)
		)
@SpringBootApplication
public class SimpleDmoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDmoRestApplication.class, args);
	}

}
