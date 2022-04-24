/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author izanr
 */
public class UserPlayer extends Player{
    private ArrayList<NumberCard> hand = new ArrayList<>();
    private int wallet = 1000;
    private int bet;
    
    UserPlayer(int playerBet){
        super("Player");
        this.bet = playerBet;
        this.wallet -= playerBet;
    }
    
    public void doubleDown(){
        //code
    }
    public void surrender(){
        System.out.println("You have surrendered!");
    }
    public void hit(){
        this.draw();
        this.showHand();
        //check for bust or win
    }
    
    public void play(){
        Scanner in = new Scanner(System.in);
        int input = 0;
        try{
            while(!(input > 0 && input < 5)){
                this.showHand();
                System.out.println("--------------------");
                System.out.println("Enter a number 1-4 to pick an option");
                System.out.println("1: Hit");
                System.out.println("2: Stay");
                System.out.println("3: Double Down");
                System.out.println("4: Surrender");
                System.out.println("Your wallet: " + this.wallet);
                input = in.nextInt();
            }
        }
        
        catch(Exception e){
            System.out.println("Please enter a valid Integer value");
        }
        
        switch(input){
        case 1:
            hit();
            break;
        case 2:
            System.out.println("You chose to stay!");
            break;
        case 3:
            doubleDown();
            break;
        case 4:
            surrender();
            break;
        }
    }
    
    public void showHand(){
        System.out.println("Your Hand:");
        for(NumberCard e: hand){
            System.out.println(e.toString());
        }
    }
    public boolean canPlay(){
        return this.getHandValue() <= 21;
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
