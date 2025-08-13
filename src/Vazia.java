import java.util.List;

public class Vazia extends Peca{
    public Vazia(Posicao posicao) {
        super(posicao, null);
    }

    @Override
    public List<Move> gerarMovimentos(Board tabuleiro) {
        return null;
    }
}
