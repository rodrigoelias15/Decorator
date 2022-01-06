public class Panela extends CarrinhoDecorator{

    public Panela(CategoriaProduto produto) {
        super(produto);
    }

    @Override
    public float getValor() {
        return 5.2f;
    }

}
