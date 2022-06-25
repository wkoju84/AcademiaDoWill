import entities.Agendamento;
import entities.Aluno;

import java.util.Date;

public class AssociacaoParaUm {
    public static void main(String[] args) {

        //agendamentos dos alunos - tipo de exercícios que serão realizados

        Agendamento agendamento1 = new Agendamento();
        agendamento1.setSigla("Pernas");
        agendamento1.setData(1);

        //Dados do aluno - nome e matrícula

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Jamal");
        aluno1.setMatricula(001);
        aluno1.setDataNasc(new Date());
        aluno1.setAgendamento(agendamento1);
        agendamento1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pâmela");
        aluno2.setMatricula(002);
        aluno2.setDataNasc(new Date());
        aluno2.setAgendamento(agendamento1);
        agendamento1.adicionarAluno(aluno2);

        System.out.println("Dados do aluno 1: ");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getAgendamento() .getSigla());

        //agendamentos

        System.out.println("Alunos agendados: ");
        for (int i = 0; i < agendamento1.quantidadeAlunos(); i++){
            System.out.println(agendamento1.getAluno(i) .getNome());
        }
    }
}
