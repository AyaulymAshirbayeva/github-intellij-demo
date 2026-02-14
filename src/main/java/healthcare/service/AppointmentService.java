package healthcare.service;

import healthcare.entity.Appointment;
import healthcare.entity.Hospital;
import healthcare.entity.MedProfessional;
import healthcare.entity.Patient;
import healthcare.repository.AppointmentRepository;
import healthcare.repository.HospitalRepository;
import healthcare.repository.MedProRepository;
import healthcare.repository.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final MedProRepository medRepository;
    private final HospitalRepository hospitalRepository;

    // Конструктор для dependency injection
    public AppointmentService(AppointmentRepository appointmentRepository,
                              PatientRepository patientRepository,
                              MedProRepository medRepository,
                              HospitalRepository hospitalRepository) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
        this.medRepository = medRepository;
        this.hospitalRepository = hospitalRepository;
    }

    // CRUD методы
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment addAppointment(Appointment appointment) {
        // Получаем настоящие объекты из базы по имени
        Patient p = patientRepository.findByName(appointment.getPatient().getName());
        MedProfessional m = medRepository.findByName(appointment.getDoctor().getName());
        Hospital h = hospitalRepository.findByName(appointment.getHospital().getName());

        if (p == null || m == null || h == null) {
            throw new RuntimeException("Patient, Doctor or Hospital not found");
        }

        appointment.setPatient(p);
        appointment.setDoctor(m);
        appointment.setHospital(h);

        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}