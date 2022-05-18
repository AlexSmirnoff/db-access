package demo.elitedata.dbaccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DbAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbAccessApplication.class, args);
	}

}
