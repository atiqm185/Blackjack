/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author izanr
 */
public class NumberCard extends Card{
    String suit;
    int value;

    public NumberCard(String suit, int value) { //NumberCard constructor
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() { //toString method for NumberCard
        switch(this.value){
            case 11:
                return "Jack" + " of " + suit;
            case 12:
                return "Queen" + " of " + suit;
            case 13:
                return "King" + " of " + suit;
            default:
                return value + " of " + suit;
        }
    }
    
    public int getValue(){
        return this.value;
    }
    
    public String getSuit(){
        return this.suit;
    }
}