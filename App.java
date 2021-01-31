import java.util.*; // we will be using scanner objects, so this is important to import.

public class App {

    public static void delayTime(int timeInMs){ 
      //this method will be accessed in other classes as well.
        try{
          Thread.sleep(timeInMs); // Thread.sleep() pauses the execution of the program for a prescribed amount of time. Thread. followed by the "sleep" function, is the first step in delaying a program's execution. Parenthesis are then added at the end, where you put a certain amount of time ( in milliseconds ) to pause the running of the program. 1000 milliseconds is equal to 1 second, and there is a one-second pause between each line of dialogue; meanwhile, 500 milliseconds is 0.5 seconds ( half a second ). 3000 milliseconds will turn out to be 3 seconds, while 2000 milliseconds will turn out to be 2 seconds.
        }
        catch(InterruptedException ie){ //  "InterruptedException" is thrown from thread.sleep() in this program when it's called; therefore, we must catch the exception by any means, even if no errors have occured.
          ;
        }
      }

    // THROUGHOUT THE CODE, WE WILL BE CALLING THE DELAYTIME() METHOD TO DELAY EXECUTION OF THE PROGRAM FOR MAINLY DIALOGUE PURPOSES AND SOME SENSE OF REALISM.
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean loopVar = true;
      while(loopVar){ // Everything is in THIS while loop
        // start of first nested while loop
        Miner MinerObj = new Miner(100, 0.0, 0);  // create our "Miner" object, which is the player.
        while(true){ // this while loop will pretty much start the game, ask the player to say yes or no, adds to sophistication     
          System.out.println("(Welcome to the game! You'll be embarking on a mining mission.)"); // This while loop consists of many "System.out.println" statements that add to the sophistication of the game by introducing simple and basic dialogue.
          delayTime(3000); // calling the delayTime function, substituting 1000 into the parenthesis.
          System.out.println("(To win, you need to not only acquire a net worth of fifteen dollars, but you also need 200 pounds ( in weight ) worth of items to win.)");
          delayTime(3000);
          System.out.println("(Sounds hard? Well, that's life. Let's get started!)");
          delayTime(3000);
          System.out.println("(The game has begun, and Miner Dawson meets you at the mining station.");
          delayTime(3000);
          System.out.println("Miner Dawson: Greetings, fellow miner.");
          delayTime(3000);
          System.out.println("Miner Dawson: We've built a brand-new 'Dirt-Stone Digging Machine' for you. It can speak and burrow through the Earth quicky and efficiently. Would you like to hop in and go on a.. ");
          delayTime(4000);
          System.out.println("Miner Dawson: Mining trip!?!?!");
          while(true){ // nested while loop, will keep on repeating until the player says "Yes". they don't have any other option because the purpose of this program is for the user to mine through the ground. 
            System.out.println("(For the essentiality of the game, type 'Yes' or 'No'.) ");
            String answer = input.nextLine(); // referring back to the scanner object we created on line 5, we first create a string variable called "answer", then, using the nextLine() method from the scanner class, we enact this method upon the "input" object we had instantiated, opening up a way for us to collect a string-type input from the user which will answer 
            if (answer.equalsIgnoreCase("yes")){ // user might forget to capitalize, which is okay, as long as they spell "yes" correctly.
              delayTime(3000);
              System.out.println("Miner Dawson: Alright, let's go!");
              break; // while loop finishes reiterating once "break" is called. ( this only applies towards the nested while loop, not the parent or the parent's parent while loop themselves.) Once the user has answered yes, the dialogue ceontinues.
            }
          
            else if (answer.equalsIgnoreCase("no")){ // user might type no ( for whatever reason), and whether it is capitalized or not, the program offers a humorous response back, and the while loop continues to reiterate.
              delayTime(3000);
              System.out.println("Miner dawson: That's cool and all, but I'm gonna ask again.");
            }
            else {
              System.out.println("(You must have made a spelling mistake. Make sure you typed 'Y-e-s' or 'N-o'.)"); // if the user has made a spelling mistake, this else statement will execute, where the program states that the user has made a spelling mistake, where they are redirected towards inputting a yes/no to the question asked.
            }
          }
          delayTime(3000); // back to regular dialogue
          System.out.println("Miner Dawson: Step into the ship, and go from there.");
          delayTime(3000);
          System.out.println("(The ship's doors open, and you take a step into the tight, although oddy comfortable, space, and sit in a black, leather chair in front of a glass window.)");
          delayTime(3000);
          System.out.println("(The ship's door closes, and the machine begins speaking to you.");
          delayTime(3000);
          System.out.println("Machine: Hello. I have not been given a name yet, but you can call me Machine. ");
          delayTime(3000);
          System.out.println("Machine: I've been programmed by Mr. Dawson to take you on a little adventure. I've been ordered not to take you back up to the station until we get $15 as well as 200 pounds of materials. Apologies for the immediate and rapid lanch, but we are in a hurry. So, we will venture in three. two.. one.. ");
          delayTime(4000);
          System.out.println("(A hatch in the stadium's floor opens, and the ship begins digging through aggressively.)");
          delayTime(3000);
          System.out.println("Machine: Dawson did not mention this, but there are dangerous, sneaky moles inside the dirt. Please be careful, because I don't want to get damaged, for us machines have feelings too. I also was not programmed to say these exact words.");
          delayTime(5000);
          System.out.println("(Dirt and soil stain your window as you make your way through underground tunnels.)");
          delayTime(2000);
          System.out.println("Machine: I am sure you are familiar with the value and weight of materials. However, I have been programmed to inform you that each bronze block carries $1 worth of goods and weighs 12 pounds, each silver block carries $2 worth of goods and weighs 24 pounds, each gold block carries $4 worth of goods and weighs 48 pounds, and each diamond block carries $8 worth of goods and weighs 96 pounds.");
          delayTime(7000);
          System.out.println("(Although much information has been thrown at you, you slowly, but surely, grasp everything that has been said as the ship shakes while digging through the dirt and soil. You start to hear rumbling, and the subtle smirk on your face assures you that your journey has just truly begin now.");
          delayTime(5000);
          break; // this ends the nested while loop.
      }
    // end of first nested while loop
    // __________________________
    // start of second nested while loop
        while(true){
            System.out.println("Machine: I have located a bump swelling in size within the dirt-wall of the tunnel. Shall we approach it?");
            while(true){ // nested while loop, will keep on repeating until the player says "Yes". they don't have any other option because the purpose of this program is for the user to mine through the ground. 
              System.out.println("(For the essentiality of the game, type 'Yes' or 'No'.) ");
              String answer = input.nextLine(); // referring back to the scanner object we created on line 5, we first create a string variable called "answer", then, using the nextLine() method from the scanner class, we enact this method upon the "input" object we had instantiated, opening up a way for us to collect a string-type input from the user which will answer 
              if (answer.equalsIgnoreCase("yes")){ // user might forget to capitalize, or might capitalize wrong letters, which is okay, as long as they spell "yes" correctly.
                delayTime(3000);
                System.out.println("Machine: Affirmative. Approaching...");
                MinerObj.takeDamageOrFindMaterial();
                break;
              }
              else if (answer.equalsIgnoreCase("no")){ // user might type no ( for whatever reason). (capitalization doesnt matter)
                delayTime(3000);
                System.out.println("Machine: Okay, we will bail out. You are quite a boring one.");
                delayTime(3000);
                System.out.println("(The ship starts to accelerate and looks for the next indicator of an object within the tunnel.)");
                delayTime(3000);
                break;
                // while loop finishes reiterating once "break" is called. ( this only applies towards the nested while loop, not the parent or the parent's parent while loop themselves.) Once the user has answered yes, the game continues.
              }
              else {
                System.out.println("(You must have made a spelling mistake. Make sure you typed 'Y-e-s' or 'N-o'.)"); // if the user has made a spelling mistake, this else statement will execute, where the program states that the user has made a spelling mistake, where they are redirected towards inputting a yes/no to the question asked.
              }
          }
            delayTime(3000);
            if(MinerObj.checkPlayerHealth() == true){
              System.out.println("Machine: Uh... oh..");
              delayTime(2000);
              System.out.println("Machine: Poweri..ng.. d..ow...n...");
              delayTime(3000);
              System.out.println("(Your ship breaks down in the Earth's dirt interior, and you remain stuck there for a long time..)");
              delayTime(3000);
              break;
            }
            else if(MinerObj.checkRequirementsToWin() == true){
              System.out.println("Machine: We have acquired the expected net worth from our materials, which is $15, and the expected total weight in pounds of our inventory, which is 200 pounds.");
              delayTime(3000);
              System.out.println("Machine: Good job. We will now be heading back to the station to show Mr. Dawson the resources we have collected. Hooray!");
              delayTime(3000);
              System.out.println("(You have won the game! As for how the story goes, basically, Miner Dawson sells the resources you have collected and gives you %50 of the profits made. Not too bad.");
              delayTime(3000);
              break;
            }
            delayTime(2000);
            while(true){
              System.out.println("Machine: Would you like to know your current statistics?");
              String answer = input.nextLine(); // // referring back to the scanner object we created on line 5, we first create a string variable called "answer", then, using the nextLine() method from the scanner class, we enact this method upon the "input" object we had instantiated, opening up a way for us to collect a string-type input from the user which will answer 
              if (answer.equalsIgnoreCase("yes")){ // If the user inputs yes, then the below happens. ( user might forget to captialize "yes", but as long as they spell it correctly, the program will accept the input.)
                delayTime(1000);
                MinerObj.printStats();
                break; // call the printStats() method on the object, which will print out the player's wealth, inventory, weight in pounds of their inventory, and the health of their ship.
              }
              else if(answer.equalsIgnoreCase("no")){ // if the user inputs no, then the below happens. ( user might forget to capitalize "no", but as long as they spell it correctly, the program will accept the input. )
                delayTime(1000);
                System.out.println("Machine: Okay.");
                delayTime(500); // no method on the object is called.
                System.out.println("(The machine begins to move and dig rapidly in order to find potential resources across the dirt tunnels.)");
                delayTime(3000);
                break;
              }
              else{
                System.out.println("(You must have made a spelling mistake. Make sure you typed 'Y-e-s' or 'N-o'.)"); // if the user has made a spelling mistake, this else statement will execute, where the program states that the user has made a spelling mistake, where they are redirected towards inputting a yes/no to the question asked.
              }

              }

            }
          
        System.out.println("(Would you like to restart the game?)");
        while(true){ // nested while loop
            System.out.println("(For the essentiality of the game, type 'Yes' or 'No'.) ");
            String answer = input.nextLine(); // referring back to the scanner object we created on line 5, we first create a string variable called "answer", then, using the nextLine() method from the scanner class, we enact this method upon the "input" object we had instantiated, opening up a way for us to collect a string-type input from the user which will answer 
            if (answer.equalsIgnoreCase("yes")){ // user might forget to capitalize, which is okay, as long as they spell "yes" correctly.
              delayTime(2000);
              System.out.println("(Nice! Let's get this show going again. This time, it won't be your first rodeo, so you'll breeze through the game easily! Let's restart.)");
              delayTime(3000);
              break; // while loop finishes reiterating once "break" is called. ( this only applies towards the nested while loop, not the parent or the parent's parent while loop themselves.) Once the user has answered yes, we go back to the beginning of the MAIN while loop.
            }
            else if (answer.equalsIgnoreCase("no")){ // user might type no ( for whatever reason), and whether it is capitalized or not, the program offers a humorous response back, and both the main loop and the nested while loop we are currently in will both end, as we set loopVar to false, and the loop can only run when it is set to true; additionally, we break out of this nested loop completely.
              delayTime(2000);
              System.out.println("(Okay! Have a great day then.)");
              loopVar = false; // we set the loopVar variable to false, which is the boolean variable the program is based on, so when it turns false, we are essentially ending the ENTIRE program, which is one big while loop. after we break out of this nested while loop, we will go back to the beginning of the loop, and loopVar will be set to false, so essentially, the entire program will end.
              break; // This is topped off by ending the nested while loop with a break statement.
            }
            else {
              System.out.println("(You must have made a spelling mistake. Make sure you typed 'Y-e-s' or 'N-o'.)"); // if the user has made a spelling mistake, this else statement will execute, where the program states that the user has made a spelling mistake, where they are redirected towards inputting a yes/no to the question asked.
            }
        }
        //end of the MAIN while loop.
          }
}
    }

     