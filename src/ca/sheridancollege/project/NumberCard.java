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
        return value + " of " + suit;
    }
}