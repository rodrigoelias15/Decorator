public class UtensiliosCasa implements CategoriaProduto {

    public float valorFrete;

    public UtensiliosCasa(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    @Override
    public float getValorFrete() {
        return 0;
    }

    @Override
    public String getNome() {
        return "Utensílio de casa";
    }
}
