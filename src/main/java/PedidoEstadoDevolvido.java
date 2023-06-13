public class PedidoEstadoDevolvido extends PedidoEstado {
    private PedidoEstadoDevolvido() {};
    private static PedidoEstadoDevolvido instance = new PedidoEstadoDevolvido();
    public static PedidoEstadoDevolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Devolvido";
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public boolean separar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        return true;
    }
}
