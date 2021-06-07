package hr.obai.taco;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = {"hr.obai.taco.*"})
public class EntityConfiguration {
}
