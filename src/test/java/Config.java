import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tatun.AppConfig;
import tatun.model.Category;
import tatun.repository.CategoryRepository;
import tatun.service.CategoryService;

import java.util.List;

public class Config {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //CategoryService categoryService = context.getBean(CategoryService.class);

        //List<Category> categoryList = categoryService.findAll();
        //System.out.print(categoryList);


        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
        Category category = categoryRepository.findByName("Недвижимость");
    }
}
