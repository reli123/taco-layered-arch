package hr.obai.taco;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = {"hr.obai.taco.*"}
)
public class JpaConfiguration {

}
