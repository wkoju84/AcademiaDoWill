package entities;

import java.util.ArrayList;

public class Instrutor extends Usuario{

    //Informações dos instrutores -
    private String formacaoAcad;
    private double salario;


    //Rotina de serviço e alunos de cada instrutor
    private ArrayList<Rotina>rotinas;
    private ArrayList<Agendamento>agendamentos;
    private ArrayList<Aluno>alunos;


    public void definirExercicio(){

    }

    public Instrutor(){
        rotinas = new ArrayList<Rotina>();
    }

    public String getFormacaoAcad() {
        return formacaoAcad;
    }

    public void setFormacaoAcad(String formacaoAcad) {
        this.formacaoAcad = formacaoAcad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void adicionarRotina(Rotina rotina){
        rotinas.add(rotina);
    }
    public void excluirRotina(Rotina rotina){
        rotinas.remove(rotina);
    }
    public int quantidadeRotinas(){
        return rotinas.size();
    }
    public Rotina getRotina(int posicao){
        return rotinas.get(posicao);
    }
}
