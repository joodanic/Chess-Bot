import java.util.ArrayList;
import java.util.List;

public class Peao extends Peca{

    public Peao(Posicao posicao, Cor cor) {
        super(posicao, cor);
    }

    @Override
    public List<Move> gerarMovimentos(Board tabuleiro) {
        List<Move> movimentos = new ArrayList<>();

        Posicao atual = getPosicao();
        Cor cor = getCor();
        int linhaOrig = atual.getLinha();
        int colunaOrig = atual.getColuna();

        int direcao = (cor == Cor.BRANCA) ? -1:1;

        if((cor == Cor.BRANCA && atual.getLinha()==6) || cor==Cor.PRETA && atual.getLinha()==1){
            int linhaDest = linhaOrig+direcao;
            int linhaDest2 = linhaOrig + (2*direcao);
            Posicao dest = new Posicao(linhaDest,atual.getColuna());
            Posicao dest2 = new Posicao(linhaDest2,atual.getColuna());
            Peca queroIr = tabuleiro.obterPeca(linhaDest,atual.getColuna());
            Peca queroIr2 = tabuleiro.obterPeca(linhaDest2,atual.getColuna());

            if(queroIr instanceof Vazia){
                Move moveCasa = new Move(atual,dest, this,tabuleiro.obterPeca(linhaDest,atual.getColuna()));
                movimentos.add(moveCasa);
            }

            if(queroIr instanceof Vazia && queroIr2 instanceof Vazia){
                Move move2Casa = new Move(atual,dest2,this,tabuleiro.obterPeca(linhaDest2,atual.getColuna()));
                movimentos.add(move2Casa);
            }
        }
        else {
            //um movimento em frente, pois ja nao estamos na posicao original
            Peca frente = tabuleiro.obterPeca(linhaOrig+direcao,colunaOrig);

            if (frente instanceof Vazia){
                Posicao dest = new Posicao(linhaOrig+direcao,colunaOrig);
                Move moveCasa = new Move(atual,dest,this,frente);
                movimentos.add(moveCasa);
            }
        }

        Peca direita = tabuleiro.obterPeca(linhaOrig+direcao,colunaOrig+1);
        Peca esquerda = tabuleiro.obterPeca(linhaOrig+direcao,colunaOrig-1);

        if(!(direita instanceof Vazia) && direita.getCor()!=this.getCor()){
            Posicao dest = new Posicao(linhaOrig+direcao,colunaOrig+1);
            Move moveCasa = new Move(atual,dest,this,direita);
            movimentos.add(moveCasa);
        }

        if(!(esquerda instanceof Vazia) && esquerda.getCor()!=this.getCor()){
            Posicao dest = new Posicao(linhaOrig+direcao,colunaOrig-1);
            Move moveCasa = new Move(atual,dest,this,esquerda);
            movimentos.add(moveCasa);
        }

        return movimentos;
    }
}
