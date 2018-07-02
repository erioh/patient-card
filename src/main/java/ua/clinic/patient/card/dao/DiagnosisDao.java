package ua.clinic.patient.card.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.clinic.patient.card.dao.entity.Diagnosis;
import ua.clinic.patient.card.dao.entity.Patient;

@Repository
public interface DiagnosisDao extends CrudRepository<Diagnosis, Long> {
}
