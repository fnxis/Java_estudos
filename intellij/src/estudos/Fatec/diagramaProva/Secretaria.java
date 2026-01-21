package estudos.Fatec.diagramaProva;

import java.util.ArrayList;
import java.util.List;

public class Secretaria implements Matriculavel{

    private List<Matricula> matriculas = new ArrayList<>();


    @Override
    public void matricular(Aluno aluno,Turma turma) {
        for (Matricula matricula : matriculas){
            if (matricula.getAluno().equals(aluno) && matricula.getTurma().equals(turma)){
                System.out.println("Aluno ja matriculado");
                return;
            }
        }
        if (turma.getAlunos().size() >=30){
            System.out.println("Turma lotada");
            return;
        }
        Matricula novaMatricula=new Matricula(aluno,turma);
        matriculas.add(novaMatricula);
        turma.getAlunos().add(aluno);
    }
    @Override
    public void cancelar(Aluno aluno,Turma turma){
        Matricula matriculaCancelar=null;
        for (Matricula matricula : matriculas){
            if (matricula.getAluno().equals(aluno) && matricula.getTurma().equals(turma)){
                matriculaCancelar=matricula;
                break;
            }
        }
        if (matriculaCancelar==null){
            System.out.println("Matricula cancelada");
            return;
        }
        matriculas.remove(matriculaCancelar);
        turma.getAlunos().remove(aluno);
    }


    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}
