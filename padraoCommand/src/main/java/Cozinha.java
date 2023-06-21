import java.util.ArrayList;
import java.util.List;

public class Cozinha {

    private List<Pedido> pedidos = new ArrayList<>();

    public void executarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.executar();
    }

    public void cancelarUltimaPedido() {
        if (pedidos.size() != 0) {
            Pedido pedido = this.pedidos.get(this.pedidos.size() - 1);
            pedido.cancelar();
            this.pedidos.remove(this.pedidos.size() - 1);
        }
    }

}
