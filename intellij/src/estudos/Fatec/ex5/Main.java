package estudos.Fatec.ex5;

public class Main {

    public static void main(String[] args) {

        TagSubject tag = new TagSubject();

        Observer bi = new BIObserver();
        Observer fatura = new FaturaObserver();
        Observer notificacao= new NotificacaoObserver();
        Observer contabilidade = new ContabilidadeObserver();

        tag.register(bi);
        tag.register(fatura);
        tag.register(notificacao);
        tag.register(contabilidade);

        Passagem passagem = new Passagem();
        passagem.setTag("123");
        passagem.setData("22/02");
        passagem.setCodPegadio("202");
        passagem.setNome("Guilherme");
        passagem.setPlaca("cxh");
        passagem.setPreco(20.0);

        Passagem passagem2 = new Passagem();
        passagem2.setTag("12342");
        passagem2.setPreco(240.0);
        passagem2.setData("23/02");
        passagem2.setCodPegadio("204");
        passagem2.setPlaca("cxk");
        passagem2.setNome("Leonardo");

        tag.Pedagio(passagem);
        tag.Pedagio(passagem2);
        tag.Pedagio(passagem2);
        tag.Pedagio(passagem2);
        tag.Pedagio(passagem);

        tag.listar();


    }



}
