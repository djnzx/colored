package org.alexr.examples;

import org.alexr.colored.Attribute;
import org.alexr.colored.Colored;

public class Example04 {
    public static void main(String[] args) {
        // way 7
        Colored.println("Hello,", Attribute.RED);
        Colored.println("Hello,", Attribute.GREEN);
        Colored.println("Hello,", Attribute.BLUE);
        Colored.println("Hello,", Attribute.YELLOW);
        Colored.println("Hello,", Attribute.CYAN);
        Colored.println("Hello,", Attribute.MAGENTA);
        Colored.println("Hello,", Attribute.RED.bold());
        Colored.println("Hello,", Attribute.GREEN.bold());
        Colored.println("Hello,", Attribute.BLUE.reverse());
        Colored.println("Hello,", Attribute.YELLOW.reverse());
        Colored.println("Hello,", Attribute.CYAN.underline());
        Colored.println("Hello,", Attribute.MAGENTA.underline());
    }
}
