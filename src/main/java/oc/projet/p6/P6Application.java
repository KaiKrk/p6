package oc.projet.p6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class P6Application {

    public static void main(String[] args) {
        SpringApplication.run(P6Application.class, args);
    }

}
