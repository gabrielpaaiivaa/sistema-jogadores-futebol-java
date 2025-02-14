package desafios.jogadoresfutebol;

public class JogadorBasico implements Jogador {
    private String nome;
    private int idade;
    private String habilidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.printf("Sou um jogador. Meu nome é %s, tenho %d anos e minha habilidade principal é %s.%n", nome, idade, habilidade);
    }
    @Override
    public void executarHabilidade(){
        System.out.printf("Sei fazer %s. %n", habilidade);
    }
}
