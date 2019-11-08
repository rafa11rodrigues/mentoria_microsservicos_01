package microservice.controleestoque.service;

import microservice.controleestoque.domain.entity.Transacao;
import microservice.controleestoque.repository.TransacaoRepository;

import java.time.LocalDate;
import java.util.List;

public class FaturamentoService {

    private TransacaoRepository transacaoRepository = TransacaoRepository.getInstance();


    public Double faturamento() {
        return calcularFaturamento(transacaoRepository.findAll());
    }

    public Double faturamento(LocalDate inicio, LocalDate fim) {
        return calcularFaturamento(transacaoRepository.findAllByDataBetween(inicio, fim));
    }

    private Double calcularFaturamento(List<Transacao> transacoes) {
        Double faturamento = 0.0;

        for(Transacao t: transacoes) {
            faturamento += t.getValor();
        }
        return faturamento;
    }
}
