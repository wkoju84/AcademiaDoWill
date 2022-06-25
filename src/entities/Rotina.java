package entities;

import java.util.ArrayList;

public class Rotina {

    //Rotinas a serem executadas
   private String nomeRotina;
    private int cargaHoraria;

    //Listas com alunos, instrutores e agendamentos

    private ArrayList<Aluno>alunos;
    private ArrayList<Instrutor>instrutors;
    private ArrayList<Agendamento>agendamentos;

    public Rotina(){
        instrutors = new ArrayList<Instrutor>();
    }
    public void adicionarInstrutor(Instrutor instrutor){
        instrutors.add(instrutor);
    }
    public void excluirInstrutor(Instrutor instrutor){
        instrutors.remove(instrutor);
    }
    public int quantidadeInstrutors(){
        return instrutors.size();
    }
    public Instrutor getInstrutor(int posicao){
        return instrutors.get(posicao);
    }

    public String getNomeRotina() {
        return nomeRotina;
    }

    public void setNomeRotina(String nomeRotina) {
        this.nomeRotina = nomeRotina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria>=0){
            this.cargaHoraria = cargaHoraria;
        }

    }

    void adicionarRotina(){

    }

}
