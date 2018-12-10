import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tatun.AppConfig;
import tatun.model.Ad;
import tatun.model.Category;
import tatun.model.Company;
import tatun.repository.AdRepository;
import tatun.repository.CategoryRepository;
import tatun.service.AdService;
import tatun.service.CategoryService;
import tatun.service.CompanyService;

import java.util.List;

public class TestRepositoryLessonFour {
    @Test
    public void test() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AdService adService = context.getBean(AdService.class);
        adService.add("Продам машину", "Цена 1.500.000 руб.", "222-333", "Строй-инвест", "Автомобили");
        adService.add("Продам квартиру на Московке", "Цена 3.000.000 руб.", "222-333", "Строй-инвест", "Недвижимость");
    }

    @Test
    public void testFindAdById() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AdRepository adRepository = context.getBean(AdRepository.class);
        Ad ad = adRepository.getOne(3);
    }

    @Test
    public void testGetCompanyByAd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AdService adService = context.getBean(AdService.class);
        CompanyService companyService = context.getBean(CompanyService.class);
        Company company = companyService.findByAd(adService.findById(3));
    }

    @Test
    public void testGetAdsByCategory() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
        Category category = categoryRepository.findByName("Недвижимость");

        if (category == null) return;

        AdService adService = context.getBean(AdService.class);
        List<Ad> listAd = adService.findByCategory(category);
    }
}

