package tatun;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("tatun")
@EnableJpaRepositories("tatun.repository")
@Import(DatabaseConfig.class)
public class AppConfig {

}
