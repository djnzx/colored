package colored;

public class Attribute {
    private final Ansi.TxAttr txAttr;
    private final Ansi.FgColor fgColor;
    private final Ansi.BgColor bgColor;

    public static Attribute Clear() {
        return new Attribute(Ansi.TxAttr.NONE, Ansi.FgColor.NONE, Ansi.BgColor.NONE);
    }

    public Attribute(Ansi.TxAttr txa, Ansi.FgColor fg, Ansi.BgColor bg) {
        this.txAttr = txa;
        this.fgColor = fg;
        this.bgColor = bg;
    }

    public Ansi.TxAttr txAttr() {
        return txAttr;
    }

    public Ansi.BgColor bgColor() {
        return bgColor;
    }

    public Ansi.FgColor fgColor() {
        return fgColor;
    }

    public String escapeSequence() {
        return String.join("",
                Ansi.PREFIX,
                txAttr.code(), Ansi.SEPARATOR,
                fgColor.code(), Ansi.SEPARATOR,
                bgColor.code(),
                Ansi.POSTFIX);
    }

    @Override
    public String toString() {
        return String.format("Attribute:{txAttr=%s, fgColor=%s, bgColor=%s}", txAttr, fgColor, bgColor);
    }
}
