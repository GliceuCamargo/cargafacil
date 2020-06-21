
package colecoes;

public class Funcionario {
    private String nome;
    private String registro;
    private double salário;

    public Funcionario(String nome, String registro, double salário) {
        this.nome = nome;
        this.registro = registro;
        this.salário = salário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }
    
}
