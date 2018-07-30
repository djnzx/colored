import colored.Ansi;
import colored.Attribute;
import colored.Colored;

public class Example02 {
    public static void main(String[] args) {
        System.out.println();
        // way #3
        Colored.println("Hello,", Attribute.RED);
        Colored.print("Hello,", Attribute.RED.withTa(Ansi.TxAttr.BOLD));
        System.out.println("Word!");
        // way #4
        Attribute green = Attribute.GREEN;
        System.out.print(Colored.build("Again:)", green));
        System.out.print(Colored.build("Again:)", green.withTa(Ansi.TxAttr.UNDERLINE)));
        System.out.print(Colored.build(" Again:) ", green.withTa(Ansi.TxAttr.REVERSE)));
        System.out.println();
    }
}
