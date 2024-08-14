package OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class Polymorphism {
    public static void main(String[] args) {
//        Shapes obj1 = new circle();
//        Shapes obj2 = new square();
//        obj1.area();
//        obj2.area();


    }
}

class Shapes {
    public void area() {
        System.out.println("calculates area of a given shape");
    }
}

class circle extends Shapes {
    public void area() {
        System.out.println("Area id pi * r * r");
    }
}

class square extends Shapes {
    @Override  // this is annotation used to check whether a method is overridden or not
    public void area() {
        System.out.println("Area is side * side ");
    }
}
