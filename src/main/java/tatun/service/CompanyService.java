package tatun.service;

import tatun.model.Ad;
import tatun.model.Company;

public interface CompanyService {
    Company findById(int id);
    Company findByAd(Ad ad);
}
