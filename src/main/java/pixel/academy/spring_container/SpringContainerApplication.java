package pixel.academy.spring_container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"pixel.academy.spring_container," + "util"}
)
public class SpringContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringContainerApplication.class, args);
	}

}
