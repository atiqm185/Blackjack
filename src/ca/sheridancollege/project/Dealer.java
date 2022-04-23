/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author izanr
 * Date:22/04/2022
 */
public class Dealer extends Player{
    
    private ArrayList<NumberCard> hand = new ArrayList<>();
    public Dealer(){
        super("dealer");
    }
    
    public void startNewGame(){
        this.draw();
        this.draw();
        System.out.println("New Game Started!");
        this.showHand();
    }
    
    public void showHand(){
        System.out.println("Dealers Hand:");
        for(NumberCard e: hand){
            System.out.println(e.toString());
        }
    }
    //method to take dealer's turn
    @Override
    public void play(){
        if(this.getHandValue() < 17){
            this.draw();
            this.showHand();
        }
        else{
            System.out.println("Dealer stands...");
            this.showHand();
        }
    }
    
    public boolean canPlay(){
        return this.getHandValue() < 21;
    }
    
    public int getHandValue(){
        int value = 0;
        for(NumberCard e: hand){
            if(e.getValue() > 10){
                value += 10;
            }
            else{
                value += e.getValue();
            }
        }
        return value;
    }
    
    public void draw(){
        this.hand.add(super.getCard());
    }
}
