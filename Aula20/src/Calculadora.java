public class Calculadora {

    public static float calcular(float n1, float n2, String op) 
    throws OperacaoInvalidaException {

        switch (op) {
            case "+":
                return n1 + n2;               
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 == 0) {
                    throw new ArithmeticException("Divisão por zero não permitida");
                }
                return n1 / n2;
            default:
                throw new OperacaoInvalidaException(op);
        }

    }


}
