package ua.clinic.patient.card.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.clinic.patient.card.dao.PatientDao;
import ua.clinic.patient.card.dao.entity.Patient;
import ua.clinic.patient.card.service.PatientService;
import ua.clinic.patient.card.service.dto.PatientDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DefaultPatientService implements PatientService {
    private final PatientDao patientDao;
    private final ModelMapper modelMapper;

    public DefaultPatientService(PatientDao patientDao, ModelMapper modelMapper) {
        this.patientDao = patientDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PatientDto> findAll() {
        Iterable<Patient> patients = patientDao.findAll();
        List<PatientDto> patientDtoList = new ArrayList<>();
        patients.forEach(patient -> patientDtoList.add(modelMapper.map(patient, PatientDto.class)));
        return patientDtoList;
    }

    @Override
    public PatientDto findById(Long id) {
        Optional<Patient> optionalPatient = patientDao.findById(id);
        return optionalPatient.map(patient -> modelMapper.map(patient, PatientDto.class))
                .orElse(null);
    }

    @Override
    @Transactional
    public void save(PatientDto patientDto) {
        patientDao.save(modelMapper.map(patientDto, Patient.class));

    }
}
