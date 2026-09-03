package com.java8.optionalclass;

import java.util.Optional;

public class OptionalOperation {
    public static void main(String[] args) {


        String city = "Visakhapatnam";

        System.out.println(city.length());

        Optional<String> name = Optional.of("Rupesh");
        System.out.println(name.get()); //.get() method will retrieve the output.
        System.out.println(name.get().length());


        Optional<String> name2 = Optional.ofNullable("tom");
        System.out.println(name2.orElse("Invalid Value"));

        System.out.println(name2.orElseThrow(
                () -> new RuntimeException("Name not found")
        ));

        Optional<String> name3 = Optional.ofNullable("king"); //place null if u want and it will not return any exception.
        //if Optional.of() is passed then you'll get an exception.
        if(name3.isPresent()) {
            System.out.println(name3.get());
        }
        else  {
            System.out.println("Invalid Value");
        }

        /*Optional.empty();*/
        Optional<String> name4 = Optional.empty();
        System.out.println(name.isPresent());


    }
}
