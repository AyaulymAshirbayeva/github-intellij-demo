package healthcare.controller;

import healthcare.entity.MedProfessional;
import healthcare.service.MedService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/meds")
public class MedProController {

    private final MedService service;

    public MedProController(MedService service) {
        this.service = service;
    }

    @GetMapping
    public List<MedProfessional> getAll() {
        return service.getAllMedProfessionals();
    }

    @PostMapping
    public MedProfessional addDoctor(@RequestBody MedProfessional doctor) {
        return service.addMedProfessional(doctor);
    }

    @PutMapping("/{name}/experience")
    public MedProfessional updateExperience(@PathVariable String name, @RequestParam int experience) {
        return service.updateExperience(name, experience);
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        service.deleteMedProfessional(name);
    }
}
