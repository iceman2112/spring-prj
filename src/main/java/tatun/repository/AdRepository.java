package tatun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tatun.model.Ad;

@Repository
public interface AdRepository  extends JpaRepository<Ad, Integer>{
}
