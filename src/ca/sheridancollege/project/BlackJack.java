/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author izanr
 */
public class BlackJack extends Game {
    public BlackJack(){
        super("BlackJack");
    }
    @Override
    public void play(){
        //gettign initial bet value from user
        int bet = 0;
        Scanner input = new Scanner(System.in);
        //validation using try catch in case of exceptions
        try{
            System.out.println("Please enter a starting bet between 1-1000.");
            bet = input.nextInt();
            if(!(bet > 0 && bet <= 1000)){
                System.out.println("Please enter a valid value that is in range.");
            }
        }
        catch(Exception e){
            System.out.println("Please input a valid Integer.");
        }
        //sequence for first turn/ game setup
        Dealer dealer = new Dealer();
        dealer.startNewGame();
        UserPlayer user = new UserPlayer(bet);
        user.draw();
        user.draw();
        //loop for rest of turns
        while(user.canPlay() && dealer.canPlay()){
            user.play();
            if(user.canPlay()){
                dealer.play();
                if(!dealer.canPlay()){
                    declareWinner(1);
                }
            }
            else{
                declareWinner(0);
            }
        }
    }
    public void declareWinner(int num){
        //print winner
        if(num == 0){
            System.out.println("Dealer wins!");
            System.exit(0);
        }
        else{
            System.out.println("Player wins!");
            System.exit(0);
        }
    }
}
