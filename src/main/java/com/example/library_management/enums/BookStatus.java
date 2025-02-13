package com.example.library_management.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BookStatus {

    AVAILABLE("Available"),
    NOT_AVAILABLE("Not Available");

    private String value;

    BookStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}

// CHECKED_OUT("Checked Out"),
// RESERVED("Reserved"),
// LOST("Lost"),
// DAMAGED("Damaged"),
// UNDER_MAINTENANCE("Under Maintenance");