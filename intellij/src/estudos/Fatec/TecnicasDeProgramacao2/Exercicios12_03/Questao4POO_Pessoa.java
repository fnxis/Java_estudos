package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

public class Questao4POO_Pessoa {

    private String nome;
    private String dataNascimento;
    private Questao4POO_Departamento departamento;

    public Questao4POO_Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void associarDepartamento(Questao4POO_Departamento d) {
        this.departamento = d;
    }

    public void informarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nascimento: " + dataNascimento);

        if (departamento != null) {
            System.out.println("Departamento: " + departamento.getNome());
        } else {
            System.out.println("Sem departamento.");
        }
    }

}
