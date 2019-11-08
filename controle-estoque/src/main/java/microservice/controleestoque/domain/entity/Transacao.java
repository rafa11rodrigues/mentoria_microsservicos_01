package microservice.controleestoque.domain.entity;

import java.time.LocalDate;
import java.util.List;

public class Transacao extends Entity {

    private TipoTransacao tipo;

    private LocalDate data;

    private ItemTransacao item;

    public Transacao(TipoTransacao tipo, LocalDate data, ItemTransacao item) {
        this.tipo = tipo;
        this.data = data;
        this.item = item;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public ItemTransacao getItem() {
        return item;
    }

    public Double getValor() {
        Double valor = item.getProduto().getValor() * item.getQtd();
        return (tipo == TipoTransacao.SAIDA) ? -valor : valor;
    }
}
