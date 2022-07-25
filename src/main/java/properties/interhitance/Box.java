package properties.interhitance;

public class Box {
    private double l; //anything private means that it cannot be accessed from he child class
    //it cannot even be accessed from other files.

    double h;
    double w;
    double weight;

    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box (double side) {
        super();
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
