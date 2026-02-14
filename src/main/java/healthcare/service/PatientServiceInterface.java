package healthcare.service;
import healthcare.entity.Patient;
import java.util.List;
public interface PatientServiceInterface {
    List<Patient> getAllPatients();
    Patient addPatient(Patient patient);
    Patient updateAge(String name, int age);
    void deleteByName(String name);}
