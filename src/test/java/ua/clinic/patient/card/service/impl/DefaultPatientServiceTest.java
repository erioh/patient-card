package ua.clinic.patient.card.service.impl;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;
import ua.clinic.patient.card.dao.PatientDao;
import ua.clinic.patient.card.dao.entity.Patient;
import ua.clinic.patient.card.service.PatientService;
import ua.clinic.patient.card.service.dto.PatientDto;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPatientServiceTest {

    @Mock
    private PatientDao patientDao;
    private PatientService patientService;

    @Before
    public void setUp() {
        patientService = new DefaultPatientService(patientDao, new ModelMapper());
    }

    @Test
    public void findAll() {
        Patient patient = new Patient();
        patient.setId(1L);
        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient);
        when(patientDao.findAll()).thenReturn(patientList);
        List<PatientDto> patientDtoList = patientService.findAll();
        assertEquals(patientDtoList.size(), patientList.size());
        assertEquals(patientDtoList.get(0).getId(), patientList.get(0).getId());

    }

    @Test
    public void findById() {
    }

    @Test
    public void save() {
    }
}