package estudos.Fatec;

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {
        //criando um ArrayList sem definir o tamanho inicial
        ArrayList<String> lista = new ArrayList<String>();

        //adicionando elementos da lista
        lista.add("Fatec");
        lista.add("DSM");
        lista.add("2 Semestre");

        //acessando elementos da lista
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println("Apenas a posiçao 0: " + lista.get(0));

        //tamanho da lista

        System.out.println("Tamanho da lista : " + lista.size());
    }
}
