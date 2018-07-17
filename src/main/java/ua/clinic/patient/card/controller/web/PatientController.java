package ua.clinic.patient.card.controller.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ua.clinic.patient.card.service.PatientService;
import ua.clinic.patient.card.service.dto.PatientDto;
import ua.clinic.patient.card.service.dto.web.ResponseDto;

import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {
    private final PatientService patientService;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping()
    public String getPage(ModelMap modelMap) {
        List<PatientDto> patientList = patientService.findAll();
        modelMap.addAttribute("patientList", patientList);
        return "patient";
    }

    @GetMapping("/add")
    public String getAddPatientPage() {
        return "addPatient";
    }

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<ResponseDto<String>> addPatient(@RequestBody PatientDto patientDto) {
        logger.info("Starting saving of patient {}", patientDto);
        patientService.save(patientDto);
        return new ResponseEntity<>(new ResponseDto<>("SUCCESS"), HttpStatus.OK);
    }
}
