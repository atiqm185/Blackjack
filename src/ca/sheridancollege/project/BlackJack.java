/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author izanr
 */
public class BlackJack extends Game {
    public BlackJack(){
        super("BlackJack");
    }
    public void play(){
        //sequence for first turn/ game setup
        Dealer dealer = new Dealer();
        
        dealer.startNewGame();
        //loop for rest of turns
    }
    public void declareWinner(){
        
    }
}
