public class OperacaoSaque extends Operacao {
    public OperacaoSaque(double valor) {
        super('s', valor);
        setTipo('s');
        setValor(valor);
    }
}