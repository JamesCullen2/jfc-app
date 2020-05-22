package configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("repository.FriendRepository")
@EntityScan("domain.Friend")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        new SpringApplicationBuilder(Application.class)
//        .web(WebApplicationType.REACTIVE)
//        .run(args);
    }

}
