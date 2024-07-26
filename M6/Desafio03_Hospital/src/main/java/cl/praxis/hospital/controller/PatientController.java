package cl.praxis.hospital.controller;

import cl.praxis.hospital.entity.Patient;
import cl.praxis.hospital.service.ICRUDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    private final Logger LOG = LoggerFactory.getLogger(PatientController.class);

    @Autowired
    private ICRUDService<Patient> patientService;

    @GetMapping
    public String getAllPatients(Model model) {
        LOG.info("Getting all patients list");
        List<Patient> patients = patientService.getAll();
        model.addAttribute("patients", patients);
        LOG.info("Current patients: {}", patients);
        return "patients";
    }
}
