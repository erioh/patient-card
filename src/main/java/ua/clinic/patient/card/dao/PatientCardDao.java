package ua.clinic.patient.card.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.clinic.patient.card.dao.entity.Patient;
import ua.clinic.patient.card.dao.entity.PatientCard;

@Repository
public interface PatientCardDao extends CrudRepository<PatientCard, Long> {
}
