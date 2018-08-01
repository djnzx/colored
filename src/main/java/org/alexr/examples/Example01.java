package org.alexr.examples;

import org.alexr.colored.Ansi;
import org.alexr.colored.Attribute;
import org.alexr.colored.Colored;

public class Example01 {
    public static void main(String[] args) {
        Attribute red1 = new Attribute(Ansi.ColorFont.RED);
        Attribute red2 = new Attribute(Ansi.Style.BOLD, Ansi.ColorFont.RED, Ansi.ColorBack.NONE);
        Attribute green1 = new Attribute(Ansi.Style.UNDERLINE, Ansi.ColorFont.GREEN, Ansi.ColorBack.NONE);
        Attribute green2 = new Attribute(Ansi.Style.LIGHT, Ansi.ColorFont.GREEN, Ansi.ColorBack.NONE);
        Attribute green3 = new Attribute(Ansi.Style.REVERSE, Ansi.ColorFont.GREEN, Ansi.ColorBack.NONE);
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
