package estudos.set.Exercicio1;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String nome;
    private Date moment;

    public LogEntry(String nome, Date moment) {
        this.nome = nome;
        this.moment = moment;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(nome, logEntry.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "nome='" + nome + '\'' +
                ", moment=" + moment +
                '}';
    }
}
