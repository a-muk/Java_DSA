package properties.interhitance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//here we are able to use l becoz Box(double l, double h, double w) constructor is getting called.
        this.weight = weight;
        System.out.println(super.weight); //like "this.h" - then why are we using super()?
        //-becoz super keyword is used to explicitly search for the members there in the superclass. So, if you have entered the same variable
        //in the parent class, super.<name of variable> will be used to access the variables which are there in the parent class only.
    }
    //what is the super keyword?
    //super keyword basically is used to refer to the members of the above classes. It also works in multilevel classes where
    //you have classes which are child classes of one and so on. (multilevel inheritance)

    //but what if you use super() keyword in the parent class? It will not show an error becoz every class is a child class of Object() class;
    //super keyword can be used like this keyword/

    //think about the parent class as an illegitimate parent of a child which he/she now doesn't care about becoz that child was
    //born under casual encounters.
    // so the child contains the qualities of the parent but the parent doesn't care about it.

}

