package OOP.principles.Inheritance;

public class inheritance_example {
    double length;
    double width;
    double height;

    inheritance_example () {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    inheritance_example (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    inheritance_example (double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    inheritance_example (inheritance_example obj) {
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;
    }

    public void running() {
        System.out.println("This code is running");
    }
}

class inheritance extends inheritance_example {
    double weight;
    inheritance () {
        this.weight = 0;
    }
    inheritance (double length, double width, double height) {
        super(length, width, height);
    }

    inheritance (double length, double width, double height, double weight) {
//        this.length = length;
//        this.width = width;
//        this.height = height;

        super(length, width, height); // calling parent class constructor
        // it should be the first line in child class because child class cares about the parent class
        this.weight = weight;
    }
}

class box extends inheritance {
    int cost;
    box () {
        super();
        this.cost = 0;
    }
    box (int l, int w, int h, int weight, int cost) {
        super(l,w,h, weight);
        this.cost = cost;
    }
}





