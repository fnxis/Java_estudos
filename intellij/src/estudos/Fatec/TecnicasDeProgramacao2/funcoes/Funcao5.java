package estudos.Fatec.TecnicasDeProgramacao2.funcoes;

import java.util.*;

public class Funcao5 {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Apostas> listaApostas = new ArrayList<>();// Lista com todas as apostas
        Apostar(rand,listaApostas); //Salva a aposta na memoria
        Apostar(rand,listaApostas);
        Apostar(rand,listaApostas);
        List<Integer> ganhadores = Arrays.asList(5,12,34,3,59,21); //Lista ganhadora do premio
        Apostas teste=new Apostas(5,12,3,34,59,21); //Insercao dessa lista para ter um ganhador
        listaApostas.add(teste);// adiciona o teste do ganhador
        ListarApostas(listaApostas);// lista todas as apostas

        System.out.println("\nO numero sorteado foi : "+ganhadores.toString());// String com o numero do ganhador
        Resultado(listaApostas,ganhadores);// Faz a validacao se teve alguem na lista com os mesmos numeros dos numer
        contabilizar(listaApostas);// conta quais os numeros mais sorteados


    }

    public static void Apostar(Random rand,List<Apostas> listaApostas){ // Metodo para salvar as apostas na memoria
        Apostas apostas = new Apostas();
        apostas.NumerosMegasena(rand,listaApostas);// chama um metodo da Classe Aposta para registrar
    }
    public static void ListarApostas(List<Apostas> listaApostas){ // Metodo para listar todas as apostas dentro da Classe Aposta
        for (Apostas apostas : listaApostas) {
            System.out.println(apostas.toString());
        }
    }


    public static  void Resultado(List<Apostas> listaApostas,List<Integer> ganhadores){ // Metodo para validar o resultado
        for (Apostas apostas : listaApostas) { // Passa em todas as apostas na listaAposta

            List<Integer> ganhadorOrdenado= new ArrayList<>(ganhadores); // Cria uma lista de inteiros para conseguir ordenar os numeros do jogo ganhador
            List<Integer> apostaOrdenada=new ArrayList<>(apostas.getListaApostas());// Cria uma lista de inteiros para ordenar os numeros dos jogos feitos

            Collections.sort(apostaOrdenada); // Ordena a lista
            Collections.sort(ganhadorOrdenado); // Ordena a lista

            if (apostaOrdenada.equals(ganhadorOrdenado)){ // valida se a aposta dos jogadores sao igual a aposta ganhadora
                System.out.println("\nA "+ apostas.toString()+ " Foi um dos ganhadores");
            }
        }
    }

    public static void contabilizar(List<Apostas> listaApostas){ // Contabiliza quantas vezes cada numero apareceu na lista
            Map<Integer,Integer> contador = new HashMap<>(); // Map consegue fazer operacoes na lista
            for (Apostas apostas : listaApostas) { // para cada aposta
                for (int numero: apostas.getListaApostas()) { // Para cada numero na aposta
                    contador.put(numero,contador.getOrDefault(numero,0)+1);// contador adiciona no numero o valor encontrado e passa +1 a cada passada
                }
            }
            List<Map.Entry<Integer,Integer>> lista = new ArrayList<>(contador.entrySet()); // lista para ordenar os numeros

            lista.sort((a,b) -> b.getValue().compareTo(a.getValue()));// ordena a lista de forma crescente com o compareTo, o mais repetido aparecera primeiro
            System.out.println("\nNumeros mais apostados:");
            for (Map.Entry<Integer,Integer> entry : lista) { // para cada valor na lista(numero) quantas vezes o valor apareceu
                System.out.println("Numero " + entry.getKey() + " apareceu " + entry.getValue() + " vezes");
            }


    }

}
