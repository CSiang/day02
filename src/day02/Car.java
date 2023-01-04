package day02 ;

public class Car{

    // These are members
    private String registration;
    private String colour;
    private int year;
    private boolean started;

    // COnstructors
    public Car(){
        // default constructor
        this.colour = "white"; // This means when car is created, default color is white.
    }

    public Car(String colour, String registration) {
        this.colour = colour;
        this.registration = registration;
    }

    // Getters and setters
    public String getRegistration() {return this.registration;}
    public void setRegistration(String r) {
        this.registration = r;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isStarted() {
        return started;
    }

    // methods
    public void start() {
        this.started = false;
    }

    public void getOutOfMyWay() {
        System.out.println("HONK......................");
    }

    










}