public class UtensiliosCasa implements CategoriaProduto {

    public float valorTotal;

    public UtensiliosCasa(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public float getValorTotal() {
        return valorTotal;
    }

    @Override
    public String getNome() {
        return "Utensílio de casa";
    }

}
