/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 *
 * @author izanr
 */
public class UserPlayer extends Player{
    private ArrayList<Card> hand;
    private int wallet = 1000;
    private int bet;
    UserPlayer(int playerBet){
        super("Player");
        this.bet = playerBet;
    }
    public void splitHand(){
        //code
    }
    public void doubleDown(){
        //code
    }
    public void surrender(){
        //code
    }
    public void play(){
        
    }
}
