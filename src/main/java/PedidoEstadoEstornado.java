public class PedidoEstadoEstornado extends PedidoEstado {
    private PedidoEstadoEstornado() {};
    private static PedidoEstadoEstornado instance = new PedidoEstadoEstornado();
    public static PedidoEstadoEstornado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Estornado";
    }
}
