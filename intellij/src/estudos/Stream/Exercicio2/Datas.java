package estudos.Stream.Exercicio2;

public class Datas {

    private String nome;
    private double salario;
    private String email;

    public Datas(String nome, double salario, String email) {
        this.nome = nome;
        this.salario = salario;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Datas{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", email='" + email + '\'' +
                '}';
    }
}
