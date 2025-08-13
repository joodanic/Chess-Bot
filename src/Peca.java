import java.util.List;

public abstract class Peca {
    private Posicao posicao;
    private Cor cor;

    public Peca(Posicao posicao, Cor cor){
        this.posicao = posicao;
        this.cor = cor;
    }
    public abstract List<Move> gerarMovimentos(Board tabuleiro);

    public Posicao getPosicao() {
        return this.posicao;
    }

    public Cor getCor(){
        return this.cor;
    }
}
