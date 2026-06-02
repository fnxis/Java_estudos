package estudos.Fatec.TecnicasDeProgramacao2.revisao.heranca;

public class Teste {
    public static void main(String[] args) {

        Funcionario funcionarioNormal= new Funcionario("Guilherme","Desenvolvedor",7,5000D);
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Leonardo","Contador",13,2000D,5);
        FuncionarioHorista funcionarioHorista=new FuncionarioHorista("Murilo","E-Comerce",9,10D,8);


        System.out.println(funcionarioNormal.toString());
        System.out.println(funcionarioComissionado.toString());
        System.out.println(funcionarioHorista.toString());


    }
}
