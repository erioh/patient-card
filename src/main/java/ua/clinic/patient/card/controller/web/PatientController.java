package ua.clinic.patient.card.controller.web;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.clinic.patient.card.service.PatientService;
import ua.clinic.patient.card.service.dto.PatientDto;
import ua.clinic.patient.card.service.dto.web.PatientFormDto;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {
    private final PatientService patientService;
    private final ModelMapper modelMapper;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public PatientController(PatientService patientService, ModelMapper modelMapper) {
        this.patientService = patientService;
        this.modelMapper = modelMapper;
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

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String addPatient(@Valid PatientFormDto patientFormDto, BindingResult bindingResult) {
        logger.info("Starting saving of patient {}", patientFormDto);
        PatientDto patientDto = modelMapper.map(patientFormDto, PatientDto.class);
        patientService.save(patientDto);
        return "redirect:/patient";
    }
}
