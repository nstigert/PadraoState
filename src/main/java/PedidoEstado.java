public abstract class PedidoEstado {
    public abstract String getEstado();

    public boolean receber(Pedido pedido) {
        return false;
    }

    public boolean aguardarPagamento(Pedido pedido) {
        return false;
    }

    public boolean aprovar(Pedido pedido) {
        return false;
    }

    public boolean separar(Pedido pedido) {
        return false;
    }

    public boolean enviar(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }

    public boolean estornar(Pedido pedido) {
        return false;
    }

    public boolean devolver(Pedido pedido) {
        return false;
    }
}
