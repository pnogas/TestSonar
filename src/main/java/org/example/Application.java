package org.example;

public class Application {

    public static void main(String[] args) {
        foo();
        Bar aBar = new Bar();
        aBar.baz();
        System.out.println("Done");
    }

    static boolean foo() {
        return System.currentTimeMillis() % 2 == 0;
    }
}
