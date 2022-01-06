public class AspiradorPo extends CarrinhoDecorator{

    public AspiradorPo(CategoriaProduto produto) {
        super(produto);
    }

    @Override
    public float getValor() {
        return 250.0f;
    }

    @Override
    public String getNomeProduto() {
        return "Aspirador de po";
    }

}
