package tatun.service;

import tatun.model.Ad;
import tatun.model.Category;

import java.util.List;
import java.util.Optional;

public interface AdService {
    void add(Ad ad);
    void delete(Ad ad);
    Ad findById(int id);
    void refresh(Ad ad);
    List<Ad> findAll();
    List<Ad> findByCategory(Category category);
    void add(String name, String description, String telephone, String companyName, String categoryName);
}
