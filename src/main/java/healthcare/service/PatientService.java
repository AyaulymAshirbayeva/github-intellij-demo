package healthcare.service;

import healthcare.pattern.PatientFactory;
import healthcare.entity.Patient;
import healthcare.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    public Patient createAdultPatient(String name, int age) {
        Patient patient = PatientFactory.createAdult(name, age);
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
    public Patient updateAge(String name, int newAge) {
        Patient patient = patientRepository.findByName(name);
        patient.setAge(newAge);
        return patientRepository.save(patient);
    }
    public void deleteByName(String name) {
        Patient patient = patientRepository.findByName(name);
        patientRepository.delete(patient);
    }
}
