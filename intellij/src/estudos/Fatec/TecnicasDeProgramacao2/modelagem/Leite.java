package estudos.Fatec.TecnicasDeProgramacao2.modelagem;

public class Leite extends Bebida{

    public Leite() {
        super.descricao = "Leite cremoso";
    }

    @Override
    public String getDescricao() {
        return super.descricao;
    }

    @Override
    public Double getpreco() {
        return 5.0;
    }
}
