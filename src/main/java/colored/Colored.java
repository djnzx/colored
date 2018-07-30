package colored;

import java.io.PrintStream;

public class Colored {
    private final Object msg;
    private final Attribute attr;

    public Colored(Object msg, Attribute attr) {
        this.msg = msg;
        this.attr = attr;
    }

    @Override
    public String toString() {
        return Colored.build(this.msg, this.attr);
    }

    public static String build(Object msg, Ansi.FgColor fg) {
        return build(msg, Ansi.TxAttr.NONE, fg, Ansi.BgColor.NONE);
    }

    public static String build(Object msg, Ansi.TxAttr attr, Ansi.FgColor fg) {
        return build(msg, attr, fg, Ansi.BgColor.NONE);
    }

    public static String build(Object msg, Attribute att) {
        return build(msg, att.txAttr(), att.fgColor(), att.bgColor());
    }

    public static String build(Object msg, Ansi.TxAttr attr, Ansi.FgColor fg, Ansi.BgColor bg) {
        return String.join("",
                new Attribute(attr, fg, bg).escapeSequence(),
                msg.toString(),
                Attribute.CLEAR.escapeSequence()
        );
    }

    public static void print(Object msg, Attribute att) {
        print(msg, att, System.out);
    }

    public static void print(Object msg, Attribute att, PrintStream p) {
        p.print(build(msg, att));
    }

    public static void println(Object msg, Attribute att) {
        println(msg, att, System.out);
    }

    public static void println(Object msg, Attribute att, PrintStream p) {
        p.println(build(msg, att));
    }
}
