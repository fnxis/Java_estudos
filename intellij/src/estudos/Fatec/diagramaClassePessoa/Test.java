package estudos.Fatec.diagramaClassePessoa;

public class Test {
    public static void main(String[] args) {
        Colaborador colab1=new Colaborador();

        colab1.setNome("Guilherme");
        colab1.setCpf("123456789");
        colab1.setBairro("St terezinha");
        colab1.setCidade("Franca");
        colab1.setNasc(22,02,2007);

        Parceiro par1=new Parceiro();

        par1.setNome("Fatec");
        par1.setCnpj("123456789");
        par1.setFundacao(null);

        System.out.println("Bairro do colaborador: "+colab1.getNome()+": "+colab1.getBairro());
        System.out.println("Nascimento do Colaborador: "+ colab1.getNome()+": "+colab1.getNasc());
        System.out.println("Empresa parceira: "+par1.getNome());
        par1.cadastrar();
        System.out.println("CNPJ da empresa " + par1.getNome()+": "+par1.getCnpj());

    }
}
