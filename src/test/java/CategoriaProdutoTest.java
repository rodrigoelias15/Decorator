import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaProdutoTest {

    @Test
    void deveRetornarValorTotalCategoriaProduto() {
        CategoriaProduto categoriaProduto = new UtensiliosCasa(100.0f);
        assertEquals(100.0f, categoriaProduto.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCategoriaProdutoComPanela() {
        CategoriaProduto categoriaProduto = new Panela(new UtensiliosCasa(100.0f));
        assertEquals(200.0f, categoriaProduto.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCategoriaProdutoComAspiradorPo() {
        CategoriaProduto categoriaProduto = new AspiradorPo(new UtensiliosCasa(100.0f));
        assertEquals(350.0f, categoriaProduto.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCategoriaProdutoComTodosProdutos() {
        CategoriaProduto categoriaProduto = new Panela(new AspiradorPo(new UtensiliosCasa(100.0f)));
        assertEquals(450.0f, categoriaProduto.getValorTotal());
    }

    @Test
    void deveRetornarNomeProdutoPanela() {
        CategoriaProduto categoriaProduto = new Panela(new UtensiliosCasa(100.0f));
        assertEquals("Panela", categoriaProduto.getNome());
    }

    @Test
    void deveRetornarNomeProdutoAspiradorPo() {
        CategoriaProduto categoriaProduto = new AspiradorPo(new UtensiliosCasa(100.0f));
        assertEquals("Aspirador de po", categoriaProduto.getNome());
    }

    @Test
    void deveRetornarNomeProdutoAspiradorPoPanela() {
        CategoriaProduto categoriaProduto = new Panela(new AspiradorPo(new UtensiliosCasa(100.0f)));
        assertEquals("Utensílio de casa/Aspirador de po/Panela", categoriaProduto.getNome());
    }

}