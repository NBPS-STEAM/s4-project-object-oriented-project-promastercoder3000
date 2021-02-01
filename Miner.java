import java.util.ArrayList; // we import this class
// to create an arraylist that unlike an array, CAN BE resized,
// and so we can add items to the player's inventory.
import java.util.Random; // class that is imported to generate random values through insantiated random objects 

public class Miner{
  // the private keyword makes an attribute, method, variable, only accessable within the pertaining class. 
  private double wealth; // variable to represnt player's wealth
  private int shipHealth; //player's health when fighting the moles ( underground animals)
  private int weightInPounds; //weight of materials
  private static int numMiners;
  private int shipArmor;
  public ArrayList<String> playerInventory = new ArrayList<String>(); // we've created an array list that represents our player's inventory.
  
  public Miner(){    
    //here, we create the constructor for the class, setting our appropiate variables with their default values.
    shipHealth = 100;
    wealth = 0;
    weightInPounds = 0;
    numMiners ++;
  }
  
  public Miner(int playerShipArmor){
    wealth = 0;
    weightInPounds = 0;
    shipHealth = 100 + shipArmor;
    shipArmor = playerShipArmor;
    numMiners ++;
    System.out.println("(For each iteration of the game, you will gain additional health to your ship, which essentially forms a protective armor for the ship. This will allow you to survive longer, which is very beneficial. At the moment, you will gain additional health (armor) of: " +  playerShipArmor);
  }


  public static int getNumMiners(){
    return Miner.numMiners;
  }
  
  public void setHealth(){ 
      // this method is for taking damage to the player's machine, which is a side struggle of the game that the player must worry about.
    System.out.println("Machine: Mole spotted! Ahh!");
    Auxiliary.delayTime(3000);
    shipHealth = shipHealth - 10; // take away 10 from the set health of the player, which is set to 100 in the App class.
    System.out.println("Machine: The mole has clawed at me and drained 10% of my battery. I'm now at " + shipHealth + " health left!\n Please be careful, or we'll both be stuck and buried within the dirt of the Earth, unable to move!"); //print out player's health after they're damaged.
  }

  public void setWealth(int amount)
  {
      wealth = wealth + amount;
  }
  
  public void setWeightInPounds(int amount)
  {
    weightInPounds = weightInPounds + amount;
  }

  public void getStats()
  {
    // here we will print out the object's arraylist, which represents the inventory of the player,
    // as well as the variables wealth and weightInPounds, which represent the player's current statistics ( how much money they have and how much their inventory weighs)
    System.out.println("Machine: Now, here is everything in our container. " + playerInventory); // print out the user's arraylist ( a side feature of the game to showcase their progress)
    Auxiliary.delayTime(1000);
    System.out.println("Machine: Our current net worth is: " + wealth + " dollars"); // print out the user's money stored in the integer variable wealth ( so we can demonstrate how much money the user has and how far away they are from getting the $15 requisite to win the game
    Auxiliary.delayTime(1000);
    System.out.println("Machine: The weight in pounds of our container is " + weightInPounds + " pounds"); // print out the integer variable weightinpounds to demonstrate the weight in pounds of the user's inventory and how far away they are from getting the requisite 200 pounds to win the game
    Auxiliary.delayTime(1000);
    System.out.println("Machine: We are at " + shipHealth + " health left."); // print out how much health the machine( basically the player) has to show how far away they are from dying ( if it hits 0 they die and lose the game.)
    Auxiliary.delayTime(3000);
  }

  
  public void setHealthOrFindMaterial() { // here we'll either take damage to the player or find a material for the player's inventory and increase the wealth all based on a randomly generated number.
   Random rand = new Random(); // instantiate an object called "rand" from the random class 
   int randNumber = rand.nextInt(3); // create an integer variable called randNumber that generates a random number from, by default, 0, up to, but not including, the specified number within the parenthesis, which in this case, is 2. There are three possible numbers that can be randomly generated: 0, 1, and 2.
   if (randNumber == 0){ // if 0 is the number generated, we call the findRandMaterial() method, to find a random material for the user.
     Minerals.findRandMineral(this); 
   }
   else if (randNumber == 1){ // else if randnumber is 1, then we take damage to the user's ship by calling the setHealth() method.
     setHealth();
   }
   else{ // this else statement is called when 0 and 1 have not been generated ; essentially, this is the case when 2 has been generated. however, i have chosen to end this series of statemenets in an else statement rather than an else if statement due to personal preferences, but it is 100% fine to end it with an else if statement.
     System.out.println("Machine: False alarm. Nothing here to dig... Oh well....");
     Auxiliary.delayTime(3000);
   }
  }
  
  public boolean checkRequirementsToWin(){  //here, we'll check for a net worth of 15 dollars, 200 pounds in weight of materials. 
    if(wealth >= 15 && weightInPounds >= 200){ // we use a compound and statement to determine whether the user has achieved a net worth of 15 dollars and 200 pounds in weight worth of material. if this is true, the method will return true, and this boolean value will be used to tell the user they've won the game.
      return true; // return true if above condition is true.
    }
    else
    {
      return false; // return false is above condition is NOT true; therefore, nothing will really happen.
    }
}

public boolean checkShipHealth(){
  if (shipHealth <= 0){ // if the player's health hits 0 or goes less than that, this method returns false. we will be using this method to determine if the user's machine has reached 0 health, meaning they've lost.
    return true; // return true if the above condition is true
  }
  else {
    return false; // return false if the player's health has not hit 0, and the method essentially does nothing.
  }
}


}

//Thread.sleep(4000); counted in milliseconds

//To win,
 //you need:
//a net worth of fifteen dollars, 
// 200 pounds ( in weight ) worth of items to win.