package microservice.controleestoque.repository;

import microservice.controleestoque.domain.entity.Transacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransacaoRepository {

    private static Long id = 0L;

    private List<Transacao> transacoes = new ArrayList<>();


    private static TransacaoRepository instance;

    private TransacaoRepository() {}

    public static TransacaoRepository getInstance() {
        if(instance == null) {
            instance = new TransacaoRepository();
        }
        return instance;
    }

    public List<Transacao> findAll() {
        return new ArrayList<>(transacoes);
    }

    public List<Transacao> findAllByDataBetween(LocalDate inicio, LocalDate fim) {
        List<Transacao> result = new ArrayList<>();
        for(Transacao t: transacoes) {
            if((t.getData().isAfter(inicio) && t.getData().isBefore(fim))
            || t.getData().equals(inicio) || t.getData().equals(fim)) result.add(t);
        }
        return result;
    }

    public Transacao findById(Long id) {
        for(Transacao t: transacoes) {
            if(t.getId() == id) return t;
        }
        return null;
    }

    public Transacao sav(Transacao transacao) {
        transacao.setId(++id);
        transacoes.add(transacao);
        return transacao;
    }
}
