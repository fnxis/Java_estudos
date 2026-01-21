package estudos.Fatec.diagramaAnimal;

public class teste {
    public static void main(String[] args) {

        Cavalo cavalo = new Cavalo();
        Cavalo cavalo2 = new Cavalo();
        Leao leao = new Leao();
        Leao leao2 = new Leao();

        cavalo.setRaca("Mandaloriano");
        cavalo.setTamanho((float)2.10);
        cavalo.setCor("Preto com manchas brancas.");

        cavalo2.setRaca("Smeegle");
        cavalo2.setTamanho((float)2.50);
        cavalo2.setCor("quartzo");

        leao.setJuba(true);
        leao.setCor("Amarelo");
        leao.setTamanho((float)1.10);

        leao2.setJuba(false);
        leao2.setCor("Amarelo mostarda");
        leao2.setTamanho((float)1.40);

        System.out.println("###Cavalo 01###");
        System.out.println(cavalo.getRaca());
        System.out.println(cavalo.getTamanho());
        System.out.println(cavalo.getCor());
        cavalo.fugir();

        System.out.println("###Cavalo 02###");
        System.out.println(cavalo2.getRaca());
        System.out.println(cavalo2.getTamanho());
        System.out.println(cavalo2.getCor());
        cavalo2.comer();

        System.out.println("###Leao 01###");
        System.out.println(leao.getJuba());
        System.out.println(leao.getCor());
        System.out.println(leao.getTamanho());
        leao.cacar();

        System.out.println("###Leao 02###");
        System.out.println(leao2.getJuba());
        System.out.println(leao2.getCor());
        System.out.println(leao2.getTamanho());
        leao2.comer();

    }
}
