package com.example.library_management.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PersonStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    private final String value;

    PersonStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
