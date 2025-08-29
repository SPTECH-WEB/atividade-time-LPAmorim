package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;

    public void registrarVitoria(){ vitorias += 1;}

    public void registrarEmpate(){ this.empates += 1; }

    void registrarDerrota(){
        this.derrotas += 1;
    }

    Integer getPontos(){
        return (vitorias * 3) + empates;
    }

    Integer getTotalPartidas(){
        return vitorias + derrotas + empates;
    }

    Integer getAproveitamento(){
        return ((vitorias * 100) / getTotalPartidas());
    }

    void compararAproveitamento(Time adversario){
        if (getAproveitamento() > adversario.getAproveitamento()){
            String msg = String.format("O time %s tem um aproveitamento maior que o %s.", nome, adversario.nome);
            System.out.println(msg);

        } else if (getAproveitamento() < adversario.getAproveitamento()) {
            String msg = String.format("O time %s tem um aproveitamento maior que o time %s.", adversario.nome, nome);
            System.out.println(msg);

        }else {
            String msg = String.format("Os times %s e %s têm o mesmo aproveitamento.", nome, adversario.nome);
            System.out.println(msg);
        }
    }

    void exibirInformacoes(){
        String msg = String.format("""
                Time: %s
                Vitórias: %d
                Empates: %d
                Derrotas: %d
                
                
                Pontos: %d
                Total de Partidas: %d
                Aproveitamento: %d%%
                
                ---
                """,
                nome,
                vitorias,
                empates,
                derrotas,
                getPontos(), getTotalPartidas(), getAproveitamento());
        System.out.println(msg);
    }
}
