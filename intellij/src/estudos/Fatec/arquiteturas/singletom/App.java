package estudos.Fatec.arquiteturas.singletom;

public class App {

    public static void main(String[] args) {

        ConfiguracaoSingletom c=ConfiguracaoSingletom.getInstance();
        System.out.println("Autor: "+c.getAutor());

        System.out.println("URL: "+ConfiguracaoSingletom.getInstance().getUrlBanco());

    }

}
