package ua.clinic.patient.card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.clinic.patient.card.service.PatientCardService;
import ua.clinic.patient.card.service.dto.PatientCardDto;
import ua.clinic.patient.card.utill.PatientCardFiller;

@Controller
public class ReportController {

    private PatientCardService patientCardService;

    public ReportController(PatientCardService patientCardService) {
        this.patientCardService = patientCardService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public PatientCardDto findById(@PathVariable Long id) {
        PatientCardDto patientCardDto = patientCardService.findById(id);
        return patientCardDto;
    }

    @GetMapping("/report/{id}")
    public String report(ModelMap model, @PathVariable Long id) {
        PatientCardDto patientCardDto = findById(id);
        PatientCardFiller filler = new PatientCardFiller();
        filler.fill(model, patientCardDto);

//        model.addAttribute(Options.getFrom(DocumentKind.ODT).getTo(ConverterTypeTo.PDF));
        return "docxReport";
    }
}
