Do you want to see colored output in your console ?

Just follow this instruction:

1. download this project
2. run `mvn clean install` or `mvn clean source:jar install`
3. include in your `pom.xml` following block:
```
        <dependency>
            <groupId>org.alexr</groupId>
            <artifactId>coloured-console</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```
in your `<dependencies>` section.

4. use it as described in `examples folder`.

```System.out.println(new Colored("Hello,", Attribute.RED));```

5. Enjoy!