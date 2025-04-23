package com.vbc.type.finalclass;

public class FinalClassExample {
    public static void main(String[] args) {
        ImmutableValue val = new ImmutableValue(42);
        System.out.println("Value: " + val.getValue());  // Output: Value: 42

        // This would cause a compile error:
        // class ExtendedValue extends ImmutableValue {}
    }

    static final class ImmutableValue {
        private final int value;

        public ImmutableValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}