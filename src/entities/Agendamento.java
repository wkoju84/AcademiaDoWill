package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Agendamento {

    //Registros válidos para agendamentos
    private String sigla;
    private Date data = new Date();
   
    //Listas com instrutor, aluno e rotina

    private ArrayList<Instrutor> instrutores;
    private ArrayList<Aluno>alunos;
    private ArrayList<Rotina>rotinas;

    //Realiza agendamento
    public Agendamento(){
        alunos = new ArrayList<Aluno>();
    }

    //adiciona alunos novos
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    //Mostra quantidade de alunos
    public int quantidadeAlunos(){
        return alunos.size();
    }

    //Exclui aluno
    public void excluirAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    public Aluno getAluno(int posicao){
        return alunos.get(posicao);
    }

    void agendarHorario(){

    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setData(int i) {
    }
}
