public class PedidoEstadoCancelado extends PedidoEstado {
    private PedidoEstadoCancelado() {};
    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();
    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }

    public boolean estornar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        return true;
    }
}
