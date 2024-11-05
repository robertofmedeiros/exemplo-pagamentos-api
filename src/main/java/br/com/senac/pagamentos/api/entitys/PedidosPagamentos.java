package br.com.senac.pagamentos.api.entitys;

import jakarta.persistence.*;

public class PedidosPagamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private FormasPagamentoEnum formaPagamento;

    @Column
    private Double valorPago;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedidos pedidos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormasPagamentoEnum getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormasPagamentoEnum formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }
}
