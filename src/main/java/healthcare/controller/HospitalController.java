package healthcare.controller;

import healthcare.entity.Hospital;
import healthcare.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {
    private final HospitalService hospitalService;
    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }
    @PostMapping
    public Hospital addHospital(@RequestBody Hospital hospital) {
        return hospitalService.createHospital(
                hospital.getName(),
                hospital.getCapacity(),
                hospital.getRating()
        );
    }
    @GetMapping
    public List<Hospital> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }
    @PutMapping("/{name}/rating")
    public Hospital updateHospitalRating(@PathVariable String name,
                                         @RequestParam double rating) {
        return hospitalService.updateRating(name, rating);
    }
    @DeleteMapping("/{name}")
    public void deleteHospital(@PathVariable String name) {
        hospitalService.deleteHospital(name);
    }
}

