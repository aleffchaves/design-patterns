package comportamentais.chainofresponsability.validationexemple;

//Interface para as validações
public interface Validation {
    boolean isValid(final String input);
    String getErrorMessage();
}
