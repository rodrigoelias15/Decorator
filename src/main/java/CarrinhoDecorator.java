public abstract class CarrinhoDecorator implements CategoriaProduto {

    private CategoriaProduto categoriaProduto;
    public String nome;

    public CarrinhoDecorator(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public abstract float getValor();

    @Override
    public float getValorTotal() {
        return this.categoriaProduto.getValorTotal() + this.getValor();
    }

    @Override
    public String getNome() {
        return this.categoriaProduto.getNome() + "/" + getNomeProduto();
    }

    public abstract String getNomeProduto();

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
