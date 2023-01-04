package day02;

public class carMain {
    
    //entry point
    public static void main(String args[]){
        //Instantiate a instance of car
        Car c = new Car();
        c.setColour("grey");
        c.setRegistration("sdf1234B");
        c.start();
        System.out.printf("Is the car started? %b\n", c.isStarted());

        c.getOutOfMyWay();

        Car d = new Car();
        d.setColour("red");
        d.setRegistration("wtf5241a");
        System.out.printf("Colour of my car? %s\n", d.getColour());
        System.out.printf("Is the car started? %b\n", d.isStarted());

        Car e = new Car("black", "s1234c");
        System.out.printf("Colour of my car? %s\n", e.getColour());
        System.out.printf("This is the registration %s\n", e.getRegistration());



    }




}
