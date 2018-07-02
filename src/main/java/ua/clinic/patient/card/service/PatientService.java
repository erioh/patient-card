package ua.clinic.patient.card.service;

import ua.clinic.patient.card.service.dto.PatientDto;

import java.util.List;

public interface PatientService {
    List<PatientDto> findAll();

    PatientDto findById(Long id);

    void save(PatientDto patientDto);
}
