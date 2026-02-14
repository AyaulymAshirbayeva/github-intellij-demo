package healthcare.service;

import healthcare.entity.Hospital;
import healthcare.pattern.HospitalBuilder;
import healthcare.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Hospital createHospital(String name, int capacity, double rating) {
        Hospital hospital = new HospitalBuilder()
                .setName(name)
                .setCapacity(capacity)
                .setRating(rating)
                .build();
        return hospitalRepository.save(hospital);}

    public Hospital updateRating(String name, double newRating) {
        Hospital hospital = hospitalRepository.findByName(name);
        if (hospital != null) {
            hospital.setRating(newRating);
            return hospitalRepository.save(hospital);
        }
        return null;
    }

    public void deleteHospital(String name) {
        Hospital hospital = hospitalRepository.findByName(name);
        if (hospital != null) {
            hospitalRepository.delete(hospital);
        }
    }
}
