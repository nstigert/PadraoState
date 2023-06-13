public class PedidoEstadoAprovado extends PedidoEstado {
    private PedidoEstadoAprovado() {};
    private static PedidoEstadoAprovado instance = new PedidoEstadoAprovado();
    public static PedidoEstadoAprovado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aprovado";
    }

    public boolean separar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
