package tatun.service.impl;

import org.springframework.stereotype.Service;
import tatun.model.Ad;
import tatun.model.Company;
import tatun.repository.CompanyRepository;
import tatun.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public Company findById(int id) {
        return companyRepository.findById(id).get();
    }

    public Company findByAd(Ad ad) {
        return ad.getCompany();
    }
}
