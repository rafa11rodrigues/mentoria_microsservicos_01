package microservice.controleestoque.service;

import microservice.controleestoque.domain.entity.ItemTransacao;
import microservice.controleestoque.domain.entity.Produto;
import microservice.controleestoque.domain.entity.TipoTransacao;
import microservice.controleestoque.domain.entity.Transacao;
import microservice.controleestoque.repository.TransacaoRepository;

import java.time.LocalDate;
import java.util.List;

public class TransacaoService {

    private TransacaoRepository transacaoRepository = TransacaoRepository.getInstance();


    private Transacao novaTransacao(Produto produto, Long qtd, TipoTransacao tipo) {
        ItemTransacao it = new ItemTransacao(produto, qtd);
        Transacao t = new Transacao(tipo, LocalDate.now(), it);
        return t;
    }

    public Transacao novaEntrada(Produto produto, Long qtd) {
        return novaTransacao(produto, qtd, TipoTransacao.ENTRADA);
    }

    public Transacao novaSaida(Produto produto, Long qtd) {
        return novaTransacao(produto, qtd, TipoTransacao.SAIDA);
    }
}
