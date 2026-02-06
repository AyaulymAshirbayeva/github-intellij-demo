package healthcare.controller;

import healthcare.entity.Hospital;
import healthcare.repository.hospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {

    @Autowired
    private hospitalRepository hospitalRepository;

    // GET /patients
    @GetMapping
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    // GET /patients/{id}
    @GetMapping("/{id}")
    public Hospital getHospitalById(@PathVariable Long id) {
        return hospitalRepository.findById(id).orElse(null);
    }

    // POST /patients
    @PostMapping
    public Hospital createHospital(@RequestBody Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    // PUT /patients/{id}
    @PutMapping("/{id}")
    public Hospital updateHospital(@PathVariable Long id, @RequestBody Hospital hospitalDetails) {
        Hospital hospital = hospitalRepository.findById(id).orElse(null);
        if (hospital != null) {
            hospital.setName(hospitalDetails.getName());
            hospital.setCapacity(hospitalDetails.getCapacity());
            hospital.setRating(hospitalDetails.getRating());
            return hospitalRepository.save(hospital);
        }
        return null;
    }

    // DELETE /patients/{id}
    @DeleteMapping("/{id}")
    public void deleteHospital(@PathVariable Long id) {
        hospitalRepository.deleteById(id);
    }
}
