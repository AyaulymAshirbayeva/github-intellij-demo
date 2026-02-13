package healthcare.controller;

import healthcare.entity.Patient;
import healthcare.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();}
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);}
    @PutMapping("/{name}")
    public Patient updateAge(@PathVariable String name,
                             @RequestParam int age) {
        return patientService.updateAge(name, age);
    }
    @DeleteMapping("/{name}")
    public void deletePatient(@PathVariable String name) {
        patientService.deleteByName(name);
    }
}
//{
//        "name": "Artem",
//        "age": 12
//        }
