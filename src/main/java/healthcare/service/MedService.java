package healthcare.service;

import healthcare.entity.MedProfessional;
import healthcare.repository.MedProRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedService {

    private final MedProRepository repository;

    public MedService(MedProRepository repository) {
        this.repository = repository;
    }

    public List<MedProfessional> getAllMedProfessionals() {
        return repository.findAll();
    }

    public MedProfessional addMedProfessional(MedProfessional doc) {
        return repository.save(doc);
    }

    public MedProfessional updateExperience(String name, int newExp) {
        MedProfessional doc = repository.findByName(name);
        if (doc != null) {
            doc.setExperience(newExp);
            return repository.save(doc);
        }
        return null;
    }

    public void deleteMedProfessional(String name) {
        MedProfessional doc = repository.findByName(name);
        if (doc != null) {
            repository.delete(doc);
        }
    }
}
