package estudos.Fatec.diagramaProva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Secretaria secretaria = new Secretaria();
        DiarioDeClasse diarioDeClasse = new DiarioDeClasse();

        Professor professor1=new Professor("Alexandre","03/07/1980","Casa dele","PROF01");
        Professor professor2=new Professor("Fausto","01/01/1975","Casa dele","PROF02");


        Disciplina disciplina1=new Disciplina("POO",80,professor1);
        Disciplina disciplina=new Disciplina("ED",90,professor2);


        Turma turmaA=new Turma("DSM-2",2025,professor1,disciplina1);
        Turma turmaB=new Turma("DSM-1",2024,professor2,disciplina);


        Aluno aluno1=new Aluno("Maria souza","02/09/98","Rua C","2025001");
        Aluno aluno2=new Aluno("Pedro santos","22/02/2007","Rua B","2025002");
        Aluno aluno3=new Aluno("Jose amaral","22/03/2006","Rua A","2025003");

        secretaria.matricular(aluno1,turmaA);
        secretaria.matricular(aluno2,turmaB);
        secretaria.matricular(aluno3,turmaA);

        diarioDeClasse.registrarNota(aluno1,disciplina1,9.5);
        diarioDeClasse.registrarNota(aluno1,disciplina,10);
        diarioDeClasse.registrarFrequencia(aluno1,disciplina1,true);
        diarioDeClasse.registrarFrequencia(aluno1,disciplina,false);
        diarioDeClasse.registrarNota(aluno2,disciplina,10);
        diarioDeClasse.registrarNota(aluno2,disciplina1,8);
        diarioDeClasse.registrarFrequencia(aluno2,disciplina1,true);
        diarioDeClasse.registrarFrequencia(aluno2,disciplina,false);
        diarioDeClasse.registrarNota(aluno3,disciplina,10);
        diarioDeClasse.registrarNota(aluno3,disciplina,8);
        diarioDeClasse.registrarFrequencia(aluno3,disciplina,true);
        diarioDeClasse.registrarFrequencia(aluno3,disciplina,false);

        System.out.println("Alunos matriculados na turma "+turmaA.getCodigo()+":");

        for(Aluno aluno:turmaA.getAlunos()){
            System.out.println("- "+aluno.getNome()+"(Matricula) "+aluno.getMatricula());
        }

        System.out.println("Alunos matriculados na turma "+turmaB.getCodigo()+":");

        for(Aluno aluno:turmaB.getAlunos()){
            System.out.println("- "+aluno.getNome()+"(Matricula) "+aluno.getMatricula());
        }

        System.out.println("Nota do aluno "+aluno1.getNome()+" em "+ disciplina.getNome()+":");

    }
}
