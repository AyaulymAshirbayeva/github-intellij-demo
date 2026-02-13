package healthcare.repository;

import healthcare.entity.MedProfessional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedProRepository extends JpaRepository<MedProfessional, Long> {
    // поиск по имени (если понадобится)
    MedProfessional findByName(String name);
}
