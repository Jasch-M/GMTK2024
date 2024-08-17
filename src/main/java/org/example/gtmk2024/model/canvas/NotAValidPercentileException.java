package org.example.gtmk2024.model.canvas;

public class NotAValidPercentileException extends IllegalArgumentException {
    public NotAValidPercentileException(int value, Reason reason) {
        super(computeErrorMessage(value, reason));
    }

    private static String computeErrorMessage(int value, Reason reason) {
        if (reason == Reason.NEGATIVE) {
            return "Error: NotAValidPercentileException: The value " + value + " is negative but " +
                    "percentile values must be between 0 and 100 (both bounds are inclusive).";
        }

        return "Error: NotAValidPercentileException: The value " + value + " is greater than 100 but " +
                "percentile values must be between 0 and 100 (both bounds are inclusive).";
    }

    public enum Reason {
        NEGATIVE,
        TOO_HIGH;

        public boolean isNegative() {
            return this == NEGATIVE;
        }

        public boolean isTooHigh() {
            return this == TOO_HIGH;
        }
    }
}
