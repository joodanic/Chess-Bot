import java.util.ArrayList;
import java.util.List;

public class Cavalo extends Peca{
    public Cavalo(Posicao posicao, Cor cor) {
        super(posicao, cor);
    }

    @Override
    public List<Move> gerarMovimentos(Board tabuleiro) {
        List<Move> movimentos = new ArrayList<>();
        int[][] posicoesCavalo = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        Posicao atual = getPosicao();

        for(int[] posicaoCavalo : posicoesCavalo){
            int linha = atual.getLinha() + posicaoCavalo[0];
            int coluna = atual.getColuna() + posicaoCavalo[1];

            Peca queroIr = tabuleiro.obterPeca(linha,coluna);

            if(queroIr!=null && queroIr.getCor()!=this.getCor()){
                Posicao dest = new Posicao(linha,coluna);
                Peca capturada = (queroIr instanceof Vazia) ? null : queroIr;
                Move nova = new Move(atual,dest,this,capturada);
                movimentos.add(nova);
            }
        }
        return movimentos;
    }
}
