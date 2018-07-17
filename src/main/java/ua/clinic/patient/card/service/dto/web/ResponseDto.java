package ua.clinic.patient.card.service.dto.web;

public class ResponseDto<T> {
    T body;

    public ResponseDto(T body) {
        this.body = body;
    }

    public T getBody() {
        return body;
    }
}
