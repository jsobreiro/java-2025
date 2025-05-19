public class OperacaoInvalidaException extends Exception {

    public OperacaoInvalidaException(String op) {
        super("Operação inválida: " + op);
    }

}
