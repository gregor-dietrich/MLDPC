package main.Lego;

import java.util.ArrayList;

public final class LegoComposition implements ILego {
    private final ArrayList<ILego> pieces;

    public LegoComposition() {
        this.pieces = new ArrayList<>();
    }

    public LegoComposition(final ArrayList<ILego> pieces) {
        this.pieces = pieces;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (var piece : pieces)
            price += piece.getPrice();
        return price;
    }

    public boolean addPiece(final ILego piece) {
        return this.getPieces().add(piece);
    }

    public boolean removePiece(final ILego piece) {
        return this.getPieces().remove(piece);
    }

    public ArrayList<ILego> getPieces() {
        return pieces;
    }
}
