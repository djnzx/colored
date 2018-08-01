package org.alexr.examples;

import org.alexr.colored.Ansi;
import org.alexr.colored.Attribute;
import org.alexr.colored.Colored;

public class Example02 {
    public static void main(String[] args) {
        System.out.println();
        // way #3
        Colored.println("Hello,", Attribute.RED);
        Colored.print("Hello,", Attribute.RED.withStyle(Ansi.Style.BOLD));
        System.out.println("Word!");
        // way #4
        Attribute green = Attribute.GREEN;
        System.out.print(Colored.build("Again:)", green));
        System.out.print(Colored.build("Again:)", green.withStyle(Ansi.Style.UNDERLINE)));
        System.out.print(Colored.build(" Again:) ", green.withStyle(Ansi.Style.REVERSE)));
        System.out.println();
    }
}
