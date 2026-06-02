package estudos.Fatec.TecnicasDeProgramacao2.pacotes;

import estudos.Fatec.TecnicasDeProgramacao2.pacotes.aula.Curso;

public class Teste {
    public static void main(String[] args) {
        estudos.Fatec.TecnicasDeProgramacao2.pacotes.Aluno aluno = new Aluno();
        aluno.nome = "Aluno";
        aluno.curso = "Curso";
        System.out.println(aluno.getNome());

        Curso curso = new Curso();
        curso.descricao="tp2";
    }
}
