package estudos.Fatec.diagramaProva;

import java.util.ArrayList;
import java.util.List;

public class DiarioDeClasse implements Avaliacao{

    private List<Nota> notas;
    private List<Frequencia> frequencias;
    @Override
    public void registrarNota(Aluno aluno,Disciplina disciplina,double nota){
        notas.add(new Nota(aluno,disciplina,nota));
    }
    @Override
    public void registrarFrequencia(Aluno aluno,Disciplina disciplina,Boolean presente){
        frequencias.add(new Frequencia(aluno,disciplina,presente));
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }

    public List<Double> selecionarNotas(Aluno aluno,Disciplina disciplina){
        List<Double> lista = new ArrayList<>();
        for (Nota nota : notas){
            if(nota.getDisciplina().equals(disciplina) && nota.getAluno().equals(aluno)){
                lista.add(nota.getValor());
            }
        }
        return lista;
    }

    public List<Boolean> selecionarFrequencia(Aluno aluno,Disciplina disciplina){
        List<Boolean> lista = new ArrayList<>();
        for (Frequencia frequencia : frequencias){
            if(frequencia.getDisciplina().equals(disciplina) && frequencia.getAluno().equals(aluno)){
                lista.add(frequencia.getPresente());
            }
        }
        return lista;
    }

}
