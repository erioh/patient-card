package ua.clinic.patient.card.utill;

import org.springframework.ui.ModelMap;
import ua.clinic.patient.card.service.dto.ComplaintDto;
import ua.clinic.patient.card.service.dto.DiagnosisDto;
import ua.clinic.patient.card.service.dto.PatientCardDto;
import ua.clinic.patient.card.service.dto.PatientDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PatientCardFiller {
    private StringDivider divider = new StringDivider();

    public void fill(ModelMap model, PatientCardDto patientCardDto) {
        model.addAttribute("id", patientCardDto.getId());
        fillPatientsData(model, patientCardDto);
        fillDiagnosis(model, patientCardDto);
        fillComplains(model, patientCardDto);
    }

    private void fillComplains(ModelMap model, PatientCardDto patientCardDto) {
        ComplaintDto complains = patientCardDto.getComplains();
        String fullText = complains.getText();
        String[] diagnosis = divider.divideBy(fullText, ' ', 100, 3);
        model.addAttribute("complaint1", diagnosis[0]);
        model.addAttribute("complaint2", diagnosis[1]);
        model.addAttribute("complaint3", diagnosis[2]);

    }

    private void fillDiagnosis(ModelMap model, PatientCardDto patientCardDto) {
        DiagnosisDto diagnosisDto = patientCardDto.getDiagnosis();
        String fullText = diagnosisDto.getText();

        String[] diagnosis = divider.divideBy(fullText, ' ', 100, 2);
        model.addAttribute("diagnosisPart1", diagnosis[0]);
        model.addAttribute("diagnosisPart2", diagnosis[1]);
    }

    private void fillPatientsData(ModelMap model, PatientCardDto patientCardDto) {
        PatientDto patient = patientCardDto.getPatient();
        model.addAttribute("patient", patient);
        LocalDate dateOfBirth = patient.getDateOfBirth();
        int dayOfMonth = dateOfBirth.getDayOfMonth();
        char[] daysOfMonth = intToCharFormat(dayOfMonth);
        model.addAttribute("d1", daysOfMonth[0]);
        model.addAttribute("d2", daysOfMonth[1]);
        Month monthOfBirth = dateOfBirth.getMonth();
        char[] monthesOfBirth = intToCharFormat(monthOfBirth.getValue());
        model.addAttribute("m1", monthesOfBirth[0]);
        model.addAttribute("m2", monthesOfBirth[1]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy");
        String stringDate = formatter.format(dateOfBirth);
        char[] charYearOfEra = stringDate.toCharArray();
        model.addAttribute("y1", charYearOfEra[0]);
        model.addAttribute("y2", charYearOfEra[1]);

    }

    private char[] intToCharFormat(int value) {
        char[] result = new char[2];
        if (value < 10) {
            result[0] = '0';
        } else {
            result[0] = (char) (value / 10 + '0');
            value = value % 10;
        }
        result[1] = (char) (value + '0');
        return result;
    }
}
