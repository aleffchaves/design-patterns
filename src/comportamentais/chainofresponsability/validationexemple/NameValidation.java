package comportamentais.chainofresponsability.validationexemple;

public class NameValidation implements Validation {

    @Override
    public boolean isValid(final String input) {
        return input != null && !input.isEmpty();
    }

    @Override
    public String getErrorMessage() {
    return "Invalid Name...";
    }
}
