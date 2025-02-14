package desafios.jogadoresfutebol;

public class JogadorAvancado extends JogadorBasico{
    private String clube;
    private Posicao posicao;

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
    @Override
    public void mostrarInformacoes(){
        System.out.printf("Sou um jogador profissional, meu nome é %s, tenho %d anos, jogo no %s%ncomo %s e minha habilidade principal é %s.%n", getNome(), getIdade(), clube, posicao, getHabilidade());
    }
}
