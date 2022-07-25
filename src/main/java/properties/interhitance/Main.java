package properties.interhitance;



        public class Main {
            public static void main(String[] args) {
                Box box1 = new Box(4.6, 7.9, 9.9);
                Box box2 = new Box(box1);
                //System.out.println(box1.l); - this can't be written as l is a private property of the Box class.
                Box box5 = new BoxWeight(2,3,4,8); //Box box5 is the reference variable while the BoxWeight is the type of object

                //It depends on the type of reference variable and not o the type of the reference that determines what members can be accessed.

                System.out.println(box5.w); //that is why box5 is able to access the members of the Box class and not of the BoxWeight class
                //BoxWeight box6= new Box(2,3,4); this can't be done because the child class is now the reference variable
                // and the parent class is the object then how can you call the constructor of the child class?
                //the parent class has no idea about the downward classes, but the below classes know what is above them.




            }
        }

