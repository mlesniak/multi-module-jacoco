package com.mlesniak.jacoco;

public class Module1Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        int value = Integer.parseInt(args[0]);
        if (value == 0) {
            System.out.println("0");
        } else {
            System.out.println("!0");
        }
    }

    // Tested in a module unit test.
    public int module1FunctionTestedInModule1() {
        return 1;
    }

    // ONLY Tested in a module unit test written in ANOTHER module.
    public int module1FunctionNotTestedInModule1() {
        return 3;
    }
}
