package estudos.Fatec.TecnicasDeProgramacao2.Exercicios12_03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Questao5POO_Universidade {
    private Set<Questao5POO_Departamento> departamentos;

    public Questao5POO_Universidade() {
        this.departamentos = new HashSet<>();
    }

    // a) Associar departamentos
    public void adicionarDepartamento(Questao5POO_Departamento d) {
        departamentos.add(d);
    }

    // b) Exibir relação de departamentos
    public void exibirDepartamentos() {
        for (Questao5POO_Departamento d : departamentos) {
            System.out.println(d);
        }
    }

    // c) Procurar departamento
    public void buscarDepartamento(Questao5POO_Departamento d) {
        if (departamentos.contains(d)) {
            for (Questao5POO_Departamento dep : departamentos) {
                if (dep.equals(d)) {
                    System.out.println("Encontrado: " + dep);
                    return;
                }
            }
        } else {
            System.out.println("Departamento não encontrado.");
        }
    }
}
