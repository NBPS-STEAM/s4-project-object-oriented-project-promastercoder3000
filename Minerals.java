import java.util.Random;

public class Minerals{

  public static String[] minerals = {"Bronze", "Silver", "Gold", "Diamond", "Bronze", "Silver", "Gold", "Bronze", "Silver", "Bronze"}; /*minerals available in the game, each material has its own worth as well as weight in pounds.
   each string in the array is considered a "block" of that material type, rather than a "gram," kinda like minecraft, where you find blocks of these minerals instead of individual minerals.
   the weight and price of each is not according
   to reality, rather, to the game, so you may find a discrepancy between the value and weight of these items compared to their real-life counterparts.
   bronze = $1, silver = $2, gold = $4, and diamond = $8. essentially the value is doubled by each material.
   bronze = 12 pounds, silver = 24 pounds, gold = 48 pounds, diamond = 96 pounds */


 //method for finding bronze/silver/gold/diamond below
  // in this method, we'll have to :
  // generate a random number and find a random index
  // add the random material to the arraylist
  // increase the wealth of the player depending on material found
  // add to weight of pounds depending on material found
  // NOTICE: Each material has a different worth as well as different weight in pounds associated with the material. This is why there are different
  // increases in the integer variables "wealth" and 'weightInPounds' depending on what each material is. 
  // This is why we have incorporated if statements that check what material has been randomly generated and compares it to a certain string, as shown below.
  // An if statement turns out to be true when the element indicated by the randomly generated index of the array is equal to the string it is being compared to.
  // The program will go through each if statement until the material-specific if statement that returns true is found and executed.
  // For purposes of abstraction, all these if statements are contained within the below method. Many lines of code have been simplified into a single method
  // that we will call in the main class, App.
  //MINERAL CLASS
  public static void findRandMineral(Miner minerObj){
    Random rand = new Random(); // here we instantiate a random object that will be used in our code.
    int randItem = rand.nextInt(minerals.length); // here, we create an integer variable called randItem that generates a random number from 0
    // to the length of the array. We will use this to capture a random index from the minerals array.
    minerObj.playerInventory.add(minerals[randItem]);
    if(minerals[randItem].equals("Bronze")){ // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Bronze" 
      System.out.println("Machine: Bronze block located. $1 increase in net worth as well as a 12 pound increase in weight. Great."); // A message that is outputted each time this if statement is true (if the element is equal to "Bronze")
      minerObj.setWealth(1); // increase the value of the integer variable wealth by 1 if the if statement is true (call the modifier method on the object)
      minerObj.setWeightInPounds(12); // increase the value of the integer variable weightInPounds by 12 if the if statement is true (call the modifier method on the object)
    }
    else if (minerals[randItem].equals("Silver")){  // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Silver"
      System.out.println("Machine: Silver block located! $2 increase in networth along with 24 pounds of silver added to your inventory."); // A message outputted if the if statement is true
      minerObj.setWealth(2); // increase the value of the integer variable wealth by 2 if the if statement is true (call the modifier method on the object)
      minerObj.setWeightInPounds(24); // increase the value of the integer variable weightInPounds by 24 if the if statement is true (call the modifier method on the object)
    }
    else if(minerals[randItem].equals("Gold")){ // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Gold"
      System.out.println("Machine: Gold block located! How rare! $4 increase in net worth and 48 pounds "); // A message outputted if the if statement is true
      minerObj.setWealth(4); // increase the value of the integer variable wealth by 4 if the if statement is true (call the modifier method on the object)
      minerObj.setWeightInPounds(48); // increase the value of the integer variable weightInPounds by 48 if the if statement is true (call the modifier method on the object)
    }
    else if(minerals[randItem].equals("Diamond")){ // an if statement that checks if the element indicated by the randomly generated index of the array is equal to the string "Gold"
      System.out.println("Machine: You've spotted a whole diamond! Geez, I'm a machine and even I can feel the joy of finding this. You have increased eight dollars in net worth, and that'll be an added 96 pounds to your container. Lucky us."); // A message outputted if the if statement is true 
      minerObj.setWealth(8); // increase the value of the integer variable wealth by 8 if the if statement is true (call the modifier method on the object)
      minerObj.setWeightInPounds(96); // increase the value of the integer variable weightInPounds by 96 if the if statement is true. (call the modifier method on the object)
    }
  }
   



}