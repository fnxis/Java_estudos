package estudos.Fatec.TecnicasDeProgramacao2.Revisao2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;
    private Double salario;
    private String cargo;
    private List<Double> historicoSalario=new ArrayList<Double>();
    private List<String> historicoNome=new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().length()<=5  || nome==null || nome.trim()=="") {
            System.out.println("Nome invalido");
            return;
        }
        historicoNome.add(nome);
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if (salario==null || salario<=0 ){
            return;
        }
        historicoSalario.add(salario);
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", historicoSalario=" + historicoSalario +
                ", historicoNome=" + historicoNome +
                '}';
    }
}
