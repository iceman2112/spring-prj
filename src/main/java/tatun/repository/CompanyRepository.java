package tatun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tatun.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{
    Company findByName(String name);
}
