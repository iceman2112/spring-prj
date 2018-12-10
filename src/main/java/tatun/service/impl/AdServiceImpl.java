package tatun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import tatun.model.Ad;
import tatun.model.Category;
import tatun.model.Company;
import tatun.repository.AdRepository;
import tatun.repository.CategoryRepository;
import tatun.repository.CompanyRepository;
import tatun.service.AdService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdServiceImpl implements AdService{

    @Autowired
    private AdRepository adRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public void add(Ad ad) {
        adRepository.save(ad);
    }

    public void delete(Ad ad) {
        adRepository.delete(ad);
    }

    @Nullable
    public Ad findById(int id) {
        return adRepository.findById(id).get();
    }

    public void refresh(Ad ad) {
        adRepository.save(ad);
    }

    public List<Ad> findAll() {
        return adRepository.findAll();
    }

    @Transactional
    public void add(String name, String description, String telephone, String companyName, String categoryName) {

        Company company = companyRepository.findByName(companyName);
        if (company == null) {
            company = new Company();
            company.setName(companyName);
            companyRepository.save(company);
        }

        Category category = categoryRepository.findByName(categoryName);
        if (category == null) {
            category = new Category();
            category.setName(categoryName);
            categoryRepository.save(category);
        }

        Ad ad = new Ad(category, company, name, description, telephone);
        adRepository.save(ad);
    }

    public List<Ad> findByCategory(Category category) {
        return category.getAds();
    }
}
