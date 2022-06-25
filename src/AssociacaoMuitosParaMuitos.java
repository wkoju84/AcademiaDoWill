import entities.Instrutor;
import entities.Rotina;

public class AssociacaoMuitosParaMuitos {
    public static void main(String[] args) {

        //Definição de rotina e duração
        Rotina rotina1 = new Rotina();
        rotina1.setNomeRotina("Musculação");
        rotina1.setCargaHoraria(20);

        Rotina rotina2 = new Rotina();
        rotina2.setNomeRotina("Aeróbico");
        rotina2.setCargaHoraria(30);

        //Rendimento do instrutor

        Instrutor instrutor1 = new Instrutor();
        instrutor1.setNome("Milton");
        instrutor1.setMatricula(0001);
        instrutor1.setFormacaoAcad("Licenciado");
        instrutor1.setSalario(100);

        Instrutor instrutor2 = new Instrutor();
        instrutor2.setNome("Isabel");
        instrutor2.setMatricula(0002);
        instrutor2.setFormacaoAcad("Licenciada");
        instrutor2.setSalario(100);

        //Definições das rotinas de cada instrutor

        instrutor1.adicionarRotina(rotina1);
        rotina1.adicionarInstrutor(instrutor1);

        instrutor1.adicionarRotina(rotina2);
        rotina2.adicionarInstrutor(instrutor1);

        instrutor2.adicionarRotina(rotina2);
        rotina2.adicionarInstrutor(instrutor2);

        System.out.println("Rotinas do Instrutor Milton:");
        for (int i = 0; i < instrutor1.quantidadeRotinas();i++){
            System.out.println(instrutor1.getRotina(i) .getNomeRotina());
        }

        System.out.println("Instrutores de Musculação:");
        for (int i = 0; i < rotina1.quantidadeInstrutors(); i++){
            System.out.println(rotina1.getInstrutor(i) .getNome());
        }
    }
}
