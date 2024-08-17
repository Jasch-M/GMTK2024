package org.example.gtmk2024.model.canvas;

import lombok.Getter;


public record Percentile(int value) {

    public static final int MINIMUM_VALUE = 0;

    public static final int MAXIMUM_VALUE = 100;

    /**
     * @throws NotAValidPercentileException
     */
    public Percentile {
        if (value < MINIMUM_VALUE || value > MAXIMUM_VALUE) {
            NotAValidPercentileException.Reason reason = value < MINIMUM_VALUE ? NotAValidPercentileException.Reason.NEGATIVE : NotAValidPercentileException.Reason.TOO_HIGH;
            throw new NotAValidPercentileException(value, reason);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Percentile that = (Percentile) o;
        return value == that.value;
    }

    @Override
    public String toString() {
        return value + "%";
    }
}
