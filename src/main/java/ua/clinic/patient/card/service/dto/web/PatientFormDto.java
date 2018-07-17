package ua.clinic.patient.card.service.dto.web;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class PatientFormDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String patronymic;

    private Integer sex;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;

    private String addressText;

    private Set<String> phoneSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText = addressText;
    }

    public Set<String> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(Set<String> phoneSet) {
        this.phoneSet = phoneSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientFormDto that = (PatientFormDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(addressText, that.addressText) &&
                Objects.equals(phoneSet, that.phoneSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, patronymic, sex, dateOfBirth, addressText, phoneSet);
    }


}
