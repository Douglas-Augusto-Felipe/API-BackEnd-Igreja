package Igreja.Mocidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class MocidadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MocidadeApplication.class, args);
	}

}
