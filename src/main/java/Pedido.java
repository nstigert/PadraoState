public class Pedido {
    private int codPedido;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoRecebido.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public boolean receber() {
        return estado.receber(this);
    }

    public boolean aguardarPagamento() {
        return estado.aguardarPagamento(this);
    }

    public boolean aprovar() {
        return estado.aprovar(this);
    }

    public boolean separar() {
        return estado.separar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean estornar() {
        return estado.estornar(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public int getNome() {
        return codPedido;
    }

    public void setNome(int codPedido) {
        this.codPedido = codPedido;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
