/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author izanr
 */
public class Client {
    public static void main(String[] args) {
        Dealer deal = new Dealer();
        deal.startNewGame();
        deal.showHand();
    }
}
