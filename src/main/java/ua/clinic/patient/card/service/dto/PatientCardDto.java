package ua.clinic.patient.card.service.dto;

import ua.clinic.patient.card.dao.entity.PatientCard;

public class PatientCardDto {
    private  Long id;

    private  PatientDto patient;

    private  DiagnosisDto diagnosis;

    private  ComplaintDto complains;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public DiagnosisDto getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(DiagnosisDto diagnosis) {
        this.diagnosis = diagnosis;
    }

    public ComplaintDto getComplains() {
        return complains;
    }

    public void setComplains(ComplaintDto complains) {
        this.complains = complains;
    }
}
