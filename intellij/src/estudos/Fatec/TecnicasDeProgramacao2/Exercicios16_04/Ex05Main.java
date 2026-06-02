package estudos.Fatec.TecnicasDeProgramacao2.Exercicios16_04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ex05Main {

    public static void main(String[] args) {
        List<Ex05Jogador> time = new ArrayList<>();

        time.add(new Ex05Jogador(1, "Marcelo Grohe", "Muralha Tricolor", new Date(87, 0, 13), 1, "Goleiro", 85, 3, true));
        time.add(new Ex05Jogador(2, "Marcelo Hermes", "Hermes", new Date(95, 1, 1), 2, "Lateral Direito", 70, 0, false));
        time.add(new Ex05Jogador(3, "Geromel1", "Geromito1", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(4, "Geromel2", "Geromito2", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(5, "Geromel3", "Geromito3", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(6, "Geromel4", "Geromito4", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(7, "Geromel5", "Geromito5", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(8, "Geromel6", "Geromito6", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(9, "Geromel7", "Geromito7", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(10, "Geromel8", "Geromito8", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));
        time.add(new Ex05Jogador(11, "Geromel9", "Geromito9", new Date(85, 8, 21), 3, "Zagueiro", 90, 1, false));


        System.out.println("JOGADORES CADASTRADOS");
        for (Ex05Jogador j : time) {
            System.out.println(j.toString());
        }
    }

}
