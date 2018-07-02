package ua.clinic.patient.card.service;

import ua.clinic.patient.card.service.dto.DiagnosisDto;
import ua.clinic.patient.card.service.dto.PatientDto;

import java.util.List;

public interface DiagnosisService {
    List<DiagnosisDto> findAll();

    PatientDto findById(Long id);
}
