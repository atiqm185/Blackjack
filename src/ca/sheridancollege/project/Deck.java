/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.*;

/**
 *
 * @author izanr
 */
public class Deck extends GroupOfCards{
    String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
    int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    
    public Deck(){
        super(52);
        assignCards();
    }
    
    public void assignCards(){ //Deck of cards is created
        int index = 0;
        for (int i=0; i<suit.length;i++){
            for(int j=0; j<value.length; j++){
                this.cards.add(new NumberCard(suit[i],value[j]));
                index++;
            }
        }
        shuffleCard();
    }
        
    public void shuffleCard(){ //Cards are shuffled
        Collections.shuffle(this.cards);
    }
    
    public NumberCard getRandom(){
        int rand = (int)(Math.random() * (this.cards.size()-1));
        return this.cards.get(rand);
    }
}