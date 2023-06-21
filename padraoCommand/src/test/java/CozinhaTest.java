import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CozinhaTest {

    Cozinha cozinha;
    Entrega entrega;

    @BeforeEach
    void setUp() {
        cozinha = new Cozinha();
        entrega = new Entrega(12, 1);
    }

    @Test
    void deveAbrirEntrega() {
        Pedido aberturaPedidoEntrega = new AberturaPedidoEntrega(entrega);
        cozinha.executarPedido(aberturaPedidoEntrega);

        assertEquals("Entrega aberta", entrega.getSituacao());
    }

    @Test
    void deveFecharEntrega() {
        Pedido fechamentoPedidoEntrega = new FechamentoPedidoEntrega(entrega);
        cozinha.executarPedido(fechamentoPedidoEntrega);

        assertEquals("Entrega fechada", entrega.getSituacao());
    }

    @Test
    void deveCancelarFechamentoEntrega() {
        Pedido aberturaPedidoEntrega = new AberturaPedidoEntrega(entrega);
        Pedido fechamentoPedidoEntrega = new FechamentoPedidoEntrega(entrega);

        cozinha.executarPedido(aberturaPedidoEntrega);
        cozinha.executarPedido(fechamentoPedidoEntrega);

        cozinha.cancelarUltimaPedido();

        assertEquals("Entrega aberta", entrega.getSituacao());
    }

}

