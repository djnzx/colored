package colored;

public class Attribute {
    private final Ansi.TxAttr txAttr;
    private final Ansi.FgColor fgColor;
    private final Ansi.BgColor bgColor;

    public static final Attribute CLEAR = new Attribute();
    public static final Attribute RED = new Attribute(Ansi.FgColor.RED);
    public static final Attribute GREEN = new Attribute(Ansi.FgColor.GREEN);
    public static final Attribute BLUE = new Attribute(Ansi.FgColor.BLUE);
    public static final Attribute YELLOW = new Attribute(Ansi.FgColor.YELLOW);
    public static final Attribute CYAN = new Attribute(Ansi.FgColor.CYAN);
    public static final Attribute MAGENTA = new Attribute(Ansi.FgColor.MAGENTA);

    public Attribute() {
        this(Ansi.TxAttr.NONE, Ansi.FgColor.NONE, Ansi.BgColor.NONE);
    }

    public Attribute(Ansi.FgColor fg) {
        this(Ansi.TxAttr.NONE, fg, Ansi.BgColor.NONE);
    }

    public Attribute(Ansi.BgColor bg) {
        this(Ansi.TxAttr.NONE, Ansi.FgColor.NONE, bg);
    }

    public Attribute(Ansi.TxAttr tx) {
        this(tx, Ansi.FgColor.NONE, Ansi.BgColor.NONE);
    }

    public Attribute(Ansi.TxAttr txa, Ansi.FgColor fg, Ansi.BgColor bg) {
        this.txAttr = txa;
        this.fgColor = fg;
        this.bgColor = bg;
    }

    public Attribute withFg(Ansi.FgColor color) {
        return new Attribute(this.txAttr, color, this.bgColor);
    }

    public Attribute withBg(Ansi.BgColor color) {
        return new Attribute(this.txAttr, this.fgColor, color);
    }

    public Attribute withTa(Ansi.TxAttr attr) {
        return new Attribute(attr, this.fgColor, this.bgColor);
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
