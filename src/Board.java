import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Board {
    private List<List<Peca>> tabuleiro;
    private String Player;

    public Board(){
        tabuleiro = this.buildTabuleiro();
    }

    private List<List<Peca>>  buildTabuleiro(){
        List<List<Peca>> tabuleiro = new ArrayList<>();

        for(int i = 0; i<8;i++){
            List<Peca> linha = new ArrayList<>();
            for(int j=0; j<8;j++){
                Posicao vazia = new Posicao(i,j);
                Peca nova = new Vazia(vazia);
                linha.add(nova); // Empty -> casa vazia;
            }
            tabuleiro.add(linha);
        }

        return tabuleiro;
    }

    public Peca obterPeca(int linha, int coluna){
        if(linha<0 || linha>7 || coluna>7 || coluna<0){
            return null; // -> fora do tabuleiro
        }
        return tabuleiro.get(linha).get(coluna);
    }

    public void moverPeca(int origL, int origC, int destL, int destC){
        Peca peca = tabuleiro.get(origL).get(origC);

        //metodo errado tenho de rever falta incluir as linhas tambem no movimento nao so as colunas ???
        tabuleiro.get(origL).set(origC,null);

        tabuleiro.get(destL).set(destC,peca);
    }

    public void gerarMovimentos(){
        //primeiro criar a classe Move e depois ver todos os movimentos possiveis atuais do jogador atual
        //deve retornar um List<Move>
    }

    public void trocarTurno(){
        //comparar as string e trocar turno
    }

    public void imprimir(){
        for(List<Peca> linha : this.tabuleiro){
            System.out.println(linha);
        }
    }

}
