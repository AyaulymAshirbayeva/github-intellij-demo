package healthcare.service;

import healthcare.entity.Patient;
import healthcare.pattern.PatientFactory;
import healthcare.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService implements PatientServiceInterface {
    private final PatientRepository repository;
    public PatientService(PatientRepository repository) {
        this.repository = repository;}
    @Override
    public List<Patient> getAllPatients() {return repository.findAll();}
    @Override
    public Patient addPatient(Patient patient) {return repository.save(patient);}
    @Override
    public Patient updateAge(String name, int age) {
        Patient patient = repository.findByName(name);
        if (patient != null) {
            patient.setAge(age);
            return repository.save(patient);}
        return null;}
    @Override
    public void deleteByName(String name) {
        Patient patient = repository.findByName(name);
        if (patient != null) {
            repository.delete(patient);
        }
    }
    public Patient createAdultPatient(String name, int age) {
        Patient patient = PatientFactory.createAdult(name, age);
        return repository.save(patient);
    }

    public List<Patient> getAdultPatients() {
        return repository.findAll()
                .stream()
                .filter(p -> p.getAge() >= 18)
                .collect(Collectors.toList());
    }
}
