/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Authors: Muhammad Atiq, Juan Rios,  Bonita Li,Divya Srinivasan
 * Date:
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player{

    //instance of deck, used for drawing cards
    Deck deck = new Deck();
    
   private String name; //the unique name for this player

   /**
    * A constructor that allows you to set the player's unique ID
    *
    * @param name the unique ID to assign to this player.
    */
   public Player (String name)
   {
      this.name = name;
   }

   /**
    * @return the player name
    */
   public String getName ()
   {
      return this.name;
   }

   /**
    * Ensure that the playerID is unique
    *
    * @param name the player name to set
    */
   public void setName (String name)
   {
      this.name = name;
   }
   
   public NumberCard getCard(){
       return deck.getRandom();
   }

   /**
    * The method to be overridden when you subclass the Player class with your
    * specific type of Player and filled in
    * with logic to play your game.
    */
   public abstract void play ();
//
}
