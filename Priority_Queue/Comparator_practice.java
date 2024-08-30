package Priority_Queue;

import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if(p1.age < p2.age)
          return -1;
        if(p1.age == p2.age)
            return 0;
        return -1;
    }
}
public class Comparator_practice {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addFirst(8);
        deque.addLast(7);

        for(int num : deque)
            System.out.print(num);

        System.out.println(deque.offer(9));

        for(int num : deque)
            System.out.print(num);


//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("Vishnu", 20));
//        people.add(new Person("Anju", 25));
//        people.add(new Person("Varalakshmi", 51));
//        people.add(new Person("land", 5));
//
//        Collections.sort(people, new AgeComparator());
//
//        for(Person p : people)
//            System.out.println(p.name + " " + p.age);
    }
}
