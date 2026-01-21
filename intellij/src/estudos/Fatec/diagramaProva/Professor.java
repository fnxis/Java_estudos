package estudos.Fatec.diagramaProva;

import java.util.Date;

public class Professor extends Pessoa{

    private String registro;

    public Professor(String nome, String dataNascimento, String endereco, String registro) {
        super(nome, dataNascimento, endereco);
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
