package entities;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Usuario{

    //Dados dos alunos - data de nascimento, rotinas a serem realizadas e agendamentos.
    private Date dataNasc;
    private Rotina rotina;

    private Agendamento agendamento;

    ArrayList<Instrutor>instrutors;

    void realizarExercicios(){

    }

    //Getter and Setter

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Rotina getRotina() {
        return rotina;
    }

    public void setRotina(Rotina rotina) {
        this.rotina = rotina;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
}
