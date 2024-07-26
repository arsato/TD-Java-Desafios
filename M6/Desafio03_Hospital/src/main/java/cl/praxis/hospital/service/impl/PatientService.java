package cl.praxis.hospital.service.impl;

import cl.praxis.hospital.entity.Patient;
import cl.praxis.hospital.repository.IPatientRepository;
import cl.praxis.hospital.service.ICRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements ICRUDService<Patient> {

    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public Patient getById(int id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient update(Patient patient) {
        if(patientRepository.existsById(patient.getId())){
            return patientRepository.save(patient);
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        if(patientRepository.existsById(id)){
            patientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
