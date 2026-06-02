package estudos.Fatec.TecnicasDeProgramacao2.funcoes;

import java.util.*;

public class Apostas {
    private int primeiraDezena;
    private int segundaDezena;
    private int terceiraDezena;
    private int quartaDezena;
    private int quintaDezena;
    private int sextaDezena;
    private List<Integer> listaApostas;
    public Apostas() {
    }

    public List<Integer> getListaApostas() { // Lista de inteiros para poder fazer comparacoes e contabilizar
        return Arrays.asList(primeiraDezena,segundaDezena,terceiraDezena,quartaDezena,quintaDezena, sextaDezena);
    }

    public void setListaApostas(List<Integer> listaApostas) {
        this.listaApostas = listaApostas;
    }

    public int getPrimeiraDezena() {
        return primeiraDezena;
    }

    public void setPrimeiraDezena(int primeiraDezena) {
        this.primeiraDezena = primeiraDezena;
    }

    public int getSegundaDezena() {
        return segundaDezena;
    }

    public void setSegundaDezena(int segundaDezena) {
        this.segundaDezena = segundaDezena;
    }

    public int getTerceiraDezena() {
        return terceiraDezena;
    }

    public void setTerceiraDezena(int terceiraDezena) {
        this.terceiraDezena = terceiraDezena;
    }

    public int getQuartaDezena() {
        return quartaDezena;
    }

    public void setQuartaDezena(int quartaDezena) {
        this.quartaDezena = quartaDezena;
    }

    public int getQuintaDezena() {
        return quintaDezena;
    }

    public void setQuintaDezena(int quintaDezena) {
        this.quintaDezena = quintaDezena;
    }

    public int getSextaDezena() {
        return sextaDezena;
    }

    public void setSextaDezena(int sextaDezena) {
        this.sextaDezena = sextaDezena;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apostas apostas = (Apostas) o;
        return primeiraDezena == apostas.primeiraDezena && segundaDezena == apostas.segundaDezena && terceiraDezena == apostas.terceiraDezena && quartaDezena == apostas.quartaDezena && quintaDezena == apostas.quintaDezena && sextaDezena == apostas.sextaDezena;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primeiraDezena, segundaDezena, terceiraDezena, quartaDezena, quintaDezena, sextaDezena);
    }

    public void NumerosMegasena(Random rand, List<Apostas> listaApostas) { // Metodo para inserir os dados na memoria, nao podendo repetir os numeros por isso o uso do Set
        Apostas a = new Apostas();
        Set<Integer> set = new HashSet<>();
        while (set.size()<6){
            set.add(rand.nextInt(60)+1); // 60 numero(0 a 59) o +1 serve para ser do 1 a 60
        }
        List<Integer> list = new ArrayList<>(set);
        a.setPrimeiraDezena(list.get(0));
        a.setSegundaDezena(list.get(1));
        a.setTerceiraDezena(list.get(2));
        a.setQuartaDezena(list.get(3));
        a.setQuintaDezena(list.get(4));
        a.setSextaDezena(list.get(5));

        listaApostas.add(a); // adiciona a instancia na minha lista de todas apostas

    }

    public Apostas(int primeiraDezena, int segundaDezena, int terceiraDezena, int quartaDezena, int quintaDezena, int sextaDezena) {
        this.primeiraDezena = primeiraDezena;
        this.segundaDezena = segundaDezena;
        this.terceiraDezena = terceiraDezena;
        this.quartaDezena = quartaDezena;
        this.quintaDezena = quintaDezena;
        this.sextaDezena = sextaDezena;
    }

    @Override
    public String toString() { // String formatada
        return "Aposta " +
                "[" + primeiraDezena +
                ", " + segundaDezena +
                ", " + terceiraDezena +
                ", " + quartaDezena +
                ", " + quintaDezena +
                ", " + sextaDezena +
                ']';
    }
}
