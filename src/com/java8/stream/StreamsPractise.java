package com.java8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractise {

    static void main(String[] args) {

        //groupingByFunctions();
        //joiningOperationsOnStrings();
        //reduceOpearation();
        //parallelStream();
        //partitioning();
        //flatMaps();
        //matches();
        //aggregateFunctions();
        //hashMapOperations();
        //mapOperations();
    }

    private static void groupingByFunctions() {
        /*Interview Q. Counting of characters. using groupingBy.*/
        String language = "JAVA";

        Map<Character, Long> collect = language
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

        /*Interview Q. Above Q in ascending order- to achieve this simply use treeMap that's it.*/
        String bowler = "JASPRITBUMRAH";
        Map<Character, Long> ascendingOrder = bowler
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,()-> new TreeMap<>(), Collectors.counting()));
        System.out.println(ascendingOrder);

        /*Interview Q. Above Q in DESCENDING order- to achieve this simply use treeMap that's it.*/
        String batsMan = "VIRATKOHLI";

        Map<Character, Long> descendingOrder = batsMan
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        () -> new TreeMap<Character, Long>(Comparator.reverseOrder()),
                        Collectors.counting()
                ));

        System.out.println(descendingOrder);

        /*Interview Q. Finding frequency of the word in a string. */
        String names = "Rupesh Sahithi Goru Surya Sahithi Goru Kumar Sahithi Goru Pavan Rupesh Sahithi";

        Map<String, Long> collect1 = Arrays.stream(names.split(" "))
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println(collect1);
    }

    private static void joiningOperationsOnStrings() {
        String name = "FRONTLINESEDUTECH";

        List<Character> list = name
                .chars()
                .mapToObj(c -> (char) c)
                .toList();
        System.out.println(list);

        //Remove duplicates from this string

        List<Character> list1 = name
                .chars()
                .distinct()
                .mapToObj(c -> (char) c)
                .toList();
        System.out.println(list1);

        /*Interview Q. Remove duplicates from the string and return a string. */

        String collect = name
                .chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(name);
        System.out.println(collect);

        /*Interview Q. A comma (,) should be added each & every character of a string.*/

        String collect1 = name
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining(",")); //can put "-", "*" & anything.
        System.out.println(collect1);

        /*Interview Q. these characters to be hypen(-) separated.
        * from: FRONT LINES MEDIA
        * to - F-R-O-N-T-L-I-N-E-S-E-D-U-T-E-C-H*/

        String name2 = "FRONT LINES EDUTECH";

        String collect2 = name2
                .chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining("-"));
        System.out.println(collect2);

        /*Interview Q. Visually this should look like a list of chars but you should not use a list/array.*/
        /*FRONT
        * [F,R,O,N,T]*/

        String city = "VISAKHAPATNAM";

        String urbanArea = city
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                //joining takes 3 parameters: With delimiter, prefix(1st place) and suffix(last place).
                .collect(Collectors.joining("," , "[", "]"));
        System.out.println(urbanArea);

        /*Operation bw word to word.*/
        /*Interview Q. Change the string = "FRONT LINES EDUTECH"
        * to : FRONT-LINES-EDUTECH
        * without using replace() method.*/

        String company = "FRONT LINES EDUTECH";
        // String company = "FRONT-LINES-EDUTECH";

        String[] split = company.split(" ");
        //String[] split = company.split("-");
        /*We can also stream on Arrays using Arrays.stream*/
        String collect3 = Arrays.stream(split)
                .collect(Collectors.joining("-"));
        //.collect(Collectors.joining(","));
        System.out.println(collect3);


        /*VERY VERY imporatant Interview Q.
        * A string will be given and will be asked to remove if any duplicate words are there.
        * For example: before removing: - "India is a beautiful country and India is a diverse nation"
        * After removing(add - bw words): - "India is a beautiful country and a diverse nation"*/

        String sentence = "India is a beautiful country and India is a diverse nation";
        String[] split1 = sentence.split(" ");
        String collect4 = Arrays.stream(split1)
                .distinct()
                .collect(Collectors.joining("-"));
        System.out.println(collect4);

        /*Same Q as above but: return a string back with 1st letter of each word. */

        //Expected Output: IiabcaIiadn

        String[] split2 = sentence.split(" ");
        String collect5 = Arrays.stream(split2)
                .distinct() // duplicate words
                .map(str -> String.valueOf(str.charAt(0)))
                //.distinct() // duplicate first characters
                .collect(Collectors.joining());
        System.out.println(collect5);
    }

    private static void reduceOpearation() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 60, 70, 80, 90, 100);

        int sum = 0;
        for(Integer num : numbers){
            sum += num;
        }
        System.out.println(sum);

        /*Sum of all numbers using reduce()*/
        Integer total = numbers
                .stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(total);

        /*Product of all numbers using reduce()*/
        List<Integer> numbers2 = Arrays.asList(3, 4, 5, 6);
        Integer product = numbers2
                .stream()
                .reduce(1, (x, y) -> x * y); //here identity/initial value has to be 1, if 0 is initial value anything *0 is = '0' so the initial value has to be 1 for producting case.
        System.out.println(product);

        /*Adding of string using reduce().*/
        List<String> airport = Arrays.asList("Visakhapatnam" , "International" , "Airport");

        String summingOfStrings = airport
                .stream()
                //inital value should be an empty staring like: ""
                .reduce("", (p, q) -> p + " " + q)
                .trim(); //without trim(); there will be a space in the front if you want comment the trim(); and see the output. trim() removes leading and trailing spaces of a string.
        System.out.println(summingOfStrings);
    }

    private static void parallelStream() {
        List<String> woodTypes = Arrays.asList(
                "Teak",
                "Rosewood",
                "Sandalwood",
                "Oak",
                "Pine",
                "Mahogany",
                "Maple",
                "Walnut",
                "Cedar",
                "Bamboo",
                "Ash",
                "Birch",
                "Cherry",
                "Ebony",
                "Fir",
                "Spruce",
                "Beech",
                "Elm",
                "Poplar",
                "Willow",
                "Aspen",
                "Alder",
                "Acacia",
                "Wenge",
                "Padauk",
                "Meranti",
                "Sal",
                "Shisham",
                "Deodar",
                "Sheesham",
                "Mango",
                "Neem",
                "Jackfruit",
                "Guava",
                "Apple",
                "Pear",
                "Plum",
                "Peach",
                "Apricot",
                "Olive",
                "Cypress",
                "Hemlock",
                "Larch",
                "Redwood",
                "Sequoia",
                "Douglas Fir",
                "Yew",
                "Juniper",
                "Red Cedar",
                "White Cedar",
                "Blackwood",
                "Yellowwood",
                "Ironwood",
                "Bloodwood",
                "Zebrawood",
                "Snakewood",
                "Bubinga",
                "Gaboon Ebony",
                "Macassar Ebony",
                "African Mahogany",
                "American Mahogany",
                "Honduran Mahogany",
                "Brazilian Walnut",
                "Black Walnut",
                "English Walnut",
                "White Oak",
                "Red Oak",
                "Black Oak",
                "Live Oak",
                "English Oak",
                "Water Oak",
                "Black Maple",
                "Sugar Maple",
                "Silver Maple",
                "Red Maple",
                "Norway Maple",
                "Japanese Maple",
                "Black Ash",
                "White Ash",
                "Green Ash",
                "Blue Ash",
                "Black Birch",
                "White Birch",
                "Yellow Birch",
                "Paper Birch",
                "River Birch",
                "American Beech",
                "European Beech",
                "American Elm",
                "English Elm",
                "Slippery Elm",
                "Red Elm",
                "American Cherry",
                "Black Cherry",
                "Birdseye Maple",
                "Curly Maple",
                "Spalted Maple",
                "Bald Cypress",
                "Monterey Cypress",
                "Italian Cypress",
                "Leyland Cypress",
                "Western Red Cedar",
                "Northern White Cedar",
                "Eastern Red Cedar",
                "Spanish Cedar",
                "Port Orford Cedar",
                "Alaskan Yellow Cedar",
                "Sitka Spruce",
                "Norway Spruce",
                "White Spruce",
                "Black Spruce",
                "Red Spruce",
                "Blue Spruce",
                "Douglas Fir",
                "Balsam Fir",
                "White Fir",
                "Noble Fir",
                "Silver Fir",
                "Grand Fir",
                "Red Fir",
                "Coast Redwood",
                "Giant Sequoia",
                "Dawn Redwood",
                "Scots Pine",
                "White Pine",
                "Yellow Pine",
                "Red Pine",
                "Lodgepole Pine",
                "Sugar Pine",
                "Ponderosa Pine",
                "Longleaf Pine",
                "Shortleaf Pine",
                "Slash Pine",
                "Eastern Hemlock",
                "Western Hemlock",
                "European Larch",
                "Western Larch",
                "Japanese Larch",
                "Black Locust",
                "Honey Locust",
                "Silver Wattle",
                "Black Wattle",
                "White Wattle",
                "Monkeypod",
                "Koa",
                "Mimosa",
                "Brazilian Cherry",
                "Bolivian Rosewood",
                "Indian Rosewood",
                "Honduran Rosewood",
                "African Blackwood",
                "African Padauk",
                "Amaranth",
                "Bocote",
                "Canarywood",
                "Cocobolo",
                "Cumaru",
                "Ipe",
                "Jatoba",
                "Lignum Vitae",
                "Purpleheart",
                "Sapele",
                "Teakwood",
                "Tamarind",
                "Kapur",
                "Keruing",
                "Gaboon",
                "Obeche",
                "Okoume",
                "Ramin",
                "Rubberwood",
                "Paulownia",
                "Basswood",
                "Cottonwood",
                "Sycamore",
                "Plane Tree",
                "Hornbeam",
                "Hickory",
                "Pecan",
                "Chestnut",
                "Black Locust",
                "Mulberry",
                "Fig",
                "Eucalyptus",
                "Red Gum",
                "Jarrah",
                "Karri",
                "Tasmanian Oak",
                "Ironbark",
                "Blackbutt",
                "Spotted Gum",
                "Merbau",
                "Nyatoh",
                "Lauan"
        );

        woodTypes
                .parallelStream() //very fast in large data that is the reason i took 200 woods count this can handle crores of data as well & you cannot expect the insertion order.
                .forEach(woods-> System.out.println(woods));
    }

    private static void partitioning() {
        List<Integer> numbers = Arrays.asList(1, 27, 38, 456, 578, 688, 786, 8, 9, 10);

        List<Integer> evenNo = numbers
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenNo);

        List<Integer> oddNo = numbers
                .stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println(oddNo);

        Map<Boolean, List<Integer>> collect = numbers
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

        Map<Boolean, List<Integer>> collect1 = numbers
                .stream()
                .collect(Collectors.partitioningBy(n -> n > 27));
        System.out.println(collect1);
    }

    private static void flatMaps() {
        List<List<String>> states = new ArrayList<>();

        states.add(Arrays.asList("Andhra Pradesh", "Amaravati"));
        states.add(Arrays.asList("Bihar", "Patna"));
        states.add(Arrays.asList("Gujarat", "Gandhinagar"));
        states.add(Arrays.asList("Himachal Pradesh", "Shimla", "Dharmshala"));
        states.add(Arrays.asList("Jharkhand", "Ranchi"));
        states.add(Arrays.asList("Maharashtra", "Mumbai"));
        states.add(Arrays.asList("Odisha", "Bhubaneswar"));
        states.add(Arrays.asList("Telangana", "Hyderabad"));
        states.add(Arrays.asList("Tamil Nadu", "Chennai"));

        System.out.println(states);

        //Flat Map

        List<String> flattenedList = states
                .stream()
                .flatMap(s -> s.stream())//this is mandatory
                .toList();
        System.out.println(flattenedList);
    }

    private static void matches() {
        List<Double> divByFive = Arrays.asList(10.0, 25.0, 30.0, 40.0, 50.0,
                15.0, 75.0, 80.0, 90.0, 100.0);
        boolean allMatch = divByFive
                .stream()
                .mapToDouble(n -> n)
                .allMatch(n -> n % 5 == 0);
        System.out.println(allMatch);


        List<Integer> anyMatch = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 88, 9);

        boolean anyMatchDigits = anyMatch
                .stream()
                .mapToInt(n -> n)
                .anyMatch(n -> n % 8 == 0);
        System.out.println(anyMatchDigits);
    }

    private static void aggregateFunctions() {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        int sum = nums
                .stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

        int max = nums
                .stream()
                .mapToInt(n -> n)
                .max()
                .getAsInt();
        System.out.println(max);

        int min = nums
                .stream()
                .mapToInt(n -> n)
                .min()
                .getAsInt();
        System.out.println(min);

        double average = nums
                .stream()
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(average);

        //find count of factors of 6

        List<Integer> countOfFactorsOfsix = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 12,98,654,36,458,1600,1616,48,64,72);

        long count = countOfFactorsOfsix
                .stream()
                .filter(n -> n % 6 == 0)
                .count();
        System.out.println(count);
    }

    private static void hashMapOperations() {
        /***Streaming on maps - entrySet() is must then only it is possible.***/
        Map<String, String> names = new HashMap<>();

        names.put("Sunil Chettri", "India");
        names.put("Ronaldo", "Portugal");
        names.put("Messi", "Argentina");
        names.put("MBappe", "France");
        names.put("Lautaro Martinez", "Argentina");
        names.put("Neymar Jr.", "Brazil");
        names.put("Enzo Fernandez", "Argentina");
        names.put("Lamine Yamal", "Spain");

        names
                .entrySet()
                .stream()
                .filter(e -> e.getValue().equals("Argentina"))
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        Set<String> countries = names
                .entrySet()
                .stream()
                .map(e -> e.getValue())
                .collect(Collectors.toSet());
        System.out.println(countries);

        names
                .keySet()
                .stream()
                .forEach(key -> System.out.println(key)); //we can print keys like this also.

        names
                .values()
                .stream()
                //.distinct() to skip duplicates.
                .forEach(value -> System.out.println(value));

        /*We can collect data into map as well:*/

        Map<String, String> collect = names
                .entrySet()
                .stream()
                .filter(e -> e.getValue().equals("Argentina"))
                .collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue()));
        System.out.println(collect);
    }

    private static void mapOperations() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //all values should be doubled.

        //map- intermediate operation.

        List<Integer> list = nums
                .stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(list);

        //Given a list of numbers, increment all values by 4, and return top 2 values in a list which are multiples of 5.

        List<Integer> numbers = Arrays.asList(11,19,26,4,77,6);
        List<Integer> list1 = numbers
                .stream()
                .map(n -> n + 4)
                .filter(n -> n % 5 == 0)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .toList();
        System.out.println(list1);

        List<Employee> empList = new ArrayList();

        empList.add(new Employee(1,"Panjaa",69520));
        empList.add(new Employee(2,"Thammudu",45625));
        empList.add(new Employee(3,"Badri",87456));
        empList.add(new Employee(4,"Jalsa",78965));
        empList.add(new Employee(5,"Gabbar Singh",25632));
        empList.add(new Employee(6,"Teenmaar",12365));
        empList.add(new Employee(7,"They call me: OG",23655));

        List<String> empObject = empList
                .stream()
                .map(emp -> emp.getName())
                .toList();
        System.out.println(empObject);

        //increase salary by 2000.36 and get employee objects back.

        empList
                .stream()
                .map(emp -> new Employee(
                        emp.getId(),
                        emp.getName(),
                        emp.getSalary() + 2000.36
                ))
                .forEach(employee -> System.out.println(employee));

        empList
                .stream()
                .filter(emp -> emp.getName().startsWith("T"))
                .map(emp -> emp.getName())
                .forEach(emp -> System.out.println(emp));

    }
}
