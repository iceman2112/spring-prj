package tatun;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("tatun.model")
@Import(DatabaseConfig.class)
public class AppConfig {

}
