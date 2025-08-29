package school.sptech;

public class Main {

    public static void main(String[] args) {
        Time t1 = new Time();
        t1.nome = "Corinthians";
        t1.registrarVitoria();
        t1.registrarVitoria();
        t1.registrarEmpate();
        t1.registrarDerrota();

        Time t2 = new Time();
        t2.nome = "Palmeiras";
        t2.registrarVitoria();
        t2.registrarVitoria();
        t2.registrarVitoria();

        System.out.println("=== Informações do Time 1 ===");
        t1.exibirInformacoes();

        System.out.println("=== Informações do Time 2 ===");
        t2.exibirInformacoes();

        System.out.println("=== Comparação de Aproveitamento ===");
        t1.compararAproveitamento(t2);
    }
}