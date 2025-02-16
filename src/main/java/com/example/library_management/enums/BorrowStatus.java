package com.example.library_management.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BorrowStatus {

    RETURNED("Returned"),
    NOT_RETURNED("Not Returned");

    private String value;

    BorrowStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
