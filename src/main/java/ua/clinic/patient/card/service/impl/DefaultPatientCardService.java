package ua.clinic.patient.card.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ua.clinic.patient.card.dao.PatientCardDao;
import ua.clinic.patient.card.dao.entity.PatientCard;
import ua.clinic.patient.card.service.PatientCardService;
import ua.clinic.patient.card.service.dto.PatientCardDto;

import java.util.Optional;

@Service
public class DefaultPatientCardService implements PatientCardService {
    private final PatientCardDao patientCardDao;
    private final ModelMapper modelMapper;

    public DefaultPatientCardService(PatientCardDao patientCardDao, ModelMapper modelMapper) {
        this.patientCardDao = patientCardDao;
        this.modelMapper = modelMapper;
    }


    @Override
    public PatientCardDto findById(Long id) {
        Optional<PatientCard> optionalPatientCard = patientCardDao.findById(id);
        if (optionalPatientCard.isPresent()) {
            PatientCard patientCard = optionalPatientCard.get();
            return modelMapper.map(patientCard, PatientCardDto.class);
        }
        throw new RuntimeException("PatientCard with id = " + id + " is not present");
    }
}
