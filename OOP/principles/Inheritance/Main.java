package OOP.principles.Inheritance;

public class Main {
    public static void main(String[] args) {
        inheritance_example inherit = new inheritance_example(9.9, 8.8, 7.7);
        inheritance_example inherit1 = new inheritance_example(inherit);
//        System.out.println(inherit.height + " " + inherit.width + " " + inherit.length);
//        System.out.println(inherit1.height + " " + inherit1.width + " " + inherit1.length);

        inheritance i1 = new inheritance();
        inheritance i2 = new inheritance(2,3,4,5);
//        System.out.println(i2.length + " " + i2.width + " " + i2.height + " " + i2.weight);

//        inheritance_example i3 = new inheritance(2,3,4,5);
//        System.out.println(i3.length);

//        inheritance i4 = new inheritance_example(3,4,5);
//        System.out.println(i4.weight);


      box b1 = new box();
      box b2 = new box(2,3,4,5,6);
        System.out.println(b1.cost);
        System.out.println(b2.length + " " + b2.weight + " " + b2.height + " " + b2.cost + " " + b2.weight);

    }
}
