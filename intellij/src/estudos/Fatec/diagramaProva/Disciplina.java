package estudos.Fatec.diagramaProva;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private List<Turma> turmas=new ArrayList<>();

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
}
