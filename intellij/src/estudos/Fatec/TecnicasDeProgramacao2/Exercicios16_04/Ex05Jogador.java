package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05Jogador {

    private int id;
    private String nome;
    private String apelido;
    private Date dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private boolean suspenso;

    public Ex05Jogador() {}

    public Ex05Jogador(int id, String nome, String apelido, Date dataNascimento, int numero,
                   String posicao, int qualidade, int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }

    public boolean verificarCondicaoDeJogo() {
        if (this.cartoes >= 3 || this.suspenso) {
            return false;
        }
        return true;
    }

    public void aplicarCartao(int quantidade) {
        this.cartoes += quantidade;
        if (this.cartoes >= 3) {
            this.suspenso = true;
        }
    }

    public void cumprirSuspensao() {
        this.cartoes = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        double prob = Math.random() * 100;
        int reducao = 0;

        if (prob <= 5) {
            reducao = (int) (this.qualidade * 0.15);
        } else if (prob <= 15) {
            reducao = (int) (this.qualidade * 0.10);
        } else if (prob <= 30) {
            reducao = (int) (this.qualidade * 0.05);
        } else if (prob <= 60) {
            reducao = 2;
        } else {
            reducao = 1;
        }

        this.qualidade -= reducao;
        if (this.qualidade < 0) this.qualidade = 0;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        String condicao = verificarCondicaoDeJogo() ? "TÁ PRA JOGO" : "SUSPENSO";
        return String.format("%s: %d - %s (%s) - %s CONDIÇÃO: %s",
                posicao, numero, nome, apelido, sdf.format(dataNascimento), condicao);
    }

}
