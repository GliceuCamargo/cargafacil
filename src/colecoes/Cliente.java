
package colecoes;

public class Cliente {
    private String nome;
    private String cpf;
    private double debito;

    public Cliente(String nome, String cpf, double debito) {
        this.nome = nome;
        this.cpf = cpf;
        this.debito = debito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }
    
}
