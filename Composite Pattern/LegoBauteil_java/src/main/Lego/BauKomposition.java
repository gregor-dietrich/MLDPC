package main.Lego;

import java.util.ArrayList;

public final class BauKomposition extends ABauteil {
    private final ArrayList<ABauteil> pieces;

    public BauKomposition() {
        this.pieces = new ArrayList<>();
    }

    public BauKomposition(ArrayList<ABauteil> pieces) {
        this.pieces = pieces;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (var piece : pieces)
            price += piece.getPrice();
        return price;
    }

    public boolean addPiece(ABauteil piece) {
        return this.getPieces().add(piece);
    }

    private boolean removePiece(ABauteil piece) {
        return this.getPieces().remove(piece);
    }

    public ArrayList<ABauteil> getPieces() {
        return pieces;
    }
}
