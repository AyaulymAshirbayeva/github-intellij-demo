package healthcare.controller;

import healthcare.entity.Patient;
import healthcare.service.PatientServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientServiceInterface patientService;
    public PatientController(PatientServiceInterface patientService) {
        this.patientService = patientService;
    }
@GetMapping
public List<Patient> getAllPatients() {
    return patientService.getAllPatients();}

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }
    @PutMapping("/update/{name}")
    public Patient updatePatientAge(@PathVariable String name, @RequestParam int age) {
        return patientService.updateAge(name, age);
    }

    // Удаление по имени
    @DeleteMapping("/delete/{name}")
    public void deletePatient(@PathVariable String name) {
        patientService.deleteByName(name);
    }
}
//{
//        "name": "Artem",
//        "age": 12
//        }
