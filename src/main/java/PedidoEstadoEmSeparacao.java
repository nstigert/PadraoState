public class PedidoEstadoEmSeparacao extends PedidoEstado {
    private PedidoEstadoEmSeparacao() {};
    private static PedidoEstadoEmSeparacao instance = new PedidoEstadoEmSeparacao();
    public static PedidoEstadoEmSeparacao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em separação";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
