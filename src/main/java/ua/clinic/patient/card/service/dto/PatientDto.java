package ua.clinic.patient.card.service.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class PatientDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String patronymic;

    private Integer sex;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;

    private AddressDto address;

    private Set<PhoneDto> phoneSet;

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

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public Set<PhoneDto> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(Set<PhoneDto> phoneSet) {
        this.phoneSet = phoneSet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PatientDto{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", sex=").append(sex);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", address=").append(address);
        sb.append(", phoneSet=").append(phoneSet);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientDto that = (PatientDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(patronymic, that.patronymic) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phoneSet, that.phoneSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, patronymic, sex, dateOfBirth, address, phoneSet);
    }
}
