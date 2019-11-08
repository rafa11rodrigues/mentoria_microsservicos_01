package microservice.interfacepedido.domain.entity;

public class Cliente extends Entity {

    private String nome;

    private String cpf;


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
