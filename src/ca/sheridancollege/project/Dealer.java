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
        this.hand.add(super.getCard());
        this.hand.add(super.getCard());
        System.out.println("New Game Started!");
    }
    public void showHand(){
        System.out.println("Dealers Hand:");
        for(NumberCard e: hand){
            System.out.println(e.toString());
        }
    }
    //method to take dealer's turn
    public void play(){
        
    }
}
