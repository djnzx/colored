import colored.Ansi;
import colored.Attribute;
import colored.Colored;

public class Example01 {
    public static void main(String[] args) {
        Attribute red1 = new Attribute(Ansi.FgColor.RED);
        Attribute red2 = new Attribute(Ansi.TxAttr.BOLD, Ansi.FgColor.RED, Ansi.BgColor.NONE);
        Attribute green1 = new Attribute(Ansi.TxAttr.UNDERLINE, Ansi.FgColor.GREEN, Ansi.BgColor.NONE);
        Attribute green2 = new Attribute(Ansi.TxAttr.LIGHT, Ansi.FgColor.GREEN, Ansi.BgColor.NONE);
        Attribute green3 = new Attribute(Ansi.TxAttr.REVERSE, Ansi.FgColor.GREEN, Ansi.BgColor.NONE);
        System.out.println();
        // way #1
        Colored.println("Hello,", red1);
        Colored.print("Hello,", red2);
        System.out.println("Word!");
        // way #2
        System.out.print(Colored.build("Again:)", green1));
        System.out.print(Colored.build("Again:)", green2));
        System.out.print(Colored.build(" Again:) ", green3));
        System.out.println();
    }
}
