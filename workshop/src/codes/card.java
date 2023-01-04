package codes;

public class card {
    
    // Members
    private String suit;
    private String val;

    //Constructors
    public card (String suit, String val) {
        this.suit= suit;
        this.val = val;
    }

    // Getters and starters
    public String getSuit() {return this.suit;}
    public void setSuit(String s) {this.suit = s;}

    public String getVal() {return this.val;}
    public void setVal(String v) {this.val = v;}

}
