public class FechamentoPedidoEntrega implements Pedido {

    private Entrega entrega;

    public FechamentoPedidoEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public void executar() {
        this.entrega.fecharEntrega();
    }

    public void cancelar() {
        this.entrega.abrirEntrega();
    }
}

