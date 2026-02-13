package healthcare.controller;

import healthcare.entity.MedProfessional;
import healthcare.service.MedService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final MedService service;

    public DoctorController(MedService service) {
        this.service = service;
    }

    @GetMapping
    public List<MedProfessional> getAll() {
        return service.getAllMedProfessionals();
    }

    @PostMapping
    public MedProfessional add(@RequestBody MedProfessional doc) {
        return service.addMedProfessional(doc);
    }

    @PutMapping("/{name}/experience")
    public MedProfessional updateExperience(@PathVariable String name, @RequestParam int newExp) {
        return service.updateExperience(name, newExp);
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        service.deleteMedProfessional(name);
    }
}
