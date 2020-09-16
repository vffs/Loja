package teste;

import loja.CarrinhoDeCompras;
import loja.Item;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author valeria
 */
public class CarrinhoDeCompraTest {
    CarrinhoDeCompras carrinho;
    
    @Before
    public void inicializa(){
        this.carrinho = new CarrinhoDeCompras();
    }
    

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {     
        assertEquals(0.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoComUmElemento() {
        
        this.carrinho.adiciona(new Item("Geladeira", 1, 900.0));

        assertEquals(900.0, this.carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {    
        this.carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        this.carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        this.carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
        
        assertEquals(1500.0, this.carrinho.maiorValor(), 0.0001);
    }
    
}
