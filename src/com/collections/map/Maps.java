package com.collections.map;

import java.util.*;

public class Maps {
    static void main(String[] args) {
         Map<Integer, String> map = new HashMap<>();
         map.put(1, "one");
         map.put(2, "two");
         map.put(3, null);//here we can pass null in value place because the default value of string is null.
         map.put(null, null);//here we can pass null in key place also because the default value of INTEGER class is null. Here primitive datatypes like int are not allowed hence we use wrapper classes like: Integer.
        map.put(4, "Kajal Agarwal");
        map.put(5, "Mahesh Babu");
        map.put(6, "Pawan Kalyan");
        map.put(7, "Allu Arjun");

        /*To get all the keys that are present in a map.*/
        System.out.println("map.keySet() returns all the keys present in the Map as a Set: " + map.keySet());
        /*To get all the values that are present in a map.*/
        System.out.println("map.values() returns all the values in the Map as a Collection: " + map.values());
        /*To get all the keys & values that are present in a map.*/
        /*this is only specifically only for map*/
        System.out.println("entrySet() returns a Set containing all key-value mappings (entries) of the Map: " + map.entrySet());

        /*keySet(); - Iterate over a loop.*/
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " = " + map.get(key));
        }

        /*Printing of map.values(); like this.*/
        Collection<String> values = map.values();
        System.out.println("map.values(); gives rise to: " + values);


        /*Iterating map.entrySet();*/
        /*with this we can get both key & value in a single go.*/
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        /*Iterating the entrySet();*/
        System.out.println("***Iterating the entrySet();***");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }


        System.out.println(map);//output cannot be predicted as it does not follow insertion order.
        /*To get a specific value we should use map.get(key);*/
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(null));

        /****INTERVIEW QUESTION****/
        /*If the key is not presented there and passed to print that then it will give null as output and will not give any exception.*/
        //for example:
        System.out.println(map.get(69)); //will return null as output as 69 key is not presented here.

        //practise();
    }
    private static void practise() {
        /*Creation of a map.*/
        Map map = new HashMap();
        /*Pass/putting the values we use map.put(); method and pass values.*/
        /*this accepts heterogeneous data and insertion order is not maintained.*/
        map.put(1, "Lakshmi");
        map.put(2, "Kwaja");
        map.put(3, "Prudhvi");
        map.put("Sahithi", "Rupesh");
        map.put(true, "Trisha");
        map.put(false, "Saniya Iyyappan");
        map.put('r', "Surya");
        map.put('G', "Pavan");
        map.put('a', 69);
        /*Values can also be duplicated.*/
        map.put('b', "Trisha");
        /*Key duplication will lead to overriding of the older value with the latest one & will not give any exception.*/
        map.put(1, "Goru"); //here 1 will be Goru and not Lakshmi.
        /*null*/
        map.put(null, "Harshitha");
        map.put(null, null);//value gets overridden here.
        map.put(6, null);
        map.put(7, null);

        /*To print values or to get the output.*/
        System.out.println(map);
    }
}
