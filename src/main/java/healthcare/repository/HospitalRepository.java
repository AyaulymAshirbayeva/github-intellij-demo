package healthcare.repository;

import healthcare.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    // поиск по имени (если понадобится)
    Hospital findByName(String name);
}
