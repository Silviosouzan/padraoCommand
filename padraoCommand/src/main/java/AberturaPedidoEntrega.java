public class AberturaPedidoEntrega implements Pedido {

    private Entrega entrega;

    public AberturaPedidoEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public void executar() {
        this.entrega.abrirEntrega();
    }

    public void cancelar() {
        this.entrega.fecharEntrega();
    }
}

