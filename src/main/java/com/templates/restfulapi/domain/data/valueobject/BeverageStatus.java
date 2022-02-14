package com.templates.restfulapi.domain.data.valueobject;

import java.util.Optional;

public enum BeverageStatus {
    INACTIVE,
    ACTIVE {
        @Override
        public boolean isActive() {
            return true;
        }
    };

    public static Optional<BeverageStatus> matchStatus(String name) {
        try {
            return Optional.of(BeverageStatus.valueOf(name.toUpperCase()));
        } catch (IllegalArgumentException ex) {
            return Optional.empty();
        }
    }

    public static BeverageStatus getStatus(String name) {
        return BeverageStatus.valueOf(name.toUpperCase());
    }

    public boolean isActive() {
        return false;
    }
}
