public abstract class CarrinhoDecorator implements CategoriaProduto {

    private CategoriaProduto categoriaProduto;
    public String nome;

    public CarrinhoDecorator(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public abstract float getValor();

    @Override
    public float getValorFrete() {
        return this.categoriaProduto.getValorFrete() + this.getValor();
    }

    @Override
    public String getNome() {
        return this.categoriaProduto.getNome();
    }

    public CategoriaProduto getProduto() {
        return categoriaProduto;
    }

    public void setProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
