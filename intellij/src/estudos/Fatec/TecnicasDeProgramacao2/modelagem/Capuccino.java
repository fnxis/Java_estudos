package estudos.Fatec.TecnicasDeProgramacao2.modelagem;

public class Capuccino extends BebidaDecorator{

    private Bebida bebida;
    public Capuccino(Bebida bebida) {
        this.bebida = bebida;
        super.descricao = "Capuccino quente";
    }

    @Override
    public String getDescricao() {
        return super.descricao;
    }

    @Override
    public Double getpreco() {
        return this.bebida.getpreco()+5.0;
    }
}
