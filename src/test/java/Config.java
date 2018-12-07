import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tatun.AppConfig;

public class Config {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
