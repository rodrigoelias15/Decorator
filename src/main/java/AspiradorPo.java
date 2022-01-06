public class AspiradorPo extends CarrinhoDecorator{

    public AspiradorPo(CategoriaProduto produto) {
        super(produto);
    }

    @Override
    public float getValor() {
        return 10.2f;
    }

}
