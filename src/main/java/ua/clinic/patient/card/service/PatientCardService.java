package ua.clinic.patient.card.service;

import ua.clinic.patient.card.service.dto.PatientCardDto;

public interface PatientCardService {
    PatientCardDto findById(Long id);
}
