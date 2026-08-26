package com.blocks;

public class BlocksParent {

    BlocksParent(){
        System.out.println("Parent constructor created");
    }

    static {
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent instance block");
    }

}
