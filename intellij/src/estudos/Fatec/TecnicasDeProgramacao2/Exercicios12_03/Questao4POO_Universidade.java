package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.ArrayList;
import java.util.List;

public class Questao4POO_Universidade {

    private String nome;
    private List<Questao4POO_Departamento> departamentos;

    public Questao4POO_Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Questao4POO_Departamento d) {
        departamentos.add(d);
    }

    public void listarDepartamentos() {
        System.out.println("Departamentos da " + nome + ":");
        for (Questao4POO_Departamento d : departamentos) {
            System.out.println(d);
        }
    }

}
