import colored.Attribute;
import colored.Colored;

public class Example03 {
    public static void main(String[] args) {
        // way 5
        Colored.println("Hello,", Attribute.RED);
        Colored.println("Hello,", Attribute.GREEN);
        Colored.println("Hello,", Attribute.BLUE);
        Colored.println("Hello,", Attribute.YELLOW);
        Colored.println("Hello,", Attribute.CYAN);
        Colored.println("Hello,", Attribute.MAGENTA);
        // way 6
        System.out.println(new Colored("Hello,", Attribute.RED));
        System.out.println(new Colored("Hello,", Attribute.GREEN));
        System.out.println(new Colored("Hello,", Attribute.BLUE));
        System.out.println(new Colored("Hello,", Attribute.YELLOW));
        System.out.println(new Colored("Hello,", Attribute.CYAN));
        System.out.println(new Colored("Hello,", Attribute.MAGENTA));
    }
}
