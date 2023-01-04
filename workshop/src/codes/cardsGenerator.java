package codes;

import java.util.ArrayList;

public class cardsGenerator {

    ArrayList<card> cards = new ArrayList<card>();

    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suits = {"Club", "Spade", "Diamond", "Heart"};

    for (int i=0; i<suits.length; i++) {
        for (int j = 0; j< values.length; j++){
            this.cards.add(new card(suits[i],values[j]));
        }






    }



    for (int i = 0; i<52; i++) {
        String name = Integer.toString(i);
        cards name =  





    }
}
