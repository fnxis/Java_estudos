package estudos.Fatec.TecnicasDeProgramacao2.modelagem;

public class Cafe extends Bebida {

    public Cafe(String descricao) {
        super.descricao = "Cafe gostoso" ;
    }

    @Override
    public String getDescricao() {
      return super.descricao;
    }

    @Override
    public Double getpreco() {
        return 10.0;
    }
}
