package main;

public abstract class ADecorator extends AComponent {
    private AComponent pObj;

    public ADecorator(final AComponent pObj) {
        this.setPObj(pObj);
    }

    @Override
    public final double getPrice() {
        if (this.getPObj() != null)
            return super.getPrice() + this.getPObj().getPrice();
        return super.getPrice();
    }

    @Override
    public final String toString() {
        return pObj.toString() + " & " + super.toString();
    }

    private AComponent getPObj() {
        return pObj;
    }

    private void setPObj(final AComponent pObj) {
        this.pObj = pObj;
    }
}
