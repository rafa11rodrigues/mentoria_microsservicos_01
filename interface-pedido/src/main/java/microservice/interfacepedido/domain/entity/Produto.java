package microservice.interfacepedido.domain.entity;

public class Produto extends Entity {

    private String nome;

    private Double valor;


    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
