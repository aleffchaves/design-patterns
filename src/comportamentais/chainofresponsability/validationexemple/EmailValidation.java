package comportamentais.chainofresponsability.validationexemple;

public class EmailValidation implements Validation {
    @Override
    public boolean isValid(final String input) {
        return input != null && !input.isEmpty() && input.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    @Override
    public String getErrorMessage() {
        return "Invalid email address.";
    }
}
