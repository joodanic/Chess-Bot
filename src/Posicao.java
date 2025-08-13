public class Posicao {
    private int linha;
    private int coluna;

    public Posicao(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha(){
        return this.linha;
    }

    public int getColuna(){
        return this.coluna;
    }

    public void setLinha(int linha){
        this.linha = linha;
    }

    public void setColuna(int coluna){
        this.coluna = coluna;
    }


}
