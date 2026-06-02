package estudos.Fatec.arquiteturas.singletom;

public class ConfiguracaoSingletom {

    private String autor="Guilherme Porto";
    private String urlBanco="132313";
    private Double margemErroFinanceiro=0.05;

    private static ConfiguracaoSingletom instance;

    private ConfiguracaoSingletom(){

    }

    public static ConfiguracaoSingletom getInstance(){
        if (instance == null){
            instance=new ConfiguracaoSingletom();
        }
        return instance;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUrlBanco() {
        return urlBanco;
    }

    public void setUrlBanco(String urlBanco) {
        this.urlBanco = urlBanco;
    }

    public Double getMargemErroFinanceiro() {
        return margemErroFinanceiro;
    }

    public void setMargemErroFinanceiro(Double margemErroFinanceiro) {
        this.margemErroFinanceiro = margemErroFinanceiro;
    }
}
