import java.util.List;

public class Cavalo extends Peca{
    public Cavalo(Posicao posicao, Cor cor) {
        super(posicao, cor);
    }

    @Override
    public List<Move> gerarMovimentos(Board tabuleiro) {
        return null;
    }
}
