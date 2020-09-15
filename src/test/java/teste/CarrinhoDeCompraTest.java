package teste;

import loja.CarrinhoDeCompras;
import loja.Item;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author valeria
 */
public class CarrinhoDeCompraTest {

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        assertEquals(0.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoComUmElemento() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(new Item("Geladeira", 1, 900.0));

        assertEquals(900.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
        
        assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
    }
    
}
