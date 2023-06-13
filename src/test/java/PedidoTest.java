import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido recebido

    @Test
    public void deveAguardarPagamentoPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertTrue(pedido.aguardarPagamento());
        assertEquals(PedidoEstadoAguardandoPagamento.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveAprovarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void deveCancelarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveDevolverPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveSepararPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.separar());
    }

    @Test
    public void naoDeveEnviarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEstornarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido aguardando pagamento

    @Test
    public void naoDeveAguardarPagamentoPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void deveAprovarPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertTrue(pedido.aprovar());
        assertEquals(PedidoEstadoAprovado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveDevolverPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveSepararPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertFalse(pedido.separar());
    }

    @Test
    public void naoDeveEnviarPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEstornarPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoAguardandoPagamento() {
        pedido.setEstado(PedidoEstadoAguardandoPagamento.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido aprovado

    @Test
    public void naoDeveAguardarPagamentoPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void naoDeveAprovarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void deveCancelarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveDevolverPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void deveSepararPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertTrue(pedido.separar());
        assertEquals(PedidoEstadoEmSeparacao.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEnviarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEstornarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido cancelado

    @Test
    public void naoDeveAguardarPagamentoPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void naoDeveAprovarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveDevolverPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveSepararPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.separar());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void deveEstornarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertTrue(pedido.estornar());
        assertEquals(PedidoEstadoEstornado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveReceberPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido devolvido

    @Test
    public void naoDeveAguardarPagamentoPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void naoDeveAprovarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void deveCancelarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveDevolverPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void deveSepararPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertTrue(pedido.separar());
        assertEquals(PedidoEstadoEmSeparacao.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEnviarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEstornarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido em separação

    @Test
    public void naoDeveAguardarPagamentoPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void naoDeveAprovarPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void deveCancelarPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveDevolverPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveSepararPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertFalse(pedido.separar());
    }

    @Test
    public void deveEnviarPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertTrue(pedido.enviar());
        assertEquals(PedidoEstadoEmTransito.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEstornarPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoEmSeparacao() {
        pedido.setEstado(PedidoEstadoEmSeparacao.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido em trânsito

    @Test
    public void naoDeveAguardarPagamentoPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void naoDeveAprovarPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void deveCancelarPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveDevolverPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveSepararPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertFalse(pedido.separar());
    }

    @Test
    public void naoDeveEnviarPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void deveEntregarPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEstornarPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoEmTransito() {
        pedido.setEstado(PedidoEstadoEmTransito.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido entregue

    @Test
    public void naoDeveAguardarPagamentoPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void naoDeveAprovarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void deveDevolverPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertTrue(pedido.devolver());
        assertEquals(PedidoEstadoDevolvido.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveSepararPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.separar());
    }

    @Test
    public void naoDeveEnviarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEstornarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.receber());
    }

    // Pedido estornado

    @Test
    public void naoDeveAguardarPagamentoPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.aguardarPagamento());
    }

    @Test
    public void naoDeveAprovarPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void naoDeveCancelarPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveDevolverPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveSepararPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.separar());
    }

    @Test
    public void naoDeveEnviarPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveEntregarPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveEstornarPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.estornar());
    }

    @Test
    public void naoDeveReceberPedidoEstornado() {
        pedido.setEstado(PedidoEstadoEstornado.getInstance());
        assertFalse(pedido.receber());
    }
}
