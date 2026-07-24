class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {

        if(operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if(operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        return switch (operation) {
            case "+" -> String.format("%d + %d = %d" , operand1, operand2, operand1 + operand2);
            case "*" -> String.format("%d * %d = %d" , operand1, operand2, operand1 * operand2);
            case "/" -> executeDivision(operand1, operand2, operation);
            default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        };
    }

    public String executeDivision(int operand1, int operand2, String operation) {
        try{
            return String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
        } catch(ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
