package estudos.Fatec.diagramaClassePessoa;

import java.util.Calendar;
import java.util.Date;

public abstract class Fisica extends Pessoa {

    private String cpf;
    private String rg;
    private String genero;
    private Date nasc;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getNasc() {
        return nasc;
    }

    public void setNasc(int ano, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.DAY_OF_MONTH, dia);
        this.nasc = cal.getTime();
    }
}
