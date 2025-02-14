package desafios.jogadoresfutebol;

public class Main {
    public static void main(String[] args) {
        JogadorBasico jogadorBasico = new JogadorBasico();
        jogadorBasico.setNome("Jeferson");
        jogadorBasico.setIdade(21);
        jogadorBasico.setHabilidade("Dribles incríveis");
        jogadorBasico.mostrarInformacoes();
        jogadorBasico.executarHabilidade();

        System.out.println();

        JogadorAvancado jogadorAvancado = new JogadorAvancado();
        jogadorAvancado.setNome("Neymar");
        jogadorAvancado.setIdade(31);
        jogadorAvancado.setHabilidade("Finta e velocidade");
        jogadorAvancado.setClube("Paris Saint-Germain");
        jogadorAvancado.setPosicao(Posicao.ATACANTE);
        jogadorAvancado.mostrarInformacoes();
        jogadorAvancado.executarHabilidade();

        System.out.println();
        System.out.println("Posição: " + jogadorAvancado.getPosicao());
    }
}
