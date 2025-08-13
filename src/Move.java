public class Move {
    private Posicao origem;
    private Posicao destino;
    private Peca peca_movida;
    private Peca peca_capturada;

    public Move(Posicao origem, Posicao destino, Peca peca_movida, Object o){
        this.origem = origem;
        this.destino = destino;
        this.peca_movida = peca_movida;
        this.peca_capturada = null;
    }

}
