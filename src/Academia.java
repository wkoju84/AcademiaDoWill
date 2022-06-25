import entities.Rotina;

public class Academia {
    public static void main(String[] args) {



        Rotina rotina1 = new Rotina();
        rotina1.setNomeRotina("Musculação");
        rotina1.setCargaHoraria(15);

        System.out.println("Rotina definida é " + rotina1.getNomeRotina() + ". Sem esforço não há resultados!");
        System.out.println("Carga Horária da rotina é " + rotina1.getCargaHoraria() + " horas. Sem frescura!");
    }
}
