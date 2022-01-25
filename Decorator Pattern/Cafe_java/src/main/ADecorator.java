package main;

public abstract class ADecorator extends AComponent {
    private AComponent pObj;

    public ADecorator(final AComponent pObj) {
        this.setPObj(pObj);
    }

    @Override
    public final double getPrice() {
        return this.getPObj() != null ? super.getPrice() + this.getPObj().getPrice() : super.getPrice();
        /* line above is equivalent to:
        if (this.getPObj() != null)
            return super.getPrice() + this.getPObj().getPrice();
        // else can be omitted because return (line above) will terminate the method call
        return super.getPrice();
        */
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
