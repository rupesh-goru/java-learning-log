package com.blocks;

public class Blocks extends BlocksParent{

    Blocks(){
        System.out.println("Child constructor created");
    }

    static void main(String[] args) {
        System.out.println("Main");
        Blocks blocks = new Blocks();//this one line triggered 4 operations.
    }

    static {
        System.out.println("Child Static block");
    }

    {
        System.out.println("Child Instance block");
    }

}
