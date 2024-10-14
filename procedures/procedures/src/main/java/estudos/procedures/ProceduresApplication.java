package estudos.procedures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProceduresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProceduresApplication.class, args);
	}

}
