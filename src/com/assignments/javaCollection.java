package com.assignments;
import java.util.*;
public class javaCollection {

    public static void main(String[] args) {
        // TODO code application logic here

        // ArrayList example
        List family = new ArrayList();
        family.add("Nelson (37)");
        family.add("Queen (32)");
        family.add("Thywill (30)");
        family.add("David (28)");
        //family.add();
        System.out.println("\n\nLists Example: \n");
        System.out.println("My Parents' Children");

        Iterator kids = family.iterator();
        while(kids.hasNext()) {
            Object element = kids.next();
            System.out.print(element + "\n");
        }

        System.out.print("\n");

        // Set example
        System.out.println("Set Collections Example");
        int advance[] = {2,9,4,0,3,1,5};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            set.add(advance[i]);
        }
        System.out.println(set + "\n");

        //  Map example with Prophets of the Church
        System.out.println("HashMap Example");
        Map prophetMap = new HashMap();
        prophetMap.put("Joseph Smith Jr.", "1830 - 1844");
        prophetMap.put("Brigham Young", "1847 - 1877");
        prophetMap.put("John Taylor", "1880 - 1887");
        prophetMap.put("Wilford Woodruff", "1889 - 1898");
        prophetMap.put("Lorenzo Snow", "1898 - 1901");

        System.out.println("The presidents of the Church are: \n");

        prophetMap.forEach((k,v) -> System.out.println("President - " + k
                + ", Presided from " + v + "\n"));

        // Tree example
        System.out.println("TreeSet Example. Now With Actual Trees!");
        TreeSet baum = new TreeSet();
        baum.add("Magnolia");
        baum.add("Elm");
        baum.add("Pecan");
        baum.add("Pine");
        baum.add("Maple");
        baum.add("Wysteria");
        baum.add("Aspen");

        Iterator list = baum.iterator();
        while(list.hasNext()) {
            Object element = list.next();
            System.out.print(element + "\n");
        }

        // Queue example
        System.out.println("\nQueue Example. With birds in Africa.");
        Queue<String> africanBirds = new LinkedList<>();

        africanBirds.add("Lilac-breasted Roller");
        africanBirds.add("Coppery-tailed Coucal");
        africanBirds.add("Golden Weaver");
        africanBirds.add("Striped Kingfisher");
        africanBirds.add("Blacksmith Plover");
        africanBirds.add("African Fish Eagle");
        africanBirds.add("Superb Starling");
        africanBirds.add("Maribu Stork");
        africanBirds.add("Maribu Stork");
        africanBirds.add("Black-headed Heron");


        africanBirds.forEach(name -> {
            System.out.println(name);
        });

    }
}
