package healthcare.controller;

import healthcare.entity.MedProfessional;
import healthcare.repository.medproRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meds")
public class MedProController {

    @Autowired
    private medproRepository medproRepository;

    // GET /patients
    @GetMapping
    public List<MedProfessional> getAllMedProfessionals() {
        return medproRepository.findAll();
    }

    // GET /patients/{id}
    @GetMapping("/{id}")
    public MedProfessional getMedProById(@PathVariable Long id) {
        return medproRepository.findById(id).orElse(null);
    }

    // POST /patients
    @PostMapping
    public MedProfessional createMedPro(@RequestBody MedProfessional medpro) {
        return medproRepository.save(medpro);
    }

    // PUT /patients/{id}
    @PutMapping("/{id}")
    public MedProfessional updateMedPro(@PathVariable Long id, @RequestBody MedProfessional medproDetails) {
        MedProfessional medpro = medproRepository.findById(id).orElse(null);
        if (medpro != null) {
            medpro.setName(medproDetails.getName());
            medpro.setSpecialization(medproDetails.getSpecialization());
            medpro.setExperience(medproDetails.getExperience());
            return medproRepository.save(medpro);
        }
        return null;
    }

    // DELETE /patients/{id}
    @DeleteMapping("/{id}")
    public void deleteMedPro(@PathVariable Long id) {
        medproRepository.deleteById(id);
    }
}
