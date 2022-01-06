public class Panela extends CarrinhoDecorator{

    public Panela(CategoriaProduto produto) {
        super(produto);
    }

    @Override
    public float getValor() {
        return 100.0f;
    }

    @Override
    public String getNomeProduto(){
        return "Panela";
    };

}
