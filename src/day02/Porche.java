package day02;

public class Porche extends Car {
    
    private String turbo;
    private int accelerate;
    
    public Porche () {
        setColour("red");    
    }
    
    public Porche(String colour, String registration){
        setColour(colour);
        setRegistration(registration);
    }

    public String getTurbo (){ return turbo;}

    // I can no longer change the color of the car once it has been instatiated.
    @Override // This @Override is called a annotation
    public void setColour(String c) {}

    public void accelerate() {
        this.accelerate++;
        if (this.accelerate > 4) {
            this.turbo = "on";
        }
    }


}
