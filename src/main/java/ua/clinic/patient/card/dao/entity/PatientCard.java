package ua.clinic.patient.card.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "patient_card")
public class PatientCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Patient patient;

    @OneToOne
    private Diagnosis diagnosis;

    @OneToOne
    private Complaint complaint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientCard that = (PatientCard) o;
        return Objects.equals(patient, that.patient);
    }

    @Override
    public int hashCode() {

        return Objects.hash(patient);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PatientCard{");
        sb.append("id=").append(id);
        sb.append(", patient=").append(patient);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", complaint=").append(complaint);
        sb.append('}');
        return sb.toString();
    }
}
