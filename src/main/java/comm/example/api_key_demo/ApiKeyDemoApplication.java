package comm.example.api_key_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiKeyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiKeyDemoApplication.class, args);
		System.out.println("api lkey server started");
	}

}
