package teste;

import loja.CarrinhoDeCompras;
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
}
