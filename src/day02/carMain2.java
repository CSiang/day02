package day02;

public class carMain2 {
    public static void main(String args[]) {

        Porche p = new Porche();
        
        Car c = new Porche("yellow","S1234z");

        System.out.printf(">>>> c.registration: %s0, %s\n", c.getRegistration(), c.getColour());

        p = (Porche)c; // This is called casting
        p.accelerate();

        System.out.printf(">>>> p.registration: %s, %s\n", p.getRegistration(), p.getColour());











    }
    
}
