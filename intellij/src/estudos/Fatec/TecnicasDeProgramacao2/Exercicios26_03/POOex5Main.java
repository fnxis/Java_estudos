package estudos.Fatec.TecnicasDeProgramacao2.Exercicios26_03;

import java.util.ArrayList;

public class POOex5Main {

    public static void main(String[] params){
        ArrayList<POOex5Pessoa> lista =new ArrayList<POOex5Pessoa>();

        POOex5Trabalhador t1 = new POOex5Trabalhador("jorge",2000.0);
        POOex5Trabalhador t2 = new POOex5Trabalhador("jose",5600.0);
        POOex5Estudante e1 = new POOex5Estudante("luiz", 23);
        POOex5Estudante e2 = new POOex5Estudante("tatiane", 21);

        lista.add(t1);
        lista.add(t2);
        lista.add(e1);
        lista.add(e2);

        for( POOex5Pessoa p : lista ){
            p.reportar();
        }
    }


}
