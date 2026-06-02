package estudos.Fatec.TecnicasDeProgramacao2.modelagem;

public class app {
    public static void main(String[] args) {

        Bebida cafe =new Cafe("cafezinhooo");
        System.out.println(cafe.getDescricao()+cafe.getpreco());

        Bebida capuccino = new Capuccino(cafe);
        System.out.println(capuccino.getDescricao()+capuccino.getpreco());

    }
}
