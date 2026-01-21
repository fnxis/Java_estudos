package estudos.Fatec.diagramaProva;

public interface Avaliacao {

    public void registrarNota(Aluno aluno,Disciplina disciplina,double nota);
    public void registrarFrequencia(Aluno aluno,Disciplina disciplina,Boolean presente);

}
