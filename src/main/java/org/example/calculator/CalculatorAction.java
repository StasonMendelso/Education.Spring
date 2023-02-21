package org.example.calculator;

/**
 * @author Stanislav Hlova
 */
public enum CalculatorAction {
    MULTIPLICATION("multiplication"),
    ADDITION("addition"),
    SUBTRACTION("subtraction"),
    DIVISION("division");
    private final String name;

    CalculatorAction(String name) {
        this.name = name;
    }

    public static CalculatorAction getInstance(String action) {
        for (CalculatorAction value : CalculatorAction.values()) {
            if (value.name.equalsIgnoreCase(action)) {
                return value;
            }
        }
        return null;
    }
}
