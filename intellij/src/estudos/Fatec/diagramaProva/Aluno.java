package estudos.Fatec.diagramaProva;

import java.util.Date;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String dataNascimento, String endereco, String matricula) {
        super(nome, dataNascimento, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
